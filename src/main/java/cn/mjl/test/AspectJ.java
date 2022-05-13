package cn.mjl.test;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class AspectJ {
    @Before("testPackage()")
    public void beforeAOP(JoinPoint jp) {
        System.out.println("前置通知：");
        System.out.println("调用方法的签名：" + jp.getSignature());
        System.out.println("方法的参数：" + Arrays.toString(jp.getArgs()));
    }

    @AfterReturning(returning = "result", pointcut = "testPackage()")
    public void afterReturningAOP(JoinPoint jp, Object result) {
        if (result instanceof String) {
            result = "返回值已经被修改";
        }
        if (result instanceof Cat) {
            ((Cat) result).setName("小猫");
            ((Cat) result).setAge(100);
        }
        System.out.println(jp.getSignature() + "方法执行完毕，返回值：" + result);
        System.out.println("后置通知结束-----------------------------------------------------");
    }

    @Around("testPackage()")
    public Object aroundAOP(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object proceed = null;
        if (proceedingJoinPoint.getArgs().length > 0) {
            System.out.println("环绕通知开始-----------------------------------------------------");

            proceed = proceedingJoinPoint.proceed();
            System.out.println("环绕通知结束----------------------------------------------------");
        } else {
            System.out.println(proceedingJoinPoint.getSignature().getName() + "拒绝访问");
        }
        return proceed;
    }

    @After("testPackage()")
    public void afterAOP(JoinPoint jp) {
        System.out.println("最终通知：");
        System.out.println("报错会调用，不报错也会调用");
    }

    @Pointcut("execution(* cn.mjl.test.AServiceImpl.*(..))")
    public void testPackage() {
    }
}
