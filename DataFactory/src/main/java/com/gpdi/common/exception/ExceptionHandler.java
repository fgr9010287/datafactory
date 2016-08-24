package com.gpdi.common.exception;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 类功能描述：异常统一处理控制器
 * Created by Administrator on 2016/8/19 0019.
 */

@Component
public class ExceptionHandler implements HandlerExceptionResolver {

    private static Logger logger = LoggerFactory.getLogger(ExceptionHandler.class);

    public ModelAndView resolveException(HttpServletRequest request,
                                         HttpServletResponse response, Object obj, Exception ex) {

        ModelMap modelMap = new ModelMap();
        modelMap.addAttribute("state", false);

        //是否异步请求, 如果不是ajax，JSP格式返回
        if (!(request.getHeader("accept").indexOf("application/json") > -1 || (request
                .getHeader("X-Requested-With") != null && request
                .getHeader("X-Requested-With").indexOf("XMLHttpRequest") > -1))) {

            // 根据不同错误转向不同页面
            if (ex instanceof SystemException) {
                modelMap.addAttribute("errMsg", ex.getMessage());
            } else {
                modelMap.addAttribute("errMsg", "服务器打盹了,请稍后重试.");
            }
            logger.info("op<resolveException> 不是ajax请求,跳转到页面.");
            return new ModelAndView("error", modelMap);
        } else {
            // 如果是ajax请求，JSON格式返回
            try {
                response.setContentType("application/json;charset=UTF-8");
                if (ex instanceof SystemException) {
                    modelMap.addAttribute("errMsg", ex.getMessage());
                } else {
                    modelMap.addAttribute("errMsg", "服务器打盹了,请稍后重试.");
                }

                logger.info("op<resolveException> ajax请求,返回JSON.");

                PrintWriter writer = response.getWriter();
                ObjectMapper mapper = new ObjectMapper();
                String json = mapper.writeValueAsString(modelMap);
                writer.write(json);
                writer.flush();
            } catch (IOException e) {
                logger.error("op<resolveException> write json throw exception.", e);
                modelMap.put("errMsg", "服务器打盹了,请稍后重试.");
                return new ModelAndView("error", modelMap);
            }
            return null;
        }
    }
}
