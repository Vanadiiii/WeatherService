package ru.imatveev.weather.web;

import org.springframework.http.ResponseEntity;
import ru.imatveev.weather.entity.WeatherEntity;

public interface WeatherClient {
    ResponseEntity<WeatherEntity> getWeather(String location);
}
