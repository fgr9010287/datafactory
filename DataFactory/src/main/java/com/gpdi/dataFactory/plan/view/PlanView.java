package com.gpdi.dataFactory.plan.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 类功能描述：计划管理view
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

@RequestMapping("planView")
@Controller
public class PlanView {

    private static Logger logger = LoggerFactory.getLogger(PlanView.class);

    @RequestMapping
    public ModelAndView gotoView(ModelAndView modelAndView){
        logger.debug("planView start.");
        return modelAndView;
    }

}
