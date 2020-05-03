package com.hbjc.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.hbjc.domain.UcLink;
import com.hbjc.domain.page.UcLinkPage;
import com.hbjc.domain.page.UcUsersPage;

public interface UcLinkService {
	
	void addUcLink(UcLink ucLink);
	
	void deleteUcLink(Long linkId);
	
	void updateUcLink(UcLink ucLink);
	
	UcLink getUcLink(Long linkId);
	
	List<UcLink> listlinks();
	
	PageInfo pageUcLink(UcLinkPage page) throws Exception;

}
