package com.intraAppTrial.learn.repository.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "message")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "message")
    private String message;

    @Column(name = "name")
    private String name;
}
