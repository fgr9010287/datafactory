package com.gpdi.common.responseEntity;

import java.io.Serializable;

/**
 * 类功能描述：基础返回类
 * <p/>
 * <p/>
 * 版权所有：www.gpdi.com
 * <p/>
 * 未经本公司许可，不得以任何方式复制或使用本程序任何部分
 * <p/>
 *
 * @author <a href="mailto:fgr9010287@126.com">jiangtch</a>
 * @since 2016/08/19
 */
public class BaseReturn implements Serializable{

    private static final long serialVersionUID = 6254242820388201528L;

    private boolean success = false;

    private String msg = "";

    private Object obj = null;

    private int state;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "BaseReturn{" +
                "success=" + success +
                ", msg='" + msg + '\'' +
                ", obj=" + obj +
                ", state=" + state +
                '}';
    }
}
