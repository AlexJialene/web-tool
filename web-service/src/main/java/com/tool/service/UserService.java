package com.tool.service;

import com.tool.domain.User;
import com.tool.generate.BaseMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author alex-jiayu
 * @create 2017-06-09 18:34
 **/
public interface UserService extends BaseMapper<User>{

    User test();

    List<User> selectUsers();
}
