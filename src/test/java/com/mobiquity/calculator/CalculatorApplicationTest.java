package com.mobiquity.calculator;

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
    @Test
    public void shouldNotBeNull() throws Exception
    {
        assertNotNull( CalculatorApplication.getInstance() );
    }
}
