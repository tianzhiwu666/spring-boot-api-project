package com.syg.shenbing.core;

/**
 * 响应结果生成工具
 * @Author 田志武
 * @create 2021/3/23 11:41
 */
public class ResultGenerator {

    /**
     * 默认成功
     */
    private static final String DEFAULT_SUCCESS_MESSAGE = "SUCCESS";

    /**
     * 响应成功  状态码 + 信息
     * @return
     */
    public static Result genSuccessResult() {
        return new Result()
                .setCode(ResultCode.SUCCESS)
                .setMessage(DEFAULT_SUCCESS_MESSAGE);
    }

    /**
     * 响应成功  状态码 + 信息 + 数据
     * @param data
     * @param <T>
     * @return
     */
    public static <T> Result<T> genSuccessResult(T data) {
        return new Result()
                .setCode(ResultCode.SUCCESS)
                .setMessage(DEFAULT_SUCCESS_MESSAGE)
                .setData(data);
    }

    /**
     * 响应失败   状态码 + 信息
     * @param message
     * @return
     */
    public static Result genFailResult(String message) {
        return new Result()
                .setCode(ResultCode.FAIL)
                .setMessage(message);
    }
}
