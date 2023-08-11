package com.intraAppTrial.learn.controller;

import com.intraAppTrial.learn.model.UserDto;
import com.intraAppTrial.learn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController implements UserApi, LoginApi {

    private final AuthenticationManager authenticationManager;
    private final UserService userService;

    @Autowired
    public UserController(AuthenticationManager authenticationManager, UserService userService) {
        this.userService = userService;
        this.authenticationManager = authenticationManager;
    }
    @Override
    public ResponseEntity<UserDto> createUser(UserDto userDto) {
        UserDto createdUserDto = userService.createUser(userDto);
        return new ResponseEntity<>(createdUserDto, HttpStatus.CREATED);
    }
    @Override
//    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<String> login(@RequestParam String email, @RequestParam String rawPassword) {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(email, rawPassword));
            return ResponseEntity.ok("Logged in successfully");
        }catch (AuthenticationException e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials "+ e.getMessage());
        }
    }
}