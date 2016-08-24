package com.gpdi.dataFactory.plan.mapper;

import com.gpdi.dataFactory.plan.entity.DataPlan;
import org.springframework.stereotype.Repository;


@Repository
public interface DataPlanMapper {

    int deleteByPrimaryKey(String dplid);

    int insert(DataPlan record);

    int insertSelective(DataPlan record);

    DataPlan selectByPrimaryKey(String dplid);

    int updateByPrimaryKeySelective(DataPlan record);

    int updateByPrimaryKey(DataPlan record);
}