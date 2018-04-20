package com.hbjc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hbjc.dao.UsersDao;
import com.hbjc.domain.Users;
import com.hbjc.service.UsersService;

@Service("userService")
public class UserServiceImpl implements UsersService {
	@Autowired  
	private UsersDao usersDao;

	public void setDao(UsersDao dao) {//通过set方法注入属性
		this.usersDao = dao;
	}
	
	 @Override  
    public List<Users> getAll() {  
        return usersDao.getAll();  
    }  

	public int saveUsers(Users users) {
		return usersDao.insert(users);
	}
	
}
