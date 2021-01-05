package ru.imatveev.weather.web;

import org.springframework.http.ResponseEntity;
import ru.imatveev.weather.entity.WeatherEntity;
import ru.imatveev.weather.enums.Mode;
import ru.imatveev.weather.enums.Units;

public interface WeatherClient {
    ResponseEntity<WeatherEntity> getWeather(
            String location,
            Integer lat,
            Integer lon,
            String callback,
            String cityId,
            String lang,
            Units units
    );
}
