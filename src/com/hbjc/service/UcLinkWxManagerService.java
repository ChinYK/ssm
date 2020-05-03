package com.hbjc.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.hbjc.domain.UcLinkWxManager;
import com.hbjc.domain.page.UcLinkWxManagerPage;

public interface UcLinkWxManagerService {
	void addUcLinkWxManager(UcLinkWxManager ucLinkWxManager);

	void deleteUcLinkWxManager(Long linkwxManagerId);

	void updateUcLinkWxManager(UcLinkWxManager ucLinkWxManager);

	UcLinkWxManager getUcLinkWxManager(Long linkwxManagerId);

	List<UcLinkWxManager> listlinkwxManager();

	PageInfo pageUcLinkWxManager(UcLinkWxManagerPage page) throws Exception;
}
