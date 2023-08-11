package com.intraAppTrial.learn.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/swagger-ui/**", "/v3/api-docs/**", "/api/messages/**") // Allow access to Swagger UI and API docs
                .permitAll()
                .anyRequest().authenticated() // Require authentication for other requests
                .and()
                .httpBasic(); // Use HTTP Basic Authentication
        http.csrf().disable(); // Disable CSRF protection
    }
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("testuser")
                .password("{noop}testpassword") // {noop} specifies no password encoding
                .roles("USER");
    }
}
