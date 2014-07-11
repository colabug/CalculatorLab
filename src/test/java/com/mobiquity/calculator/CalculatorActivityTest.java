package com.mobiquity.calculator;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static junit.framework.Assert.assertNotNull;

/**
 * @since 1.0
 */
@RunWith (RobolectricTestRunner.class)

public class CalculatorActivityTest
{
    private CalculatorActivity activity;

    @Before
    public void setUp() throws Exception
    {
        activity = Robolectric.buildActivity( CalculatorActivity.class )
                              .create()
                              .start()
                              .resume()
                              .get();
    }

    @Test
    public void shouldNotBeNull() throws Exception
    {
        assertNotNull( activity );
    }

    @Test
    public void shouldHaveDisplayFragment() throws Exception
    {
        assertNotNull( activity.getFragmentManager()
                               .findFragmentById( R.id.display_fragment ) );
    }

    @Test
    public void shouldHaveButtonFragment() throws Exception
    {
        assertNotNull( activity.getFragmentManager()
                               .findFragmentById( R.id.button_fragment ) );
    }
}
