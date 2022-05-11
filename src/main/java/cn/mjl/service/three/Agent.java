package cn.mjl.service.three;

// 通过静态代理实现了业务的拆分，带事务的切面仍然耦合在一起
// 只要实现了Service的类，就可以使用静态代理
public class Agent implements Service {
    private final Service service;

    public Agent(Service service) {
        this.service = service;
    }

    @Override
    public void action() {
        try {
            System.out.println("事务开始");
            service.action();
            System.out.println("事务结束");
        } catch (Exception e) {
            System.out.println("事务回滚");
        }
    }
}
