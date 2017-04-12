package com.capg.paymentservice.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component

@Entity
@Table(name = "payee_details")
public class PayeeDetails {

	@Id
	@Column(name="payee_id")
	private Long payeeId;
	
	@Column(name="user_id")
	private String userId;
	
	@Column(name="nick_name")
	private String nickName;
	
	@Column(name="status")
	private Boolean status;
	
	@Column(name="bank")
	private String bank;
	
	@Column(name="branch")
	private String branch;
	
	@Column(name="ifsc_code")
	private String ifscCode;
	
	@Column(name="payee_type")
	private String payeeType;

	public Long getPayeeId() {
		return payeeId;
	}

	public void setPayeeId(Long payeeId) {
		this.payeeId = payeeId;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getPayeeType() {
		return payeeType;
	}

	public void setPayeeType(String payeeType) {
		this.payeeType = payeeType;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	@Override
	public String toString() {
		return "Payee_details [payeeId=" + payeeId + ", userId=" + userId + ", nickName=" + nickName + ", status="
				+ status + ", bank=" + bank + ", branch=" + branch + ", ifscCode=" + ifscCode + "]";
	}
}
