package cn.mjl.test;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AServiceImpl implements AService {
    @Resource
    private Cat cat;

    @Override
    public void fuck() {
        System.out.println("fuck");
    }

    @Override
    public String testString() {
        return "操这是测试";
    }

    @Override
    public Cat testCat(int id) {
        System.out.println("这是猫");
        return cat;
    }
}
