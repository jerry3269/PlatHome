package com.example.plathome.estate.domain.constant;

import lombok.Getter;

@Getter
public enum RentalType {
    JEONSE("전세"),
    MONTHLY("월세");

    private final String description;

    RentalType(String description) {
        this.description = description;
    }
}
