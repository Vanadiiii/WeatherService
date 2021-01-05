package ru.imatveev.weather.entity;

import lombok.Data;

@Data
public class Main {
    private int temp;
    private int feelsLike;
    private int tempMin;
    private int tempMax;
    private int pressure;
    private int humidity;
}
