package cn.mjl.service.five;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static java.lang.reflect.Proxy.newProxyInstance;

// 代理工厂类，将要代理的业务对象和AOP类当参数传入
public class Proxy {
    public static Object getProxy(Service proxy, AOP aop) {
        // 类的类加载器
        // 类实现的所有接口
        // 代理功能
        // 这个函数的返回值是代理对象调用方法的返回值
        return newProxyInstance(proxy.getClass().getClassLoader(), proxy.getClass().getInterfaces(), (agent, method, args) -> {
            Object result = null;
            try {
                aop.before();
                // method是被调用的方法，args是被调用的方法的参数
                // 调用agent的方法就会死循环，agent是被生成的代理对象
                result = method.invoke(proxy, args);
                aop.after();
            } catch (Exception e) {
                aop.exception();
            }
            return result;
        });
    }
}
