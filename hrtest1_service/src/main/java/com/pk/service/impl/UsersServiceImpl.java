package com.pk.service.impl;

import com.pk.mapper.UsersMapper;
import com.pk.model.Users;
import com.pk.service.UsersService;

import java.util.List;

/**
 * Created by Administrator on 2017/11/3 0003.
 */
public class UsersServiceImpl implements UsersService {
    @Override
    public List<Users> findAll() {
        UsersMapper dao=new UsersMapper();
        return dao.findAll();
    }
}
