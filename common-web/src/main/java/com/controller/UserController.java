package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description:
 * author: LinQin
 * date: 2018/05/17
 */
@Controller
public class UserController {
    @RequestMapping("index")
    public String index() {
        System.out.println("进入index方法");
        return "index";
    }
}
