package cn.mjl;

import cn.mjl.dao.UserMapper;
import cn.mjl.dao.UserMapperImpl;
import cn.mjl.pojo.User;
import cn.mjl.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.net.Proxy;
import java.util.Arrays;

import static java.lang.reflect.Proxy.newProxyInstance;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void test() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        UserMapper userMapper = (UserMapper) context.getBean("userMapperImpl");
//        UserService userService = (UserService) context.getBean("userService");
//
//
//        System.out.println(userMapper);
//        System.out.println(userService);
//        UserController userController = context.getBean("userController", UserController.class);
//        int mjl = userController.insert(new User("mjl", 123));
//        System.out.println(mjl);
        UserMapper um = (UserMapper) newProxyInstance(UserMapperImpl.class.getClassLoader(), UserMapperImpl.class.getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("方法名：" + method.getName());
                System.out.println("参数:" + Arrays.toString(args));
                return method.invoke(userMapper, args);
            }
        });
        um.insert(new User("mjl", 123));
        System.out.println(UserMapperImpl.class.getClassLoader());
        System.out.println(userMapper.getClass().getClassLoader());

//        um.insert(new User("mjl", 123));
    }
}