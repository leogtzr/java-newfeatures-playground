package com.features.model;

public non-sealed class Car implements Service {
    @Override
    public int getMaxServiceIntervalInMonths() {
        return 18;
    }
}
