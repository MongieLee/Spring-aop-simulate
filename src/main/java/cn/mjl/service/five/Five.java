package cn.mjl.service.five;

// 这里将代理的耦合性接触了，代理不需要实现接口，而是动态代理
// 1. 不需要再管接口中有多少个方法要实现，而是劫持接口中的方法调用
public class Five {
    public static void main(String[] args) {
        Service action = (Service) Proxy.getProxy(new Service() {
            @Override
            public void action() {
                System.out.println("five");
            }

            @Override
            public void fuck() {
                System.out.println("fuck");
            }
        }, new TransAOP());
        Service proxy2 = (Service) Proxy.getProxy(action, new LogAOP());
        proxy2.action();
        proxy2.fuck();
    }
}
