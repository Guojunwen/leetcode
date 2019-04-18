package com.guo.leetcode.controller;

import com.guo.leetcode.bean.vo.PracticeVo;
import com.guo.leetcode.bean.RestResult;
import com.guo.leetcode.util.AnnotationUtil;
import com.guo.leetcode.util.ClassUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class IndexController extends BaseController{

    @RequestMapping(value = "/findAllPractice",method = RequestMethod.POST)
    @ResponseBody
    public RestResult findAllPractice(){
        // 获取特定包下所有的类(包括接口和类)
        List<Class<?>> clsList = ClassUtil.getAllClassByPackageName("com.guo.leetcode.practice");
        //输出所有使用了特定注解的类的注解值
        List<PracticeVo> practiceNames=AnnotationUtil.validAnnotation(clsList);
        return success(practiceNames);
    }
}
