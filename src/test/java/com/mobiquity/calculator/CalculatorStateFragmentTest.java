package com.mobiquity.calculator;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.robolectric.RobolectricTestRunner;

import static com.mobiquity.support.FragmentUtil.startFragment;
import static org.junit.Assert.assertNotNull;

/**
 * @since 1.0
 */
@RunWith (RobolectricTestRunner.class)

public class CalculatorStateFragmentTest
{
    private CalculatorStateFragment fragment;

    @Before
    public void setUp() throws Exception
    {
        fragment = new CalculatorStateFragment();
        startFragment(fragment);
    }

    @Test
    public void shouldNotBeNull() throws Exception
    {
        assertNotNull( fragment );
    }
}
