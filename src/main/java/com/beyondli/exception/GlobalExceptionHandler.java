package com.beyondli.exception;

import com.beyondli.dto.ExceptionMsg;
import com.beyondli.util.CustomException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Created by beyondLi
 * Date 2018/1/4
 * Desc .
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ExceptionMsg exc(Exception e) {
        if (e instanceof CustomException) {
            CustomException customException = (CustomException) e;
            System.out.println(e);
            return new ExceptionMsg(customException.getCode(), customException.getMgs());
        }
       else {
            System.out.println(e);
            return new ExceptionMsg("0", "系统异常");
        }
    }
}
