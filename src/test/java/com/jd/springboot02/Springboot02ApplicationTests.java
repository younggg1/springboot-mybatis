package com.jd.springboot02;

import com.jd.springboot02.entity.Customer;
import com.jd.springboot02.mapper.CustomerMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.sql.Date;
import java.util.List;

@SpringBootTest
class Springboot02ApplicationTests {

    @Autowired //注入进来
    private CustomerMapper customerMapper;
    @Test
    public void test01() {
        Customer customer = customerMapper.selectById(1);
        System.out.println(customer);
    }
    @Test
    public void test02() {
        List<Customer> customers = customerMapper.selectList(null);
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
    @Test//添加一个员工对象
    public void test03() {
        Customer customer = new Customer();
        customer.setCustomerId(5);
        customer.setCustomerName("何小明的公司");
        customer.setFollowup(0);
        customer.setNextTime(new Date(2024, 1, 1));
        customer.setDealStatus(0);
        customer.setContacts("何小明");
        customer.setMobile("123445678");
        customer.setTelephone("12344567810");
        customer.setAddress("重庆");
        customer.setRemark("");
        customer.setCreateTime(new Date(2024, 1, 1));
        customerMapper.insert(customer);
    }
    @Test
    public void test04() {
        Customer customer = new Customer();
        customerMapper.deleteById(3);
    }
    @Test
    public void test05() {
        List<Customer> customers = customerMapper.selectList(null);
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}
