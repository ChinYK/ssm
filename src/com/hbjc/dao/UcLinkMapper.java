package com.hbjc.dao;

import java.util.List;

import com.github.pagehelper.Page;
import com.hbjc.domain.UcLink;
import com.hbjc.domain.UcLinkGroup;

public interface UcLinkMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UcLink record);

    int insertSelective(UcLink record);

    UcLink selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UcLink record);

    int updateByPrimaryKey(UcLink record);
    
    List<UcLink> selectUcLinks();
    
    Page<UcLink> pageUcLinks(String link_name);
}