package com.learn.learning.dao;

import com.learn.learning.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserInfoDao {

    @Select("select user_id,user_name,phonenum from t_user_info")
    List<UserInfo> findAll();
}
