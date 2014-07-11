package com.mobiquity.calculator;

import android.widget.EditText;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.robolectric.RobolectricTestRunner;

import static com.mobiquity.support.Assert.assertViewIsVisible;
import static com.mobiquity.support.FragmentUtil.startFragment;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * @since 1.0
 */
@RunWith (RobolectricTestRunner.class)

public class DisplayFragmentTest
{
    private DisplayFragment fragment;

    @Before
    public void setUp() throws Exception
    {
        fragment = new DisplayFragment();
        startFragment( fragment );
    }

    @Test
    public void shouldNotBeNull() throws Exception
    {
        assertNotNull( fragment );
    }

    @Test
    public void shouldHaveDefaultDisplay() throws Exception
    {
        EditText display = (EditText) fragment.getView().findViewById( R.id.display );
        assertViewIsVisible( display );
        assertThat( display.getText().toString(),
                    equalTo( "" ) );
    }
}
