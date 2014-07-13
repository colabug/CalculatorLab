package com.mobiquity.calculator;

import android.app.Application;

/**
 * @since 1.0
 */
public class CalculatorApplication extends Application
{
    private static CalculatorApplication instance = new CalculatorApplication();

    public static CalculatorApplication getInstance()
    {
        return instance;
    }
}
