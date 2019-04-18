package com.guo.leetcode.annitation;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Practice {

    public String name();

    public String url();
}
