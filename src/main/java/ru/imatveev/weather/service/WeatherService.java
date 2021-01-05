package ru.imatveev.weather.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.imatveev.weather.entity.WeatherEntity;

import java.util.Optional;

@FeignClient(name = "weather-service", url = "${weather.uri}")
public interface WeatherService {
    @GetMapping("/weather")
    Optional<WeatherEntity> getCurrentWeatherData(@RequestParam("q") String location,
                                                  @RequestParam(required = false) String lang,
                                                  @RequestParam(required = false) String units,
                                                  @RequestParam(required = false) Integer lat,
                                                  @RequestParam(required = false) Integer lon
    );
}
