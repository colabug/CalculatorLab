package com.mobiquity.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.robolectric.RobolectricTestRunner;

import static com.mobiquity.support.FragmentUtil.startFragment;
import static junit.framework.Assert.assertNotNull;

/**
 * @since 1.0
 */
@RunWith (RobolectricTestRunner.class)

public class ButtonFragmentTest
{
    @Test
    public void shouldNotBeNull() throws Exception
    {
        ButtonFragment buttonFragment = new ButtonFragment();
        startFragment( buttonFragment );
        assertNotNull( buttonFragment );
    }
}
