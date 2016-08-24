package com.gpdi.dataFactory.plan.service.impl;

import com.gpdi.dataFactory.plan.entity.DataPlan;
import com.gpdi.dataFactory.plan.mapper.DataPlanMapper;
import com.gpdi.dataFactory.plan.service.PlanService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * �๦���������ƻ�����ӿ�ʵ��
 * <p/>
 * <p/>
 * ��Ȩ���У�www.gpdi.com
 * <p/>
 * δ������˾��ɣ��������κη�ʽ���ƻ�ʹ�ñ������κβ���
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
     * ����ID��ѯ�ƻ�
     *
     * @param id
     * @return
     */
    public DataPlan qryPlanById(String id) {
        logger.debug("op<qryPlanById> id-->" + id);
        return dataPlanMapper.selectByPrimaryKey(id);
    }

    /**
     * ����һ���ƻ�
     *
     * @param dataPlan
     * @return
     */
    public int addOne(DataPlan dataPlan) {
        logger.debug("op<addOne> dataPlan-->" + dataPlan);
        return dataPlanMapper.insertSelective(dataPlan);
    }

    /**
     * ����IDɾ���ƻ�
     *
     * @param id
     * @return
     */
    public int delById(String id) {
        logger.debug("op<delById> id-->" + id);
        return dataPlanMapper.deleteByPrimaryKey(id);
    }

    /**
     * ����
     *
     * @param dataPlan
     * @return
     */
    public int update(DataPlan dataPlan) {
        logger.debug("op<update> dataPlan-->" + dataPlan);
        return dataPlanMapper.updateByPrimaryKeySelective(dataPlan);
    }
}
