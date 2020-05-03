package com.hbjc.dao;

import java.util.List;

import com.github.pagehelper.Page;
import com.hbjc.domain.UcLinkGroup;
import com.hbjc.domain.UcUsers;

public interface UcLinkGroupMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UcLinkGroup record);

    int insertSelective(UcLinkGroup record);

    UcLinkGroup selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UcLinkGroup record);

    int updateByPrimaryKey(UcLinkGroup record);
    
    List<UcLinkGroup> selectUcLinkGroups();
    
    Page<UcLinkGroup> pageUcLinkGroups(String group_name);
}