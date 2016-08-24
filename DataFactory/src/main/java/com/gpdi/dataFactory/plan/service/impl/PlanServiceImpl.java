package com.gpdi.dataFactory.plan.service.impl;

import com.gpdi.dataFactory.plan.entity.DataPlan;
import com.gpdi.dataFactory.plan.mapper.DataPlanMapper;
import com.gpdi.dataFactory.plan.service.PlanService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 类功能描述：计划管理接口实现
 * <p/>
 * <p/>
 * 版权所有：www.gpdi.com
 * <p/>
 * 未经本公司许可，不得以任何方式复制或使用本程序任何部分
 * <p/>
 *
 * @author <a href="mailto:fgr9010287@126.com">jiangtch</a>
 * @since 2016/08/24
 */

@Service
public class PlanServiceImpl implements PlanService {

    private static Logger logger = LoggerFactory.getLogger(PlanServiceImpl.class);

    @Autowired
    private DataPlanMapper dataPlanMapper;


    /**
     * 根据ID查询计划
     *
     * @param id
     * @return
     */
    public DataPlan qryPlanById(String id) {
        logger.debug("op<qryPlanById> id-->" + id);
        return dataPlanMapper.selectByPrimaryKey(id);
    }

    /**
     * 新增一个计划
     *
     * @param dataPlan
     * @return
     */
    public int addOne(DataPlan dataPlan) {
        logger.debug("op<addOne> dataPlan-->" + dataPlan);
        return dataPlanMapper.insertSelective(dataPlan);
    }

    /**
     * 根据ID删除计划
     *
     * @param id
     * @return
     */
    public int delById(String id) {
        logger.debug("op<delById> id-->" + id);
        return dataPlanMapper.deleteByPrimaryKey(id);
    }

    /**
     * 更新
     *
     * @param dataPlan
     * @return
     */
    public int update(DataPlan dataPlan) {
        logger.debug("op<update> dataPlan-->" + dataPlan);
        return dataPlanMapper.updateByPrimaryKeySelective(dataPlan);
    }
}
