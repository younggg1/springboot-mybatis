package com.jd.springboot02.controller;

import com.jd.springboot02.entity.Customer;
import com.jd.springboot02.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

@Controller//返回视图对象
@Slf4j //日志中注解
public class HomeController {

    @Autowired
    private CustomerService customerService;



    @GetMapping("/hello")
    public String index(Map<String, Object> map) {
        List<Customer> customerList = customerService.listCustomer();
        map.put("msg","这是传递给页面的动态字符串");
        map.put("list",customerList);
        return "success";
    }
}
