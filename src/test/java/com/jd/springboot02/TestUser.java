package com.jd.springboot02;

import com.jd.springboot02.entity.User;
import com.jd.springboot02.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
public class TestUser {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void testAdd(){
        User user = new User();
        user.setLoginName("aaaa");
        user.setPassword("123456");
        user.setMobile("13988888888");
        user.setUserType(0);
        user.setRealname("张三");
        user.setCreateTime(new Date());
        userMapper.insert(user);
    }
}
