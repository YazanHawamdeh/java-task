package com.example.demo.user;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userService {

    public List<User> getUser()  {
        return List.of(
                new User(
                        1L,"yazan","hawamdy@gmail.com",1
                ),
                new User(
                        2L,"omar","omar@gmail.com",2
                )
        );
    }
}
