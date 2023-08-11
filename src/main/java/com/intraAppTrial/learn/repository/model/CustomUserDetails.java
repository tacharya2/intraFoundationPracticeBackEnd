//package com.intraAppTrial.learn.repository.model;
//
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//
//import java.util.Collection;
//import java.util.Collections;
//
//public class CustomUserDetails implements UserDetails {
//    private UserEntity userEntity;
//    public CustomUserDetails(UserEntity userEntity) {
//        this.userEntity = userEntity;
//    }
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        // Since we don't have roles or authorities, return an empty collection.
//        return Collections.emptyList();
//    }
//
//    @Override
//    public String getPassword() {
//        return userEntity.getPassword();
//    }
//
//    @Override
//    public String getUsername() {
//        return userEntity.getEmail();
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }
//}
