package ru.imatveev.weather.domain;

import ru.imatveev.weather.entity.WeatherEntity;

import java.util.Optional;

public interface WeatherCore {
    Optional<WeatherEntity> getWeather(String location);
}
