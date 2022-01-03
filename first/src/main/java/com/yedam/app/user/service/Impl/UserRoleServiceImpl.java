package com.yedam.app.user.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.app.user.dao.UserRole;
import com.yedam.app.user.dao.UserRoleMapper;
import com.yedam.app.user.service.UserRoleService;

@Service
public class UserRoleServiceImpl implements UserRoleService {

	@Autowired UserRoleMapper userRoleMapper;
	
	@Override
	public int insert(UserRole role) {
		return userRoleMapper.insert(role);
	}
}
