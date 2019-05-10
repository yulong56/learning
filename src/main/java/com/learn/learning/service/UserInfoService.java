package com.learn.learning.service;

import com.learn.learning.entity.UserInfo;

import java.util.List;

public interface UserInfoService {
    /*
    * 查询所有用户
    *
    * */
    List<UserInfo> getAll();
}
