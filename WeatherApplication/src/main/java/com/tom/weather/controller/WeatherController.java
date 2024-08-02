package com.tom.weather.controller;

import com.tom.weather.dto.WeatherResponseDTO;
import com.tom.weather.service.WeatherService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    private final WeatherService ws;
    public WeatherController(WeatherService weatherService) {
        this.ws = weatherService;
    }
    @GetMapping("/{lat}/{lon}")
    public @ResponseBody WeatherResponseDTO getData(@PathVariable double lat, @PathVariable double lon) throws Exception {
        return ws.getWeather(lat,lon);
    }

    @GetMapping("/city/{city}")
    public @ResponseBody WeatherResponseDTO getData(@PathVariable String city) throws Exception {
        return ws.getWeather(city);
    }
}
