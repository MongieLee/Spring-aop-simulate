package cn.mjl.service.four;

public class LogAOP implements AOP {
    @Override
    public void before() {
        System.out.println("前置通知");
    }

    @Override
    public void after() {
        System.out.println("后置通知");
    }

    @Override
    public void exception() {
        System.out.println("异常通知");
    }
}
