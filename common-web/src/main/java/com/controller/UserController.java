package com.controller;

import com.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Description:
 * author: LinQin
 * date: 2018/05/17
 */
@Controller
public class UserController {

    @Resource
    UserService userService;

    @RequestMapping("index")
    public String index() {
        int countNum = userService.getCountNum();
        System.out.println("countNum" + countNum);
        System.out.println("进入index方法");
        System.out.println("github test");
        return "index";
    }
}
