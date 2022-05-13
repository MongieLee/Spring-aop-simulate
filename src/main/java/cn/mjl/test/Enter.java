package cn.mjl.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan("cn.mjl.test")
@EnableAspectJAutoProxy
@Configuration
public class Enter {
    @Bean
    public Cat cat(){
        Cat cat = new Cat();
        cat.setAge(11);
        cat.setName("小白");
        return cat;
    }
}
