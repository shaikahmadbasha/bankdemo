package com.capg.paymentservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.capg.paymentservice.model.RegisteredBillers;

@Repository
@Transactional
public interface RegisteredBillersDao extends JpaRepository<RegisteredBillers,String> {
}
