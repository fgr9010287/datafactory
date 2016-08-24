package com.gpdi.common.aop;

import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

/**
 * AOP 注解日志
 * Created by Administrator on 2016/8/19 0019.
 */

@Aspect     //该注解标示该类为切面类
@Component  //注入依赖
public class SysLog {

    private static Logger LOGGER = LoggerFactory.getLogger(SysLog.class);

    @Pointcut("within(@org.springframework.stereotype.Controller *)")
    public void cutController() {
    }

    /**
     * 前置通知 用于拦截Controller层记录用户的操作
     *
     * @param point
     * @throws Throwable
     */
    @Before("cutController()")
    public void recordSysLog(JoinPoint point) throws Throwable {
        String strMethodName = point.getSignature().getName();
        String strClassName = point.getTarget().getClass().getName();
        Object[] params = point.getArgs();
        StringBuffer bfParams = new StringBuffer();
        Enumeration<String> paraNames = null;

        HttpServletRequest request = ((ServletRequestAttributes)
                RequestContextHolder.getRequestAttributes()).getRequest();
        paraNames = request.getParameterNames();
        String key;
        String value;
        Integer index = 0;
        while (paraNames.hasMoreElements()) {
            if(index != 0){
                bfParams.append("&");
            }
            key = paraNames.nextElement();
            value = request.getParameter(key);
            bfParams.append(key).append("=").append(value);
            index ++;
        }
        if (StringUtils.isBlank(bfParams)) {
            bfParams.append(request.getQueryString());
        }
        String strMessage = String
                .format("[类名]:%s,[方法]:%s,[参数]:%s", strClassName, strMethodName, bfParams.toString());
        LOGGER.info(strMessage);
    }
}

