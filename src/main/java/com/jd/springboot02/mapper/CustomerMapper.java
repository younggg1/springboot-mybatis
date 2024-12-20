package com.jd.springboot02.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jd.springboot02.entity.Customer;
import org.springframework.stereotype.Repository;

@Repository //说明此类是持久层类
public interface CustomerMapper extends BaseMapper<Customer> {


}
