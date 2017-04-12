package com.capg.paymentservice.model;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component

@Entity
@Table(name = "user_billers")
public class UserBillers {

	@Id
	@Column(name="sno")
	private Long sno;
	
	@Column(name="user_id")
	private String userId;
	
	@Column(name="biller_name")
	private String billerName;
	
	@Column(name="biller_nick_name")
	private String billerNickName;
	
	@Column(name="biller_due_date")
	private Date billeDueDate;
	
	@Column(name="amount")
	private Double amount;
	
	@Column(name="remark")
	private String remark;
	
	@Column(name="biller_account_no")
	private Long billerAccountNo;
	
	@Column(name="ifsc_code")
	private String ifscCode;

	public Long getSno() {
		return sno;
	}

	public void setSno(Long sno) {
		this.sno = sno;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getBillerName() {
		return billerName;
	}

	public void setBillerName(String billerName) {
		this.billerName = billerName;
	}

	public String getBillerNickName() {
		return billerNickName;
	}

	public void setBillerNickName(String billerNickName) {
		this.billerNickName = billerNickName;
	}

	public Date getBilleDueDate() {
		return billeDueDate;
	}

	public void setBilleDueDate(Date billeDueDate) {
		this.billeDueDate = billeDueDate;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Long getBillerAccountNo() {
		return billerAccountNo;
	}

	public void setBillerAccountNo(Long billerAccountNo) {
		this.billerAccountNo = billerAccountNo;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	@Override
	public String toString() {
		return "UserBillers [sno=" + sno + ", userId=" + userId + ", billerName=" + billerName
				+ ", billerNickName=" + billerNickName + ", billeDueDate=" + billeDueDate + ", amount=" + amount
				+ ", remark=" + remark + ", billerAccountNo=" + billerAccountNo + ", ifscCode=" + ifscCode + "]";
	}
}