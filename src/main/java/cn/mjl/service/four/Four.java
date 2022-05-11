package cn.mjl.service.four;

public class Four {
    public static void main(String[] args) {
        new Agent(() -> System.out.println("four service"), new TransAOP()).action();
    }
}
