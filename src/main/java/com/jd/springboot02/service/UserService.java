package com.jd.springboot02.service;

import com.jd.springboot02.entity.User;
import com.jd.springboot02.exception.BaseException;
import com.jd.springboot02.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;
    //根据用户名和密码实现登录
    public  User loginUser(String loginName,String password){
        User user = userMapper.findByLoginName(loginName);
        if(user==null){
            throw  new BaseException("账户不存在");
        }
        if(!user.getPassword().equals(password)){
            throw  new BaseException("密码错误");
        }
            return user;



    }
}
