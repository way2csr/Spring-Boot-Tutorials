package com.genuinecoder.learnspringsecurity.controller;

import com.genuinecoder.learnspringsecurity.model.MyUser;
import com.genuinecoder.learnspringsecurity.service.MyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyUserController {
    @Autowired
    private MyUserService userService;

    @PostMapping("/register")
    public ResponseEntity<MyUser> registerUser(@RequestBody MyUser user) {
        MyUser savedUser = userService.registerUser(user);
        return ResponseEntity.ok(savedUser);
    }
}

