package com.jd.springboot02.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.jd.springboot02.entity.Customer;
import com.jd.springboot02.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;


    @GetMapping("/customers/{pageNo}")
    public String listcustomer(@PathVariable("pageNo")Integer pageNo,
                                @RequestParam(value = "seachName",required = false,defaultValue = "")String seachName,
                                Map<String, Object> map){
        IPage<Customer> cp = customerService.pageCustomer(pageNo,3,seachName);
        map.put("cp",cp);
        /*cp.getRecords();//当前页的数据,集合
        cp.getSize();//每页显示的条数
        cp.getTotal();//总记录条数
        cp.getPages();//总页数
        cp.getCurrent();//当前页*/
        return "/customer/list";
    }
}
