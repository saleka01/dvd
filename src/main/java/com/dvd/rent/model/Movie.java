package com.dvd.rent.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Movie {
    private MoovieType type;
    private String title;
    private int priceCode;
}
