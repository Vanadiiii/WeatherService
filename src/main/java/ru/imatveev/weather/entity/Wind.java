package ru.imatveev.weather.entity;

import lombok.Data;

@Data
public class Wind {
    private int speed;
    private int deg;
    private int gust;
}
