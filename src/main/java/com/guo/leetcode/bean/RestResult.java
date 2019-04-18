package com.guo.leetcode.bean;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RestResult {
    private String msg;
    private Integer code;
    private Object result;

}
