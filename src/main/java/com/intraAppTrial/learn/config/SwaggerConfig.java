package com.intraAppTrial.learn.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
        info = @Info(
                title = "User API",
                description = "This API is used to do CRUD operation of Users",
                version = "v1",
                contact = @Contact(name = "Tek Acharya", email = "sarmakash430@gmail.com")
        )
)
public class SwaggerConfig {

}
