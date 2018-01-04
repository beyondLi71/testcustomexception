package com.beyondli.util;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by beyondLi
 * Date 2018/1/4
 * Desc .
 */
@Data
@NoArgsConstructor
public class CustomException extends RuntimeException {

    public CustomException(String code, String mgs) {
        this.code = code;
        this.mgs = mgs;
    }
    private String code;
    private String mgs;
}
