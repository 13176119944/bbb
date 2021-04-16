package com.lening.controller;

import com.lening.entity.RecordBean;
import com.lening.entity.SubjectBean;
import com.lening.entity.TraineeBean;
import com.lening.entity.TraineeVo;
import com.lening.service.TraineeService;
import com.lening.utils.Page;
import com.lening.utils.ResultInfo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/trainee")
public class TraineeController {
    @Resource
    private TraineeService traineeService;

    @RequestMapping("/getTraineeList")
    public Page<TraineeVo> getTraineeList(Integer pageNum, Integer pageSize, @RequestBody TraineeVo traineeVo){
        return traineeService.getTraineeList(pageNum,pageSize,traineeVo);
    }

    @RequestMapping("/toAddTrainee")
    public TraineeVo toAddTrainee(Integer tid){
        TraineeVo traineeVo = traineeService.toAddTrainee(tid);
        System.out.println(traineeVo);
        return traineeVo;
    }
    @RequestMapping("/saveTrainee")
    public ResultInfo saveTrainee(Integer tid, RecordBean record){
        try {
            traineeService.saveTrainee(tid,record);
            return new ResultInfo(true,"保存成功");
        }catch (Exception e){
            return new ResultInfo(false,"保存失败");
        }
    }
}
