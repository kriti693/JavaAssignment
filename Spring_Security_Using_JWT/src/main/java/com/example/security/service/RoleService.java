package com.example.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.security.dao.RoleDoa;
import com.example.security.pojo.Role;

@Service
public class RoleService {
	
	@Autowired
	RoleDoa roleDao;

	public Role createNewRole(Role role) {
		return roleDao.save(role);
	}
}
