package com.hbjc.dao;

import com.hbjc.domain.UcLinkGroup;

public interface UcLinkGroupMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UcLinkGroup record);

    int insertSelective(UcLinkGroup record);

    UcLinkGroup selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UcLinkGroup record);

    int updateByPrimaryKey(UcLinkGroup record);
}