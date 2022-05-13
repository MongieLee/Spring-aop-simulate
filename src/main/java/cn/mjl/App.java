package cn.mjl;

import cn.mjl.test.AService;
import cn.mjl.test.Cat;
import cn.mjl.test.Enter;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContextExtensionsKt;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Enter.class);
        AService serviceProxy = (AService) context.getBean("AServiceImpl");
//        serviceProxy.fuck();
        Cat cat = serviceProxy.testCat(1);
        System.out.println("函数拿到的猫：" + cat);
//        String s = serviceProxy.testString();
//        System.out.println("函数拿到的字符"+s);
    }
}
