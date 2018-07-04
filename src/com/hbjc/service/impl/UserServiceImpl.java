
package com.hbjc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hbjc.dao.UsersDao;
import com.hbjc.domain.UserArea;
import com.hbjc.domain.Users;
import com.hbjc.service.UsersService;

@Service("userService")
public class UserServiceImpl implements UsersService {
	@Autowired
	private UsersDao usersDao;

	public void setDao(UsersDao dao) {
		this.usersDao = dao;
	}

	 @Override
    public List<Users> getAll() {
		 //PageHelper.startPage(1, 10);
		List<Users> list = usersDao.getAll();
        //return usersDao.getAll();
		return list;
    }

	public int saveUsers(Users users) {
		return usersDao.insert(users);
	}

	@Override
	public String checkUser(Users user) {
		int flag = usersDao.checkUser(user);
		if(flag>0)//不能同时判断为空和1，否则为空时会报错
		{
			return "1";
		}
		return "0";
	}

	/* (non-Javadoc)
	 * @see com.hbjc.service.UsersService#getUserArea()
	 */
	@Override
	public List<UserArea> getUserArea() {
		List<UserArea> list = usersDao.getUserArea();

		return list;
	}

}
