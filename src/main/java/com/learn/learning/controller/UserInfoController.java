package com.learn.learning.controller;


import com.google.gson.Gson;
import com.learn.learning.entity.UserInfo;
import com.learn.learning.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    /*
    * 获取所有用户
    * param:无
    * */
    @ResponseBody
    @RequestMapping(value = "/user/getall",method = RequestMethod.GET)
    public String getAllUser(){
        Gson gson = new Gson();
        List<UserInfo> allUserList = userInfoService.getAll();
        return gson.toJson(allUserList);
    }
    /*
     * 跳转页面
     * param:无
     * */
    @RequestMapping(value = "/user/hello")
    public String userHello(){
        return "user/hello";
    }
    /*
     * 跳转页面
     * param:无
     * */
    @RequestMapping(value = "/user/cont")
    public String userCont(){
        return "user/cont";
    }
}
