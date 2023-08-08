package com.intraAppTrial.learn.service;

import com.intraAppTrial.learn.mapper.UserMapper;
import com.intraAppTrial.learn.model.UserDto;
import com.intraAppTrial.learn.repository.UserRepository;
import com.intraAppTrial.learn.repository.model.AddressEntity;
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
        userEntity.setFirstName(userDto.getFirstName());
        userEntity.setMiddleInitial(userDto.getMiddleInitial());
        userEntity.setLastName(userDto.getLastName());
        userEntity.setEmail(userDto.getEmail());
        userEntity.setPhone(userDto.getPhone());

        AddressEntity addressEntity = UserMapper.addressDtoToAddressEntity(userDto.getAddress());
        userEntity.setAddress(addressEntity);

        try{
            UserEntity savedUserEntity = userRepository.save(userEntity);
            return UserMapper.entityToDto((savedUserEntity));
        }catch (DataIntegrityViolationException e){
            throw new RuntimeException("Failed to create user for " +  userDto.getFirstName() +" "+ userDto.getLastName());
        }
    }
}