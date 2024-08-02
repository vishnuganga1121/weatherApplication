package com.tom.weather.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Data
public class WeatherResponseDTO {
    private List<WeatherDataDTO> list;
    private CityDTO city;

    // Getters and setters
}











