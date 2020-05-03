package com.hbjc.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.hbjc.domain.UcLinkWeixin;
import com.hbjc.domain.page.UcLinkWeixinPage;

public interface UcLinkWeixinService{
	void addUcLinkWeixin(UcLinkWeixin uckLinkWeixin);

	void deleteUcLinkWeixin(Long linkweixinId);

	void updateUcLinkWeixin(UcLinkWeixin ucLinkWeixin);

	UcLinkWeixin getUcLinkWeixin(Long linkweixinId);

	List<UcLinkWeixin> listlinkweixins();

	PageInfo pageUcLinkWeixin(UcLinkWeixinPage page) throws Exception;
}
