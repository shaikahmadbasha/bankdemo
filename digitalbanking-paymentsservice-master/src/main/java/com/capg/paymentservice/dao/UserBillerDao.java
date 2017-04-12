package com.capg.paymentservice.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.capg.paymentservice.model.UserBillers;

@Repository
@Transactional
public interface UserBillerDao extends JpaRepository<UserBillers,String> {
	List<UserBillers> findUserBillersByUserId(String userId);
}
