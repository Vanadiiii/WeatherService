package ru.imatveev.weather.entity;

import lombok.Data;

@Data
public class Sys {
    private int type;
    private long id;
    private String country;
    private long sunrise;
    private long sunset;
}
