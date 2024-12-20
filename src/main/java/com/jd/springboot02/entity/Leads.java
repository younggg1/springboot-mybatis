package com.jd.springboot02.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 线索表
 * @TableName leads
 */
@TableName(value ="leads")
@Data
public class Leads implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer leadsId;

    /**
     * 线索名称
     */
    private String leadsName;

    /**
     * 1已转化 0 未转化
     */
    private Integer isTransform;

    /**
     * 客户ID
     */
    private Integer customerId;

    /**
     * 跟进状态 0未跟进1已跟进
     */
    private Integer followup;

    /**
     * 下次联系时间
     */
    private Date nextTime;

    /**
     * 客户名称
     */
    private String customerName;

    /**
     * 客户联系人
     */
    private String contacts;

    /**
     * 手机
     */
    private String mobile;

    /**
     * 电话
     */
    private String telephone;

    /**
     * 地址
     */
    private String address;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建时间
     */
    private Date createTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Leads other = (Leads) that;
        return (this.getLeadsId() == null ? other.getLeadsId() == null : this.getLeadsId().equals(other.getLeadsId()))
            && (this.getLeadsName() == null ? other.getLeadsName() == null : this.getLeadsName().equals(other.getLeadsName()))
            && (this.getIsTransform() == null ? other.getIsTransform() == null : this.getIsTransform().equals(other.getIsTransform()))
            && (this.getCustomerId() == null ? other.getCustomerId() == null : this.getCustomerId().equals(other.getCustomerId()))
            && (this.getFollowup() == null ? other.getFollowup() == null : this.getFollowup().equals(other.getFollowup()))
            && (this.getNextTime() == null ? other.getNextTime() == null : this.getNextTime().equals(other.getNextTime()))
            && (this.getCustomerName() == null ? other.getCustomerName() == null : this.getCustomerName().equals(other.getCustomerName()))
            && (this.getContacts() == null ? other.getContacts() == null : this.getContacts().equals(other.getContacts()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getTelephone() == null ? other.getTelephone() == null : this.getTelephone().equals(other.getTelephone()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLeadsId() == null) ? 0 : getLeadsId().hashCode());
        result = prime * result + ((getLeadsName() == null) ? 0 : getLeadsName().hashCode());
        result = prime * result + ((getIsTransform() == null) ? 0 : getIsTransform().hashCode());
        result = prime * result + ((getCustomerId() == null) ? 0 : getCustomerId().hashCode());
        result = prime * result + ((getFollowup() == null) ? 0 : getFollowup().hashCode());
        result = prime * result + ((getNextTime() == null) ? 0 : getNextTime().hashCode());
        result = prime * result + ((getCustomerName() == null) ? 0 : getCustomerName().hashCode());
        result = prime * result + ((getContacts() == null) ? 0 : getContacts().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getTelephone() == null) ? 0 : getTelephone().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", leadsId=").append(leadsId);
        sb.append(", leadsName=").append(leadsName);
        sb.append(", isTransform=").append(isTransform);
        sb.append(", customerId=").append(customerId);
        sb.append(", followup=").append(followup);
        sb.append(", nextTime=").append(nextTime);
        sb.append(", customerName=").append(customerName);
        sb.append(", contacts=").append(contacts);
        sb.append(", mobile=").append(mobile);
        sb.append(", telephone=").append(telephone);
        sb.append(", address=").append(address);
        sb.append(", remark=").append(remark);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}