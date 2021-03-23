package com.syg.shenbing.core;

/**
 * 服务器业务异常
 * @Author 田志武
 * @create 2021/3/23 11:35
 */
public class ServiceException extends RuntimeException{

    public ServiceException() {
    }

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}
