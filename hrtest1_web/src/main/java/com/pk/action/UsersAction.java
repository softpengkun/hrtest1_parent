package com.pk.action;

import com.pk.model.Users;
import com.pk.service.UsersService;
import com.pk.service.impl.UsersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2017/11/3 0003.
 */
@Controller
public class UsersAction {


    @RequestMapping("/findall")
    @ResponseBody
    public List<Users> findAll() throws Exception{
        UsersService service=new UsersServiceImpl();
        return  service.findAll();
    }
}
