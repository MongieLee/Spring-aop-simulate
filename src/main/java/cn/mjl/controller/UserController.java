package cn.mjl.controller;

import cn.mjl.pojo.User;
import cn.mjl.service.UserService;

public class UserController {
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public int insert(User user){
        return userService.insert(user);
    }
}
