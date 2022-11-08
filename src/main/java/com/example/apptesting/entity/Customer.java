package com.example.apptesting.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer {

    @Id
    private Long id;

    @NotBlank
    private String name;

    @NotBlank
    private String phoneNumber;
}
