package com.hbjc.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hbjc.dao.UcUsersMapper;
import com.hbjc.domain.UcUsers;
import com.hbjc.domain.page.UcUsersPage;
import com.hbjc.service.UcUserSerivce;

@Service
public class UcUserServiceImpl implements UcUserSerivce {
	
	@Autowired
	private UcUsersMapper ucUsersMapper;

	@Override
	public List<UcUsers> listUsers() {
		// TODO Auto-generated method stub
		return ucUsersMapper.selectUcUsers();
	}

	@Override
	public void addUcUser(UcUsers ucUsers) {
		// TODO Auto-generated method stub
		ucUsersMapper.insertSelective(ucUsers);
	}

	@Override
	public void deleteUcUser(Long userId) {
		// TODO Auto-generated method stub
		ucUsersMapper.deleteByPrimaryKey(userId);
	}

	@Override
	public void updateUcUser(UcUsers ucUsers) {
		// TODO Auto-generated method stub
		ucUsersMapper.updateByPrimaryKeySelective(ucUsers);
	}

	@Override
	public UcUsers getUcUsers(Long userId) {
		// TODO Auto-generated method stub
		return ucUsersMapper.selectByPrimaryKey(userId);
	}

	@Override
	public PageInfo pageUcUser(UcUsersPage page) throws Exception {
		// TODO Auto-generated method stub
		Page<Object> pages = PageHelper.startPage(page.getPageNum(), page.getPageSize());
		Page<UcUsers> users = ucUsersMapper.pageUsers(page.getUser_name());
		PageInfo<UcUsers> pageInfo = new PageInfo<UcUsers>();
		BeanUtils.copyProperties(users, pageInfo);
		List<UcUsers> users2 = new ArrayList<UcUsers>();
		users.forEach(user -> {
			users2.add(user);
		});
		pageInfo.setList(users2);
		return pageInfo;
	}

}
