package com.beyondli.util;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by beyondLi
 * Date 2018/1/4
 * Desc .
 */
@Component
public class ExceptionManager {
    @Resource
    Environment environment;

    public CustomException create(String code) {
        CustomException customException = new CustomException(code, environment.getProperty(code));
        return customException;
    }
}
