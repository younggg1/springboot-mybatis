package com.jd.springboot02.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jd.springboot02.entity.Customer;
import com.jd.springboot02.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //说明此类是业务逻辑层
public class CustomerService {
    @Autowired
    private CustomerMapper customerMapper;
    //查询所有客户信息 select * from customer where
    public List<Customer> listCustomer() {
        return customerMapper.selectList(null);
    }

    public IPage<Customer>pageCustomer(int pageNo, int pageSize,String seachName){
        QueryWrapper<Customer> qw = new QueryWrapper<>();
        if (seachName!= null){
            qw.like("customer_name",seachName);
        }
        qw.orderByDesc("customer_id");
        Page<Customer> p = new Page<>(pageNo,pageSize);
        IPage<Customer> cp= customerMapper.selectPage(p,qw);
        return cp;
    }
}
