package com.example.demo.user;

import com.example.demo.ItemType;
//
//public class User {
//
//    private String name;
//    private String email;
//    private long id;
//    private String role;
//
//    public User(Long id, String name, String email,String role) {
//        this.id = id;
//        this.name = name;
//        this.email = email;
//        this.role=role;
//    }
//
//    public String getName() {
//        return this.name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getEmail() {
//        return this.email;
//    }
//    public String getRole() {
//        return this.role;
//    }
//
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public Long getId() {
//        return this.id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String toString() {
//        return "Employee{id=" + this.id + ", name'" + this.name + "39, email='" + this.email +"role ="+this.role+ "'}";
//    }
//}
//package shopping.core;

import java.time.LocalDateTime;

/*
 * User Class to store information about user that buy
 */
public class User {

    private final UserType type;
    private final String userName;
    private final LocalDateTime joiningDate;

    /*
     * Could add more fields like name, address etc etc.
     */

    public User(UserType type, String userName) {
        this.type = type;
        this.userName = userName;
        joiningDate = LocalDateTime.now();
    }

    public User(UserType type, String userName, LocalDateTime joiningDate) {
        this.type = type;
        this.userName = userName;
        this.joiningDate = joiningDate;
    }

    public UserType getType() {
        return type;
    }

    public String getUserName() {
        return userName;
    }

    public LocalDateTime getJoiningDate() {
        return joiningDate;
    }}