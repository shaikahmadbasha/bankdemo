package com.capg.paymentservice.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.capg.paymentservice.model.PayeeDetails;

@Repository
@Transactional
public interface PayeeDao extends JpaRepository<PayeeDetails,String> {
	List<PayeeDetails> findPayeesByUserId(String userId);
}
