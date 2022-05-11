package cn.mjl.service.four;

// 静态代理拆分了业务接口和业务实现，切面接口和切面实现
public class Agent implements Service {
    private final Service proxy;
    private final AOP aop;

    public Agent(Service service, AOP aop) {
        this.proxy = service;
        this.aop = aop;
    }

    @Override
    public void action() {
        try {
            aop.before();
            proxy.action();
            aop.after();
        } catch (Exception e) {
            aop.exception();
        }
    }
}
