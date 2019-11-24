package com.java.impl;

import com.java.entity.User;
import com.java.mapper.UserMapper;
import com.java.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public User selectUser(String id) {
        return userMapper.selectUser(id);
    }
}
