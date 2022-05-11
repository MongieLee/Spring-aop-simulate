package cn.mjl.service.five;

public class TransAOP implements AOP {
    @Override
    public void before() {
        System.out.println("前置事务");
    }

    @Override
    public void after() {
        System.out.println("后置事务");
    }

    @Override
    public void exception() {
        System.out.println("异常事务");
    }
}
