package cn.mjl.service.impl;

import cn.mjl.dao.UserMapper;
import cn.mjl.pojo.User;
import cn.mjl.service.UserService;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("userService")
@ToString
public class UserServiceImpl implements UserService {
    @Autowired
    @Qualifier("userMapperImpl")
    private UserMapper userMapper;


    @Override
    public int insert(User user) {
        return userMapper.insert(user);
    }
}
