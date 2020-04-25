package com.hbjc.dao;

import com.hbjc.domain.UcLink;

public interface UcLinkMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UcLink record);

    int insertSelective(UcLink record);

    UcLink selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UcLink record);

    int updateByPrimaryKey(UcLink record);
}