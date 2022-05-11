package cn.mjl.service.springAop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class LogAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("时间：" + simpleDateFormat.format(System.currentTimeMillis()) + "，方法：" + method.getName() + "，参数：" + Arrays.toString(args));
    }
}
