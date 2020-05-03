package com.hbjc.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.hbjc.domain.UcLinkGroup;
import com.hbjc.domain.page.UcLinkGroupPage;

public interface UcLinkGroupService {
	void addUcLinkGroup(UcLinkGroup ucLinkGroup);

	void deleteUcLinkGroup(Long linkGroupId);

	void updateUcLinkGroup(UcLinkGroup ucLinkGroup);

	UcLinkGroup getUcLinkGroup(Long linkGroupId);

	List<UcLinkGroup> listlinkgroups();

	PageInfo pageUcLinkGroup(UcLinkGroupPage page) throws Exception;
}
