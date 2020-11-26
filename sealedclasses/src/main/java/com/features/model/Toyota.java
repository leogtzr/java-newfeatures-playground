package com.features.model;

// since Car is non-sealed, we still can extend it.
public class Toyota extends Car {

    public void foo() {
        final int x = super.getMaxServiceIntervalInMonths();
        System.out.println(x);
        final int y = this.getMaxServiceIntervalInMonths();
        System.out.println(y);
    }

    @Override
    public int getMaxServiceIntervalInMonths() {
        return 12;
    }
}
