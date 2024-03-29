package com.lening.mapper;

import com.lening.entity.RecordBean;
import com.lening.entity.RecordBeanExample;
import com.lening.entity.SubjectBean;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface RecordMapper {
    long countByExample(RecordBeanExample example);

    int deleteByExample(RecordBeanExample example);

    int deleteByPrimaryKey(Integer rid);

    int insert(RecordBean record);

    int insertSelective(RecordBean record);

    List<RecordBean> selectByExample(RecordBeanExample example);

    RecordBean selectByPrimaryKey(Integer rid);

    int updateByExampleSelective(@Param("record") RecordBean record, @Param("example") RecordBeanExample example);

    int updateByExample(@Param("record") RecordBean record, @Param("example") RecordBeanExample example);

    int updateByPrimaryKeySelective(RecordBean record);

    int updateByPrimaryKey(RecordBean record);

    void addRecord(Date rdate, Integer rduration);
}