package com.beyondli.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by beyondLi
 * Date 2018/1/4
 * Desc .
 */
@Data
@NoArgsConstructor
public class ExceptionMsg {

    private String code;
    private String msg;

    public ExceptionMsg(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}

