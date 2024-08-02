package com.tom.weather.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
class WindDTO {
    private double speed;
    private int deg;
    private double gust;

    // Getters and setters
}