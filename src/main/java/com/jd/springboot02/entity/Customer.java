package com.jd.springboot02.entity;
import lombok.Data;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.sql.Date;
@Data
@TableName("customer")
public class Customer {
    @TableId(type = IdType.AUTO)//主键注解
    private Integer customerId;
    private String customerName;
    private Integer followup;
    private Date nextTime;
    private Integer dealStatus;
    private String contacts;
    private String mobile;
    private String telephone;
    private String address;
    private String remark;
    private Date createTime;

}