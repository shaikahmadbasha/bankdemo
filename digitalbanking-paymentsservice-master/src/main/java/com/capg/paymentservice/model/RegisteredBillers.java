package com.capg.paymentservice.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * DO for regisatered billers
 * @author Jillella Narasimha Rao
 */
@Configuration
@Component

@Entity
@Table(name = "registered_billers")
public class RegisteredBillers {

	@Id
	@Column(name="biller_id")
	private Long billerId;
	
	@Column(name="user_id")
	private String userId;
	
	@Column(name="biller_name")
	private String billerName;
	
	@Column(name="state")
	private String state;
	
	@Column(name="account_no")
	private Long accountNo;
	
	@Column(name="ifsc_code")
	private String ifscCode;
	
	@Column(name="biller_type")
	private String billerType;

	public Long getBillerId() {
		return billerId;
	}

	public void setBillerId(Long billerId) {
		this.billerId = billerId;
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

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(Long accountNo) {
		this.accountNo = accountNo;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getBillerType() {
		return billerType;
	}

	public void setBillerType(String billerType) {
		this.billerType = billerType;
	}

	@Override
	public String toString() {
		return "RegisteredBillers [billerId=" + billerId + ", userId=" + userId + ", billerName=" + billerName
				+ ", state=" + state + ", accountNo=" + accountNo + ", ifscCode=" + ifscCode + ", billerType="
				+ billerType + "]";
	}
}