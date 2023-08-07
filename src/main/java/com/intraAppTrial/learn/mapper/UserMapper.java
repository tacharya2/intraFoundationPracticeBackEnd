package com.intraAppTrial.learn.mapper;


import com.intraAppTrial.learn.model.UserDto;
import com.intraAppTrial.learn.repository.model.UserEntity;
import org.modelmapper.ModelMapper;

public class UserMapper {
    private static ModelMapper modelMapper = new ModelMapper();

    private UserMapper() {
    }

    public static UserDto entityToDto(UserEntity userEntity) {
        return modelMapper.map(userEntity, UserDto.class);
    }

    public static UserEntity dtoToEntity(UserDto userDto) {
        return modelMapper.map(userDto, UserEntity.class);
    }
}