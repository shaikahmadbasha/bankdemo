
package com.capg.authservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.capg.authservice.model.BankingUser;
/***
 * DAO layer for banking user table
 * @author sujillel
 *
 */
@Repository
@Transactional
public interface UserDao extends JpaRepository<BankingUser,String> {
	BankingUser findByUserId(String userId);
}
