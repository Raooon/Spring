package com.yedam.app.user.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.app.user.dao.User;
import com.yedam.app.user.dao.UserMapper;
import com.yedam.app.user.dao.UserRole;
import com.yedam.app.user.dao.UserRoleMapper;
import com.yedam.app.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired UserMapper userMapper;
	@Autowired UserRoleMapper userRoleMapper;
	
	@Override
//	@Transactional
	public boolean insert(User user) {
		userMapper.insert(user);
		
		UserRole userRole = new UserRole();
		userRole.setUserId(user.getId());
		userRole.setRoleId("3");
		int result = userRoleMapper.insert(userRole);
		return result == 1 ? true : false;
	}
}
