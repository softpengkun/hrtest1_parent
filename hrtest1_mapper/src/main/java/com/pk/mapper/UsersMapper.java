package com.pk.mapper;

import com.pk.model.Users;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/11/3 0003.
 */
public class UsersMapper {
    public List<Users> findAll(){
        List<Users> list=new ArrayList<>();
        for (int i=0;i<5;i++){
            list.add(new Users("张三"+i,i));
        }
        return list;
    }
}
