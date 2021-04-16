package com.lening.service;

import com.lening.entity.RecordBean;
import com.lening.entity.SubjectBean;
import com.lening.entity.TraineeBean;
import com.lening.entity.TraineeVo;
import com.lening.utils.Page;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface TraineeService {
    Page<TraineeVo> getTraineeList(Integer pageNum, Integer pageSize,  TraineeVo traineeVo);

    TraineeVo toAddTrainee(Integer tid);

    void saveTrainee(Integer tid, RecordBean record);
}
