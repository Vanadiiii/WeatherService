package ru.imatveev.weather.domain;

import ru.imatveev.weather.entity.WeatherEntity;
import ru.imatveev.weather.enums.Mode;
import ru.imatveev.weather.enums.Units;

import java.util.Optional;

public interface WeatherCore {
    Optional<WeatherEntity> getWeather(String location,
                                       Integer lat,
                                       Integer lon,
                                       String callback,
                                       String cityId,
                                       String lang,
                                       Units units,
                                       Mode mode);
}
