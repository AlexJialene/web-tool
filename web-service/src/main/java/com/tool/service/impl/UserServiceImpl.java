package com.tool.service.impl;

import com.tool.domain.User;
import com.tool.mapper.UserMapper;
import com.tool.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author alex-jiayu
 * @create 2017-06-09 18:36
 **/
//@Service("userService")
public class UserServiceImpl implements UserService{

    //@Autowired
    private UserMapper userMapper;


    @Transactional
    @Override
    public User test() {
        return userMapper.testSelect();
    }
}
