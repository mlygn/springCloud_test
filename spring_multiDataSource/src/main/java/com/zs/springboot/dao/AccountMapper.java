package com.zs.springboot.dao;

import com.zs.springboot.entity.Account;
import java.util.List;

public interface AccountMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Account record);

    //1111
    Account selectByPrimaryKey(Integer id);

    List<Account> selectAll();

    int updateByPrimaryKey(Account record);
}