package com.hbjc.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hbjc.dao.UcLinkMapper;
import com.hbjc.domain.UcLink;
import com.hbjc.domain.UcUsers;
import com.hbjc.domain.page.UcLinkPage;
import com.hbjc.domain.page.UcUsersPage;
import com.hbjc.service.UcLinkService;

@Service
public class UcLinkServiceImpl implements UcLinkService{
	
	@Autowired
	private UcLinkMapper ucLinkMapper;
	
	@Override
	public void addUcLink(UcLink ucLink) {
		// TODO Auto-generated method stub
		ucLinkMapper.insertSelective(ucLink);
	}

	@Override
	public void deleteUcLink(Long linkId) {
		// TODO Auto-generated method stub
		ucLinkMapper.deleteByPrimaryKey(linkId);
	}

	@Override
	public void updateUcLink(UcLink ucLink) {
		// TODO Auto-generated method stub
		ucLinkMapper.updateByPrimaryKeySelective(ucLink);
	}

	@Override
	public UcLink getUcLink(Long linkId) {
		// TODO Auto-generated method stub
		UcLink ucLink = ucLinkMapper.selectByPrimaryKey(linkId);
		return ucLink;
	}

	@Override
	public List<UcLink> listlinks() {
		// TODO Auto-generated method stub
		List<UcLink> ucLinks = ucLinkMapper.selectUcLinks();
		return ucLinks;
	}

	@Override
	public PageInfo pageUcLink(UcLinkPage page) throws Exception {
		// TODO Auto-generated method stub
		PageHelper.startPage(page.getPageNum(), page.getPageSize());
		Page<UcLink> page2 = ucLinkMapper.pageUcLinks(page.getLink_name());
		PageInfo<UcLink> pageInfo = new PageInfo<UcLink>();
		BeanUtils.copyProperties(page2, pageInfo);
		List<UcLink> links = new ArrayList<UcLink>();
		page2.forEach(lin -> {
			links.add(lin);
		});
		pageInfo.setList(links);
		return pageInfo;
	}

}
