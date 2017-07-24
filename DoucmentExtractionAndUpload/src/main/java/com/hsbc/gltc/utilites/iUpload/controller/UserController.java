package com.hsbc.gltc.utilites.iUpload.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.hsbc.gltc.utilites.iUpload.entity.User;
import com.hsbc.gltc.utilites.iUpload.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/list")
    public List<User> getUserData(){
        logger.info("Load User data from DB");
        return userService.getList();
    }
    
    /*
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/likeName")
    public List<User> likeName(@RequestParam String name){
        return userMapper.likeName(name);
    }
    */
}