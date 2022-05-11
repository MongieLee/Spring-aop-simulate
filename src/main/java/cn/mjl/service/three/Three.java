package cn.mjl.service.three;

public class Three {
    public static void main(String[] args) {
        new Agent(() -> System.out.println("Three.action()")
        ).action();
    }
}
