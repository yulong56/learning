package com.learn.learning.entity;

public class UserInfo {
    private int userId;
    private String userName;
    private String phonenum;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int id) {
        userId = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", phonenum='" + phonenum + '\'' +
                '}';
    }
}
