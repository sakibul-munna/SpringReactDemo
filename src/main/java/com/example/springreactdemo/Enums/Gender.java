package com.example.springreactdemo.Enums;

import java.util.Map;

public enum Gender {
    Male(1), Female(2);

    public final int genderInt;

    Gender(int genderInt) {
        this.genderInt = genderInt;
    }
}
