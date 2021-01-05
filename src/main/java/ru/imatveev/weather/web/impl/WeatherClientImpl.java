package ru.imatveev.weather.web.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.imatveev.weather.domain.WeatherCore;
import ru.imatveev.weather.entity.WeatherEntity;
import ru.imatveev.weather.web.WeatherClient;

@RestController
@RequestMapping("/weather")
@RequiredArgsConstructor
public class WeatherClientImpl implements WeatherClient {
    private final WeatherCore weatherCore;

    @Override
    @GetMapping("/{location}")
    public ResponseEntity<WeatherEntity> getWeather(@PathVariable String location) {
        return ResponseEntity.of(weatherCore.getWeather(location));
    }
}
