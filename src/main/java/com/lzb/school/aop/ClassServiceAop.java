package com.lzb.school.aop;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * <br/>
 * Created on : 2022-01-28 10:15
 *
 * @author lizebin
 */
@Aspect
@Component
@Slf4j
@Order(1)
public class ClassServiceAop {

    @AfterReturning(value = "execution(* com.lzb.school.domain.service.ClassService.save(..))", returning = "retVal")
    public void saveClass(JoinPoint point, Object retVal) {

        System.out.println("班级id:");
        System.out.println(JSON.toJSONString(retVal));

        Object[] args = point.getArgs();
        String studentId = Objects.toString(args[0]);

        System.out.println("studentId:" + studentId);

        int i = 1 / 0;


    }

    @AfterReturning(value = "execution(* com.lzb.school.domain.service.ClassService.save1(..))", returning = "retVal")
    public void saveClass1(JoinPoint point, Object retVal) {

        System.out.println("班级id:");
        System.out.println(JSON.toJSONString(retVal));

        Object[] args = point.getArgs();
        String studentId = Objects.toString(args[0]);

        System.out.println("studentId:" + studentId);

        int i = 1 / 0;


    }
}
