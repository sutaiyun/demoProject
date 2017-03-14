package com.example.datasource.mapper;

import com.example.datasource.dao.UserInfo;

/**
 * Created by sutaiyun on 2017/3/14.
 */
public interface UserInfoMapper {
    public UserInfo selectUserInfoById(long id);
}
