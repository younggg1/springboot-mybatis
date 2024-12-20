package com.jd.springboot02.controller;

import com.jd.springboot02.entity.User;
import com.jd.springboot02.exception.BaseException;
import com.jd.springboot02.service.UserService;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
@Slf4j
public class LoginController {
    @Autowired
    private UserService userService;
    @GetMapping("/")
    public String index(){
        return "login";
    }



    @PostMapping("/login")
    public String login(@RequestParam("loginName")String loginName,
                        @RequestParam("password")String password,
                        HttpSession session, Map<String, Object> map){
        log.info("LoginName is {},PWD is {}",loginName,password);
        try {
            User user = userService.loginUser(loginName,password);
            session.setAttribute("user",user);
            return "redirect:/customers/1";//重定向到客户列表
        }catch (BaseException e){
            map.put("msg",e.getMessage());
            return "login";
        }

    }
    //退出登录
    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();//销毁session
        return "redirect:/";
    }
}
