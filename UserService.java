package com.offcn.service;

import com.offcn.po.User;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface UserService {

    //增
    public String createUser(User user);

    //删
    public String deleteUser(Long id);

    //改
    public String updateUser(Long id,User user);

    //查全
    public List<User> getUserList();

    //查单
    public User getUser(Long id);

}
