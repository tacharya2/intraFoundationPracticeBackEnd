package com.intraAppTrial.learn.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class AddressDto {

    @Schema(description = "Street", example = "123 Main St", required = true)
    private String street;

    @Schema(description = "City", example = "YourCity", required = true)
    private String city;

    @Schema(description = "State", example = "YourState", required = true)
    private String state;

    @Schema(description = "Zip Code", example = "12345", required = true)
    private String zip;
}