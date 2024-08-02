package com.tom.weather.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Data
class WeatherDataDTO {
    private long dt;
    private MainDTO main;
    private List<WeatherDTO> weather;
    private CloudsDTO clouds;
    private WindDTO wind;
    private int visibility;
    private double pop;
    private RainDTO rain;
    private SysDTO sys;
    private String dt_txt;

    // Getters and setters
}