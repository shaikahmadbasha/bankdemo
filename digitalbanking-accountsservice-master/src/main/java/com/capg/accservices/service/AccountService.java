package com.capg.accservices.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.capg.accservices.model.Account;
import com.capg.accservices.model.Transaction;

@Service
public interface AccountService {

	public List<Account> getCustomerAccounts(Integer customerId);
	public Account getAccountDetailsById(Integer accountId);
	public void depositeAmount(Integer accountNo,Double amount) ;
	public double withdrawAmount(Integer accountNo,Double amount) ;
	public List<Transaction> getRecentTransactions(Integer accountNum, String startDate, String endDate);
}
