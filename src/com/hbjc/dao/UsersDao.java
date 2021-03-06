package com.hbjc.dao;

import java.util.List;

import com.hbjc.domain.UserArea;
import com.hbjc.domain.Users;


public interface UsersDao {

	int insert(Users user);

	List<Users> getAll();

	int checkUser(Users user);

	List<UserArea> getUserArea();

}
