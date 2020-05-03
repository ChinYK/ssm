package com.hbjc.service;

import java.util.List;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.hbjc.domain.UcUsers;
import com.hbjc.domain.page.UcUsersPage;

public interface UcUserSerivce {
		
	void addUcUser(UcUsers ucUsers);
	
	void deleteUcUser(Long userId);
	
	void updateUcUser(UcUsers ucUsers);
	
	UcUsers getUcUsers(Long userId);
	
	List<UcUsers> listUsers();
	
	PageInfo pageUcUser(UcUsersPage page) throws Exception;

}
