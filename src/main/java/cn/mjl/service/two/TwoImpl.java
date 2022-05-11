package cn.mjl.service.two;

public class TwoImpl extends Two {
    //    子类代理了父类进行了拆分业务和事务
    @Override
    public void action() {
        try {
            System.out.println("开始事务");
            super.action();
            System.out.println("事务提交");
        } catch (Exception e) {
            System.out.println("事务回滚");
        }
    }

    public static void main(String[] args) {
        new TwoImpl().action();
    }
}
