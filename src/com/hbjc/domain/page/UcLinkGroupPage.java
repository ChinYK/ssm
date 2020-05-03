package com.hbjc.domain.page;

import com.github.pagehelper.Page;
import com.hbjc.domain.UcLinkGroup;

public class UcLinkGroupPage extends Page<UcLinkGroup>{
	private static long serialVersionUID = 1L;
	private String group_name;
	public String getGroup_name() {
		return group_name;
	}
	public void setGroup_name(String group_name) {
		this.group_name = group_name;
	}
	
}
