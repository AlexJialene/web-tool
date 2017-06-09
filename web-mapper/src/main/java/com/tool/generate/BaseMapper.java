package com.tool.generate;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by Alex_ on 2017/6/9.
 */
public interface BaseMapper<T> extends Mapper<T>,MySqlMapper<T> {
}
