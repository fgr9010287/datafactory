package com.gpdi.dataFactory.plan.service;

import com.gpdi.dataFactory.plan.entity.DataPlan;

/**
 * 类功能描述：计划管理接口类
 * <p/>
 * <p/>
 * 版权所有：www.gpdi.com
 * <p/>
 * 未经本公司许可，不得以任何方式复制或使用本程序任何部分
 * <p/>
 *
 * @author <a href="mailto:fgr9010287@126.com">jiangtch</a>
 * @since 2016/08/23
 */

public interface PlanService {

    /**
     * 根据ID查询计划
     * @param id
     * @return
     */
    DataPlan qryPlanById(String id);

    /**
     * 新增一个计划
     * @param dataPlan
     * @return
     */
    int addOne(DataPlan dataPlan);

    /**
     * 根据ID删除计划
     * @param id
     * @return
     */
    int delById(String id);

    /**
     * 更新
     * @param dataPlan
     * @return
     */
    int update(DataPlan dataPlan);
}
