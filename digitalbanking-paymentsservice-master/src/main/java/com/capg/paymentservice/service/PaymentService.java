package com.capg.paymentservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capg.paymentservice.model.PayeeDetails;
import com.capg.paymentservice.model.RegisteredBillers;
import com.capg.paymentservice.model.UserBillers;

@Service
public interface PaymentService {

	// Payees Management
	public Boolean addPayee(PayeeDetails payeeDetails);
	public Boolean removePayee(PayeeDetails payeeDetails);
	public List<PayeeDetails> findPayeesByUserId(String userId);
	// Billers management
	public List<UserBillers> getBillersByUserId(String userId);
	public Boolean removeBiller(UserBillers userBiller);
	public Boolean addBiller(UserBillers userBiller);
	
	public List<RegisteredBillers> getAllBillers();

}
