package com.example.demo.user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/user")
public class UserController {
   private final  User userService;

   @Autowired
    public UserController(User userService){
       this.userService=userService;
    }

    @GetMapping
    public String getUser(){
       return  userService.getUserName();
    }

}
