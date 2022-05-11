package cn.mjl.service.one;

public class One {
    public void action(){
//        业务与事务耦合度太高
        try {
            System.out.println("开始事务");
            System.out.println("One.action()");
            System.out.println("事务提交");
        } catch (Exception e) {
            System.out.println("事务回滚");
        }
    }

    public static void main(String[] args) {
        new One().action();
    }
}
