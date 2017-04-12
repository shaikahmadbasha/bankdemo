package com.capg.accservices.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.capg.accservices.model.Transaction;

@Repository
@Transactional
public interface TransactionDao extends JpaRepository<Transaction,Integer> {
	
	@Query("SELECT p FROM Transaction p WHERE accountNo = ?1 "
			+ "and transactionDate between ?2 AND ?3 ORDER by transactionDate DESC")
	List<Transaction> getTransactions(Integer accountNo, Date startDate, Date endDate);
}
