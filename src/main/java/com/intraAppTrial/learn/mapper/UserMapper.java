package com.intraAppTrial.learn.mapper;


import com.intraAppTrial.learn.model.AddressDto;
import com.intraAppTrial.learn.model.UserDto;
import com.intraAppTrial.learn.repository.model.AddressEntity;
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
    public static AddressEntity addressDtoToAddressEntity(AddressDto addressDto) {
        if(addressDto == null){
            return null;
        }
        AddressEntity addressEntity = new AddressEntity();
        addressEntity.setStreet(addressDto.getStreet());
        addressEntity.setCity(addressDto.getCity());
        addressEntity.setState(addressDto.getState());
        addressEntity.setZip(addressDto.getZip());
        return addressEntity;
    }

    public static AddressDto addressEntityToAddressDto(AddressEntity addressEntity) {
        if(addressEntity == null){
            return null;
        }
        AddressDto addressDto = new AddressDto();
        addressDto.setStreet(addressEntity.getStreet());
        addressDto.setCity(addressEntity.getCity());
        addressDto.setState(addressEntity.getState());
        addressDto.setZip(addressEntity.getZip());
        return addressDto;
    }
}