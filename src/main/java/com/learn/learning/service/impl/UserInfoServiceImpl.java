package com.learn.learning.service.impl;

import com.learn.learning.dao.UserInfoDao;
import com.learn.learning.entity.UserInfo;
import com.learn.learning.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoDao userInfoDao;
    @Override
    public List<UserInfo> getAll(){
        return userInfoDao.findAll();
    }
}
