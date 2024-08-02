package com.tom.weather.service;

import com.tom.weather.dto.WeatherResponseDTO;
import com.tom.weather.exception.NoDataException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    @Value("${openWeather.url-lat-lon}")
    private String BaseURL;
    @Value("${openWeather.token}")
    private String token;

    //private String BaseURL="api.openweathermap.org/data/2.5/forecast";
    //private String token="78eed9fdcd4566cebb60147ecec36602";

    RestTemplate restTemplate = new RestTemplate();
    WeatherResponseDTO wd=null;

    public WeatherResponseDTO getWeather(double lat, double lon) throws NoDataException {
        String url=BaseURL+"?lat="+lat+"&lon="+lon+"&appid="+token;
        wd=restTemplate.getForObject(url,WeatherResponseDTO.class);

        if(wd==null){
            throw new NoDataException("No data found for given Latitude and Longitude");
        }
        return wd;
    }

    public WeatherResponseDTO getWeather(String city) throws NoDataException {
        String url=BaseURL+"?q="+city+"&appid="+token;
        wd=restTemplate.getForObject(url,WeatherResponseDTO.class);

        if(wd==null){
            throw new NoDataException("No data found for given Latitude and Longitude");
        }
        return wd;
    }
}
