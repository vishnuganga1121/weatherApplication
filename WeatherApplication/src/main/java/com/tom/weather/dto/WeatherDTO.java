package com.tom.weather.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
class WeatherDTO {
    private int id;
    private String main;
    private String description;
    private String icon;

    // Getters and setters
}