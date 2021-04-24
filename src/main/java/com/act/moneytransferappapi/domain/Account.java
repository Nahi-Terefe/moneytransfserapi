package com.act.moneytransferappapi.domain;

import lombok.Data;
import net.bytebuddy.implementation.bind.annotation.Empty;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    @NotBlank(message = "first name is mandatory")
    private String firstName;

    @Column(nullable = false)
    @NotBlank(message = "first name is mandatory")
    private String lastName;

    @Column(nullable = false, unique = true)
    @NotBlank(message = "email is mandatory")
    private String email;

    @Column(nullable = false, unique = true)
    @NotBlank(message = "phone number is mandatory")
    private String phoneNumber;

    @Column(nullable = false)
    @NotNull(message = "pin mandatory")
    private Integer pin;

    @Column(nullable = false)
    private Double balance = 0.0;

    @Column(columnDefinition = "boolean default true")
    private Boolean isVerified = Boolean.TRUE;
}
