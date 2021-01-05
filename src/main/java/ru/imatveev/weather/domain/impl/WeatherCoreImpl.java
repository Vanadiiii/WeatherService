package ru.imatveev.weather.domain.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import ru.imatveev.weather.domain.WeatherCore;
import ru.imatveev.weather.entity.WeatherEntity;
import ru.imatveev.weather.service.WeatherService;

import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class WeatherCoreImpl implements WeatherCore {
    private final WeatherService weatherService;
    @Value("${weather.lang}")
    private String lang;
    @Value("${weather.units}")
    private String units;

    @Override
    public Optional<WeatherEntity> getWeather(String location) {
        return weatherService.getCurrentWeatherData(
                location,
                lang,
                units,
                null,
                null
        );
    }
}
