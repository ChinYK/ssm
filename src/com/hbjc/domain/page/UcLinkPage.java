package com.hbjc.domain.page;

import com.github.pagehelper.Page;
import com.hbjc.domain.UcLink;

public class UcLinkPage extends Page<UcLink> {
	private static final long serialVersionUID = 1L;
	private String link_name;
	public String getLink_name() {
		return link_name;
	}
	public void setLink_name(String link_name) {
		this.link_name = link_name;
	}
	
}
