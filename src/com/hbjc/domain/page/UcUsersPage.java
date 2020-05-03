package com.hbjc.domain.page;

import com.github.pagehelper.Page;
import com.hbjc.domain.UcUsers;

public class UcUsersPage extends Page<UcUsers> {
	private static final long serialVersionUID = 1L;
	private String user_name;
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
    
}
