package com.hbjc.domain.page;

import com.github.pagehelper.Page;
import com.hbjc.domain.UcLinkWxManager;

public class UcLinkWxManagerPage extends Page<UcLinkWxManager> {
	private static final long serialVersionUID = 1L;
	private String weixin;
	public String getWeixin() {
		return weixin;
	}
	public void setWeixin(String weixin) {
		this.weixin = weixin;
	}
	
}
