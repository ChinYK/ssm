package com.hbjc.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hbjc.dao.UcLinkWeixinMapper;
import com.hbjc.domain.UcLinkWeixin;
import com.hbjc.domain.page.UcLinkWeixinPage;
import com.hbjc.service.UcLinkWeixinService;

@Service
public class UcLinkWeixinServiceImpl implements UcLinkWeixinService {
	
	@Autowired
	private UcLinkWeixinMapper ucLinkWeixinMapper;
	
	@Override
	public void addUcLinkWeixin(UcLinkWeixin uckLinkWeixin) {
		// TODO Auto-generated method stub
		ucLinkWeixinMapper.insertSelective(uckLinkWeixin);
	}

	@Override
	public void deleteUcLinkWeixin(Long linkweixinId) {
		// TODO Auto-generated method stub
		ucLinkWeixinMapper.deleteByPrimaryKey(linkweixinId);
	}

	@Override
	public void updateUcLinkWeixin(UcLinkWeixin ucLinkWeixin) {
		// TODO Auto-generated method stub
		ucLinkWeixinMapper.updateByPrimaryKeySelective(ucLinkWeixin);
	}

	@Override
	public UcLinkWeixin getUcLinkWeixin(Long linkweixinId) {
		// TODO Auto-generated method stub
		UcLinkWeixin ucLinkWeixin = ucLinkWeixinMapper.selectByPrimaryKey(linkweixinId);
		return ucLinkWeixin;
	}

	@Override
	public List<UcLinkWeixin> listlinkweixins() {
		// TODO Auto-generated method stub
		List<UcLinkWeixin> ucLinkWeixins = ucLinkWeixinMapper.selectUcLinkWeinxins();
		return ucLinkWeixins;
	}

	@Override
	public PageInfo pageUcLinkWeixin(UcLinkWeixinPage page) throws Exception {
		// TODO Auto-generated method stub
		PageHelper.startPage(page.getPageNum(), page.getPageSize());
		Page<UcLinkWeixin> ucLinkWeixins = ucLinkWeixinMapper.pageUcLinkweixins(page.getUser_name());
		PageInfo<UcLinkWeixin> uicInfo = new PageInfo<UcLinkWeixin>();
		List<UcLinkWeixin> ucLinkWexins = new ArrayList<>();
		BeanUtils.copyProperties(ucLinkWeixins, uicInfo);
		ucLinkWeixins.forEach(ucLinkWeixin -> {
			ucLinkWexins.add(ucLinkWeixin);
		});
		uicInfo.setList(ucLinkWexins);
		return uicInfo;
	}

}
