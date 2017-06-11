package com.tool.mapper;

import com.tool.domain.User;
import com.tool.generate.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author alex-jiayu
 * @create 2017-06-09 18:31
 **/
//@Mapper
public interface UserMapper extends BaseMapper<User>{

    //@Select("select * from user where id=1")
    User testSelect();

    //@Select("select * from user ")
    List<User> selectUsers();
}
