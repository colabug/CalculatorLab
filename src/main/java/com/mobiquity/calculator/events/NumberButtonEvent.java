package com.mobiquity.calculator.events;

/**
 * @since 1.0
 */
public class NumberButtonEvent extends BaseEvent
{
    String number;

    public NumberButtonEvent( String number )
    {
        this.number = number;
    }

    public String getNumber()
    {
        return number;
    }
}
