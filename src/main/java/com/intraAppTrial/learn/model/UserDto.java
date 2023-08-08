package com.intraAppTrial.learn.model;

import io.swagger.v3.oas.annotations.media.Schema;

import lombok.Data;
import org.apache.tomcat.jni.Address;

@Data
public class UserDto {


    @Schema(description = "First Name",example = "John", required = true)
    private String firstName;

    @Schema(description = "Middle Initial",example = "B", required = true)
    private String middleInitial;

    @Schema(description = "Last Name",example = "Doe", required = true)
    private String lastName;

    @Schema(description = "Email",example = "abc@gmail.com", required = true)
    private String email;

    @Schema(description = "Phone Number",example = "012-345-6789", required = true)
    private String phone;


    private AddressDto address;
}