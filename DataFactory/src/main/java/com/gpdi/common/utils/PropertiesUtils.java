package com.gpdi.common.utils;




import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @description： 对属性文件操作的工具类
 * 获取，新增，修改
 * 注意：	以下方法读取属性文件会缓存问题,在修改属性文件时，不起作用，
 *　InputStream in = PropertiesUtils.class.getResourceAsStream("/config.properties");
 *　解决办法：
 *　String savePath = PropertiesUtils.class.getResource("/config.properties").getPath();
 * @author：jiangtch
 * @date：2016/6/19 23:25
 */
public class PropertiesUtils {

    private static Logger logger = LoggerFactory.getLogger(PropertiesUtils.class);

    /**
     * 返回　Properties
     * @return
     */
    public static Properties getProperties(){

        Resource resource = new ClassPathResource("/config.properties");
        Properties prop = null;
        try {
            prop = PropertiesLoaderUtils.loadProperties(resource);
        } catch (IOException e) {
            logger.error("load properties <config.properties> throw Exception.",e);
        }
        return prop;
    }


    /**
     * 获取属性文件的数据 根据key获取值
     * @param key
     * @return
     */
    public static String findPropertiesKey(String key) {

        try {
            Properties prop = getProperties();
            return prop.getProperty(key);
        } catch (Exception e) {
            return "";
        }

    }


    /**
     * 写入properties信息
     *
     * @param key
     *            名称
     * @param value
     *            值
     */
    public static void modifyProperties(String key, String value) {
        try {
            // 从输入流中读取属性列表（键和元素对）
            Properties prop = getProperties();
            prop.setProperty(key, value);
            String path = PropertiesUtils.class.getResource("/config.properties").getPath();
            FileOutputStream outputFile = new FileOutputStream(path);
            prop.store(outputFile, "modify");
            outputFile.close();
            outputFile.flush();
        } catch (Exception e) {
        }
    }
}
