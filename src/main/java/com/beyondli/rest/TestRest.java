package com.beyondli.rest;

import com.beyondli.dto.User;
import com.beyondli.util.ExceptionManager;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by beyondLi
 * Date 2018/1/4
 * Desc .
 */
@RestController
@RequestMapping(value = "/test")
public class TestRest {
    @Resource
    ExceptionManager exceptionManager;
    @RequestMapping(value = "/val", method = RequestMethod.POST)
    public void testValid(@RequestBody User user) {
        int a = 1/0;
        //throw exceptionManager.create("GROUP_10001");
    }
}
