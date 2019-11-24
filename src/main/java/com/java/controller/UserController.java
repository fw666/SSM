package com.java.controller;

import com.java.entity.User;
import com.java.impl.UserServiceImpl;
import com.java.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/selectUser")
    public String selectUser(Map<String,Object> map,@RequestParam(value="id",required = false,defaultValue = "1") String id){
        User user = userService.selectUser(id);
        map.put("user",user);
        return "success";
    }
}
