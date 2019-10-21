package com.hunau.mydatauser.controller;

import com.hunau.mydatauser.dao.UserDao;
import com.hunau.mydatauser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.PathVariable;

@Controller

public class UserController {
    private UserDao userDao;
    @Autowired
    UserService userService;

    @RequestMapping("/query")
    public String Query(Model model){

        model.addAttribute("users", userService.findBy("maoping"));
        return "query";
    }

    @RequestMapping ("/showUser/{id}")
    public String showUser(@PathVariable int id,Model model){
        model.addAttribute("name",userService.selectUser(id));
        return "showuser";
    }

}
