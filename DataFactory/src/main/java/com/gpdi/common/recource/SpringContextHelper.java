package com.gpdi.common.recource;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Description: Spring上下文辅助类
 * Created by Administrator on 2016/7/23.
 */
@Component
public class SpringContextHelper implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringContextHelper.applicationContext = applicationContext;
    }

    public static Object getObject(String key) {
        return applicationContext != null ? applicationContext.getBean(key) : null;
    }
}
