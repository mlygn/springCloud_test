package com.zs.springboot.dao;

import com.zs.springboot.entity.Db1User;
import java.util.List;

public interface Db1UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Db1User record);



    Db1User selectByPrimaryKey(Integer id);

    List<Db1User> selectAll();

    int updateByPrimaryKey(Db1User record);
}