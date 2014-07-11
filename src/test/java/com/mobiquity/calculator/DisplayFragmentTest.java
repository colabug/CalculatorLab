package com.mobiquity.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.robolectric.RobolectricTestRunner;

import static com.mobiquity.support.FragmentUtil.startFragment;

import static org.junit.Assert.assertNotNull;

/**
 * @since 1.0
 */
@RunWith (RobolectricTestRunner.class)

public class DisplayFragmentTest
{
    @Test
    public void shouldNotBeNull() throws Exception
    {
        DisplayFragment fragment = new DisplayFragment();
        startFragment( fragment);
        assertNotNull( fragment );
    }
}
