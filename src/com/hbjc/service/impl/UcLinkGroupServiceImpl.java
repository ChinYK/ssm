package com.hbjc.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hbjc.dao.UcLinkGroupMapper;
import com.hbjc.domain.UcLinkGroup;
import com.hbjc.domain.page.UcLinkGroupPage;
import com.hbjc.service.UcLinkGroupService;

@Service
public class UcLinkGroupServiceImpl implements UcLinkGroupService{
	
	@Autowired
	private UcLinkGroupMapper ucLinkGroupMapper;

	@Override
	public void addUcLinkGroup(UcLinkGroup ucLinkGroup) {
		// TODO Auto-generated method stub
		ucLinkGroupMapper.insertSelective(ucLinkGroup);
	}

	@Override
	public void deleteUcLinkGroup(Long linkGroupId) {
		// TODO Auto-generated method stub
		ucLinkGroupMapper.deleteByPrimaryKey(linkGroupId);;
	}

	@Override
	public void updateUcLinkGroup(UcLinkGroup ucLinkGroup) {
		// TODO Auto-generated method stub
		ucLinkGroupMapper.updateByPrimaryKeySelective(ucLinkGroup);
	}

	@Override
	public UcLinkGroup getUcLinkGroup(Long linkGroupId) {
		// TODO Auto-generated method stub
		UcLinkGroup ucLinkGroup = ucLinkGroupMapper.selectByPrimaryKey(linkGroupId);
		return ucLinkGroup;
	}

	@Override
	public List<UcLinkGroup> listlinkgroups() {
		// TODO Auto-generated method stub
		List<UcLinkGroup> ucLinkGroups = ucLinkGroupMapper.selectUcLinkGroups();
		return ucLinkGroups;
	}

	@Override
	public PageInfo pageUcLinkGroup(UcLinkGroupPage page) throws Exception {
		// TODO Auto-generated method stub
		Page<Object> objects = PageHelper.startPage(page.getPageNum(), page.getPageSize());
		Page<UcLinkGroup> uInfo = ucLinkGroupMapper.pageUcLinkGroups(page.getGroup_name());
		PageInfo<UcLinkGroup> pageInfo = new PageInfo<UcLinkGroup>();
		BeanUtils.copyProperties(uInfo, pageInfo);
		List<UcLinkGroup> ucLinkGroups = new ArrayList<UcLinkGroup>();
		uInfo.forEach(uclingroup -> {
			ucLinkGroups.add(uclingroup);
		});
		pageInfo.setList(ucLinkGroups);
		return pageInfo;
	}

}
