package com.intraAppTrial.learn.service;

import com.intraAppTrial.learn.mapper.UserMapper;
import com.intraAppTrial.learn.model.UserDto;
import com.intraAppTrial.learn.repository.UserRepository;
import com.intraAppTrial.learn.repository.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public UserDto createUser(UserDto userDto){

//        if (userDto.getMessage() == null || userDto.getMessage().trim().isEmpty()) {
//            throw new IllegalArgumentException("Message cannot be blank or empty.");
//        }

        UserEntity userEntity = new UserEntity();
        userEntity.setMessage(userDto.getMessage());
        userEntity.setName(userDto.getName());

        try{
            UserEntity savedUserEntity = userRepository.save(userEntity);
            return UserMapper.entityToDto((savedUserEntity));
        }catch (DataIntegrityViolationException e){
            throw new RuntimeException("Failed to create user {} "+ userDto.getMessage());
        }
    }
}
