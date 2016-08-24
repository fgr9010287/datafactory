package com.gpdi.common.recource;

import com.gpdi.common.utils.PropertiesUtils;
import org.springframework.web.context.ServletContextAware;

import javax.servlet.ServletContext;

/**
 * 类功能描述：资源版本控制器
 * <p/>
 * <p/>
 * 版权所有：www.gpdi.com
 * <p/>
 * 未经本公司许可，不得以任何方式复制或使用本程序任何部分
 * <p/>
 *
 * @author <a href="mailto:fgr9010287@126.com">jiangtch</a>
 * @since 2016/08/22
 */

public class ResVersionExposer implements ServletContextAware{

    private ServletContext servletContext ;
    private String resPath ;

    public void setServletContext(ServletContext servletContext) {
        this.servletContext = servletContext;
    }

    public void init(){
        //版本号配置在version.properties
        String version = PropertiesUtils.findPropertiesKey("res.version");
        resPath = "static/" + version;
        servletContext.setAttribute("resPath", resPath);
    }

    public String getResPath() {
        return resPath;
    }
}
