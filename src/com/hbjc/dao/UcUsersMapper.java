package com.hbjc.dao;

import com.hbjc.domain.UcUsers;

public interface UcUsersMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UcUsers record);

    int insertSelective(UcUsers record);

    UcUsers selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UcUsers record);

    int updateByPrimaryKey(UcUsers record);
}