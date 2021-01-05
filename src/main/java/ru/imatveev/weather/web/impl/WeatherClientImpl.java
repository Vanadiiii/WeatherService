package ru.imatveev.weather.web.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.imatveev.weather.domain.WeatherCore;
import ru.imatveev.weather.entity.WeatherEntity;
import ru.imatveev.weather.enums.Mode;
import ru.imatveev.weather.enums.Units;
import ru.imatveev.weather.web.WeatherClient;

@RestController
@RequestMapping("/weather")
@RequiredArgsConstructor
public class WeatherClientImpl implements WeatherClient {
    private final WeatherCore weatherCore;

    @Override
    @GetMapping("/{location}")
    public ResponseEntity<WeatherEntity> getWeather(
            @PathVariable String location,
            @RequestParam(required = false) Integer lat,
            @RequestParam(required = false) Integer lon,
            @RequestParam(required = false) String callback,
            @RequestParam(required = false) String cityId,
            @RequestParam(required = false, defaultValue = "ru") String lang,
            @RequestParam(required = false, defaultValue = "metric") Units units
    ) {
        return ResponseEntity.of(weatherCore.getWeather(
                location,
                lat,
                lon,
                callback,
                cityId,
                lang,
                units,
                Mode.JSON
                )
        );
    }
}
