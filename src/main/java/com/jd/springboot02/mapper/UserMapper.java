package com.jd.springboot02.mapper;

import com.jd.springboot02.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

/**
* @author Quagmire
* @description 针对表【user(用户表)】的数据库操作Mapper
* @createDate 2024-09-19 18:14:51
* @Entity com.jd.springboot02.entity.User
*/
public interface UserMapper extends BaseMapper<User> {
    //根据账号查询用户信息
    @Select("SELECT * FROM user WHERE login_name = #{loginName}")
    public  User findByLoginName(String loginName);

}




