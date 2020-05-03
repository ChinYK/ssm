package com.hbjc.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hbjc.dao.UcLinkWxManagerMapper;
import com.hbjc.domain.UcLinkWxManager;
import com.hbjc.domain.page.UcLinkWxManagerPage;
import com.hbjc.service.UcLinkWxManagerService;

import sun.swing.UIAction;

@Service
public class UcLinkWxManagerServiceImpl implements UcLinkWxManagerService {
	@Autowired
	private UcLinkWxManagerMapper ucLinkWxManagerMapper;

	@Override
	public void addUcLinkWxManager(UcLinkWxManager ucLinkWxManager) {
		// TODO Auto-generated method stub
		ucLinkWxManagerMapper.insertSelective(ucLinkWxManager);
	}

	@Override
	public void deleteUcLinkWxManager(Long linkwxManagerId) {
		// TODO Auto-generated method stub
		ucLinkWxManagerMapper.deleteByPrimaryKey(linkwxManagerId);
	}

	@Override
	public void updateUcLinkWxManager(UcLinkWxManager ucLinkWxManager) {
		// TODO Auto-generated method stub
		ucLinkWxManagerMapper.updateByPrimaryKeySelective(ucLinkWxManager);
	}

	@Override
	public UcLinkWxManager getUcLinkWxManager(Long linkwxManagerId) {
		// TODO Auto-generated method stub
		UcLinkWxManager ucLinkWxManager = ucLinkWxManagerMapper.selectByPrimaryKey(linkwxManagerId);
		return ucLinkWxManager;
	}

	@Override
	public List<UcLinkWxManager> listlinkwxManager() {
		// TODO Auto-generated method stub
		List<UcLinkWxManager> ucLinkWxManagers = ucLinkWxManagerMapper.selectUcLinkWxManagers();
		return ucLinkWxManagers;
	}

	@Override
	public PageInfo pageUcLinkWxManager(UcLinkWxManagerPage page) throws Exception {
		// TODO Auto-generated method stub
		PageHelper.startPage(page.getPageNum(), page.getPageSize());
		Page<UcLinkWxManager> ucLinkWxManagers = ucLinkWxManagerMapper.pageUcLinkwxManagers(page.getWeixin());
		PageInfo<UcLinkWxManager> uckInfo = new PageInfo<UcLinkWxManager>();
		List<UcLinkWxManager> ucLinkWxManagers2 = new ArrayList<UcLinkWxManager>();
		ucLinkWxManagers.forEach(info  -> {
			ucLinkWxManagers2.add(info);
		});
		uckInfo.setList(ucLinkWxManagers2);
		return uckInfo;
	}

}
