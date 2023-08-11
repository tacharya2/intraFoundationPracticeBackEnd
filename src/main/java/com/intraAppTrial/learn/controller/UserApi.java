package com.intraAppTrial.learn.controller;

import com.intraAppTrial.learn.model.UserDto;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/messages")
public interface UserApi{
    @CrossOrigin(origins = "http://localhost:3000")
   // @Operation(summary = "Get user message", tags = "User Api");
    @PostMapping("/create")
    ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto);
}
