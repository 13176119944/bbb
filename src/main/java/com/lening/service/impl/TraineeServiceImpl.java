package com.lening.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lening.entity.RecordBean;
import com.lening.entity.SubjectBean;
import com.lening.entity.TraineeBean;
import com.lening.entity.TraineeVo;
import com.lening.mapper.RecordMapper;
import com.lening.mapper.TraineeMapper;
import com.lening.service.TraineeService;
import com.lening.utils.Page;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class TraineeServiceImpl implements TraineeService {
    @Resource
    private TraineeMapper traineeMapper;
    @Resource
    private RecordMapper recordMapper;

    public Page<TraineeVo> getTraineeList(Integer pageNum, Integer pageSize, TraineeVo traineeVo) {
        PageHelper.startPage(pageNum,pageSize);
        List<TraineeVo> list = new ArrayList();
        if(traineeVo!=null){
            if (traineeVo.getTname() != null && traineeVo.getTname().length() >= 1) {
                list = traineeMapper.getTraineeVo(traineeVo.getTname());
            }else{
                list = traineeMapper.selectAlll();
            }
        }
        PageInfo<TraineeVo> pageInfo = new PageInfo(list);
        Long total = pageInfo.getTotal();
        Page<TraineeVo> page = new Page(pageNum+"",total.intValue(),pageSize+"");
        page.setList(list);
        return page;
    }

    public TraineeVo toAddTrainee(Integer tid) {
        return traineeMapper.selectTraineeVoByTid(tid);
    }

    public void saveTrainee(Integer tid, RecordBean recordBean) {
        if(recordBean!=null){
            if(recordBean.getRdate()!=null&&recordBean.getRduration()!=null){
                recordMapper.addRecord(recordBean.getRdate(),recordBean.getRduration());
            }

        }
    }
}
