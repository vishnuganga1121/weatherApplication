package com.tom.weather.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
class CityDTO {
    private int id;
    private String name;
    private CoordDTO coord;
    private String country;
    private int population;
    private int timezone;
    private long sunrise;
    private long sunset;

    // Getters and setters
}