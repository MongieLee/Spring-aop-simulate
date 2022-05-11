package cn.mjl.service.springAop;

public class ServiceImpl implements Service {

    @Override
    public void action() {
        System.out.println("实现了Service的action");
    }

    @Override
    public void test() {
        System.out.println("实现了Service的test");
    }
}
