package com.features.model;

public sealed interface Service permits Car {
    int getMaxServiceIntervalInMonths();
}
