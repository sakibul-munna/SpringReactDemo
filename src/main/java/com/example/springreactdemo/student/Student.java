package com.example.springreactdemo.student;

import com.example.springreactdemo.Enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.util.UUID;

@Data
@AllArgsConstructor
@Getter
public class Student {
    private final UUID id;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final Gender gender;
}
