package com.tool.service.impl;

import com.github.pagehelper.PageHelper;
import com.tool.domain.User;
import com.tool.generate.BaseMapper;
import com.tool.mapper.UserMapper;
import com.tool.service.UserService;
import com.tool.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author alex-jiayu
 * @create 2017-06-09 18:36
 **/
@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService{

    @Autowired
    private UserMapper userMapper;


    @Transactional
    @Override
    public User test() {
        User user = new User();
        user.setId(2L);
        user.setAge(1);
        user.setName("alex");

        return userMapper.selectByPrimaryKey(1L);
    }

    @Override
    public List<User> selectUsers() {

        PageHelper.startPage(1,2);
        return userMapper.selectUsers();
    }


    @Override
    protected BaseMapper<User> getBaseMapper() {
        return this.userMapper;
    }
}
