package com.blues.portfoliobackend.entities;

import com.blues.portfoliobackend.utils.enums.ERole;
import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    private String username;

    private String password;

    private String firstName;

    private String lastName;

    private String email;

    private String phone;

    private ERole role;
}
