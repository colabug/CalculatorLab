package com.mobiquity.calculator;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.robolectric.RobolectricTestRunner;

import static org.junit.Assert.assertNotNull;

/**
 * @since 1.0
 */
@RunWith (RobolectricTestRunner.class)

public class CalculatorApplicationTest
{
    private CalculatorApplication application;

    @Before
    public void setUp() throws Exception
    {
        application = CalculatorApplication.getInstance();
    }

    @Test
    public void shouldNotBeNull() throws Exception
    {
        assertNotNull( application );
    }

    @Test
    public void shouldHaveBus() throws Exception
    {
        assertNotNull( application.getBus() );
    }
}
