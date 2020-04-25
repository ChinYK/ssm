package com.hbjc.dao;

import com.hbjc.domain.UcLinkWeixin;

public interface UcLinkWeixinMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UcLinkWeixin record);

    int insertSelective(UcLinkWeixin record);

    UcLinkWeixin selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UcLinkWeixin record);

    int updateByPrimaryKey(UcLinkWeixin record);
}