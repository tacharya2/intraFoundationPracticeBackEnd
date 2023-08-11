package com.intraAppTrial.learn.controller;

import com.intraAppTrial.learn.repository.model.UserEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//@RequestMapping("/api/login")
public interface LoginApi {
    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/api/login/authenticate")
    ResponseEntity<String> login(@RequestParam String email, @RequestParam String rawPassword);
}
