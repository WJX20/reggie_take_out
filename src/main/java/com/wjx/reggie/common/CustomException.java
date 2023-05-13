package com.wjx.reggie.common;

/**
 * @ClassName CustomException
 * @Description TODO
 * @Author 王锦翔
 * @Date 2023/5/3 18:29
 * @Version 1.0
 **/
//自定义业务异常
public class CustomException extends RuntimeException{
    public CustomException (String message){
        super(message);
    }
}
