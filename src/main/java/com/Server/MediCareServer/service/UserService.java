package com.Server.MediCareServer.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Server.MediCareServer.model.DAOUser;
import com.Server.MediCareServer.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userDao;
	
	public DAOUser getUserByUserName(String username) {
		DAOUser user = userDao.findByUsername(username);
		return user;
    }
	
}
