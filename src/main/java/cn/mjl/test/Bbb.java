package cn.mjl.test;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Aspect
//@Component
public class Bbb {
    @Before("testPackage()")
    public void beforeAOP(JoinPoint jp) {
        System.out.println(222);
    }

    @Before("testPackage()")
    public void beforeAOP2(JoinPoint jp) {
        System.out.println(433);

    }
    @Pointcut("execution(* cn.mjl.test.*.*(..))")
    public void testPackage(){}
}
