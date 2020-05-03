package com.hbjc.dao;

import java.util.List;

import com.github.pagehelper.Page;
import com.hbjc.domain.UcLinkWeixin;
import com.hbjc.domain.UcLinkWxManager;

public interface UcLinkWxManagerMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UcLinkWxManager record);

    int insertSelective(UcLinkWxManager record);

    UcLinkWxManager selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UcLinkWxManager record);

    int updateByPrimaryKey(UcLinkWxManager record);
    
    List<UcLinkWxManager> selectUcLinkWxManagers();
    
    Page<UcLinkWxManager> pageUcLinkwxManagers(String weixin);
}