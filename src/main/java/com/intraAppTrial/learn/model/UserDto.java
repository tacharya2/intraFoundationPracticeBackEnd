package com.intraAppTrial.learn.model;

import io.swagger.v3.oas.annotations.media.Schema;

import lombok.Data;
@Data
public class UserDto {
    @Schema(description = "Message",example = "This is my message", required = true)

    private String message;

    @Schema(description = "name",example = "John Doe", required = true)
    private String name;
}