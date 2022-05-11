package cn.mjl.dao;

import cn.mjl.pojo.User;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = "classpath:application.properties")
public class UserMapperImpl implements UserMapper {
    @Value("${test: cao}")
    String name;
    @Value("caonima")
    String no;

    @Autowired
    @Qualifier("userzzz")
    User user;

    @Override
    public int insert(User user) {
        System.out.println(user.getName() + "插入用户成功");
        return 0;
    }

    public UserMapperImpl() {
        System.out.println("UserMapperImpl初始化");
    }

    @Override
    public String toString() {
        return "UserMapperImpl{" +
                "name='" + name + '\'' +
                ", no='" + no + '\'' +
                ", user=" + user +
                '}';
    }
}
