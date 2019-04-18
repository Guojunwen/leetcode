package com.guo.leetcode.controller;

import com.guo.leetcode.bean.RestResult;

public class BaseController {
    public RestResult success() {
        RestResult result = new RestResult();
        result.setCode(200);
        result.setMsg("ok");
        return result;
    }

    public RestResult success(Object object) {
        RestResult result = new RestResult();
        result.setCode(200);
        result.setMsg("ok");
        result.setResult(object);
        return result;
    }

}
