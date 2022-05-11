package cn.mjl;

import cn.mjl.service.springAop.Service;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Service serviceProxy = (Service) context.getBean("serviceProxy");
        serviceProxy.test();
        serviceProxy.action();
    }
}
