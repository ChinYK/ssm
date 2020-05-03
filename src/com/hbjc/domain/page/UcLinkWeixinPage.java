package com.hbjc.domain.page;

import com.github.pagehelper.Page;
import com.hbjc.domain.UcLinkWeixin;

public class UcLinkWeixinPage extends Page<UcLinkWeixin>{
	private static final long serialVesionUID = 1L;
	
	private String user_name;

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	

}
