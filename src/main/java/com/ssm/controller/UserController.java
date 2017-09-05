package com.ssm.controller;

import com.ssm.model.User;
import com.ssm.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Zhangxq on 2016/7/15.
 */

@Controller
@RequestMapping("/user")
public class UserController {

    private Logger log = Logger.getLogger(UserController.class);
    @Resource
    private UserService userService;

    @RequestMapping("/showUser")
    public String showUser(HttpServletRequest request, Model model){
        log.info("查询所有用户信息");
        List<User> userList = userService.getAllUser();
        model.addAttribute("userList",userList);
        return "showUser";
    }
    @RequestMapping("/showName")
    public String showNmae(HttpServletRequest request, Model model)
    {
        model.addAttribute("name","jason");
        return "showName";
    }
    @ResponseBody
    @RequestMapping("/getUser")
    public User getUser(){
        User user = new User();
        user.setID(0);
        user.setUserName("aaa");
        return user;
    }
}
