package com.hbjc.dao;

import java.util.List;

import com.github.pagehelper.Page;
import com.hbjc.domain.UcUsers;

public interface UcUsersMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UcUsers record);

    int insertSelective(UcUsers record);

    UcUsers selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UcUsers record);

    int updateByPrimaryKey(UcUsers record);
    
    List<UcUsers> selectUcUsers();
    
    Page<UcUsers> pageUsers(String userName);
}