package com.example.dio.model;
import com.example.dio.enums.UserRole;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.JOINED)
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "userId")
    private long userId;

    @Column(name = "username")
    private String  username;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "ph_no")
    private String phoneNumber;

    @Column(name = "role")
    private UserRole userRole;

    @Column(name = "craeted_at")
    private LocalDate createdAt;

    @Column(name = "last_modified_at")
    private LocalDate lastModified;




}
