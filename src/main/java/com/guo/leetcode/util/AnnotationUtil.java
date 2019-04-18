package com.guo.leetcode.util;

import com.guo.leetcode.annitation.Practice;
import com.guo.leetcode.bean.vo.PracticeVo;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class AnnotationUtil {
    /**
     * 获取特定包内注解方法的注解值
     * @param clsList
     */
    public static List<PracticeVo> validAnnotation(List<Class<?>> clsList) {
        List<PracticeVo> practiceNames=new ArrayList<>();
        if (clsList != null && clsList.size() > 0) {
            for (Class<?> cls : clsList) {
                //获取类中的所有的方法
                Method[] methods = cls.getDeclaredMethods();
                if (methods != null && methods.length > 0) {
                    for (Method method : methods) {
                        Practice practiceAnnotion =  method.getAnnotation(Practice.class);
                        if (practiceAnnotion != null) {
                            //获取注解属性
                            practiceNames.add(new PracticeVo(practiceAnnotion.name(),practiceAnnotion.url()));
                        }
                    }
                }
            }
        }
        return practiceNames;
    }
}
