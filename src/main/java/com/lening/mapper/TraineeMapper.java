package com.lening.mapper;

import com.lening.entity.TraineeBean;
import com.lening.entity.TraineeBeanExample;
import com.lening.entity.TraineeVo;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface TraineeMapper {
    TraineeVo selectTraineeVoByTid(Integer tid);

    List<TraineeVo> selectAlll();

    List<TraineeVo> getTraineeVo(String tname);

    long countByExample(TraineeBeanExample example);

    int deleteByExample(TraineeBeanExample example);

    int deleteByPrimaryKey(Integer tid);

    int insert(TraineeBean record);

    int insertSelective(TraineeBean record);

    List<TraineeBean> selectByExample(TraineeBeanExample example);

    TraineeBean selectByPrimaryKey(Integer tid);

    int updateByExampleSelective(@Param("record") TraineeBean record, @Param("example") TraineeBeanExample example);

    int updateByExample(@Param("record") TraineeBean record, @Param("example") TraineeBeanExample example);

    int updateByPrimaryKeySelective(TraineeBean record);

    int updateByPrimaryKey(TraineeBean record);

    int saveTrainee(Integer tid, Date tindate, int rduration);
}