package com.guo.leetcode.bean.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PracticeVo {
    private String name;
    private String url;

    public PracticeVo() {
    }

    public PracticeVo(String name) {
        this.name = name;
    }

    public PracticeVo(String name, String url) {
        this.name = name;
        this.url = url;
    }
}
