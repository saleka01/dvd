package com.dvd.rent.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Rental {

    private Movie movie;
    private int daysRented;
}

