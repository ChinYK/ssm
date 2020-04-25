package com.hbjc.dao;

import com.hbjc.domain.UcLinkWxManager;

public interface UcLinkWxManagerMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UcLinkWxManager record);

    int insertSelective(UcLinkWxManager record);

    UcLinkWxManager selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UcLinkWxManager record);

    int updateByPrimaryKey(UcLinkWxManager record);
}