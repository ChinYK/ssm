package com.hbjc.service;

import java.util.List;

import com.hbjc.domain.Users;


public interface UsersService {
	
	public List<Users> getAll();
	
	public int saveUsers(Users users);
}
