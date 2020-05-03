package com.hbjc.dao;

import java.util.List;

import com.github.pagehelper.Page;
import com.hbjc.domain.UcLinkWeixin;
import com.hbjc.domain.UcUsers;

public interface UcLinkWeixinMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UcLinkWeixin record);

    int insertSelective(UcLinkWeixin record);

    UcLinkWeixin selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UcLinkWeixin record);

    int updateByPrimaryKey(UcLinkWeixin record);
    
    List<UcLinkWeixin> selectUcLinkWeinxins();
    
    Page<UcLinkWeixin> pageUcLinkweixins(String user_name);
}