package com.gpdi.common.exception;

/**
 * Created by Administrator on 2016/8/19 0019.
 */
public class SystemException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public SystemException(Object Obj) {
        super(Obj.toString());
    }
}
