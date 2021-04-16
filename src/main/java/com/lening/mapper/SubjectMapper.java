package com.lening.mapper;

import com.lening.entity.SubjectBean;
import com.lening.entity.SubjectBeanExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SubjectMapper {
    long countByExample(SubjectBeanExample example);

    int deleteByExample(SubjectBeanExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(SubjectBean record);

    int insertSelective(SubjectBean record);

    List<SubjectBean> selectByExample(SubjectBeanExample example);

    SubjectBean selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") SubjectBean record, @Param("example") SubjectBeanExample example);

    int updateByExample(@Param("record") SubjectBean record, @Param("example") SubjectBeanExample example);

    int updateByPrimaryKeySelective(SubjectBean record);

    int updateByPrimaryKey(SubjectBean record);
}