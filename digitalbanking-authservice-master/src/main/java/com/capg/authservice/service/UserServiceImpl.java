package com.capg.authservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.authservice.dao.UserDao;
import com.capg.authservice.model.BankingUser;

/***
 * User Authentication service
 * @author sujillel
 *
 */
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;
	
	/***
	 * To validate the given userId and password existing
	 * @param userId
	 * @param password
	 * return Boolean
	 */
	public Boolean authorizeUser(String userId, String password){
		//Get userId from DB
		BankingUser user = userDao.findByUserId(userId);
		if(user!=null && user.getPassword().equals(password)) {
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}
}