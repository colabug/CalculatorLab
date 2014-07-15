package com.mobiquity.calculator;

import android.view.View;
import android.widget.Button;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static com.mobiquity.support.Assert.assertViewIsVisible;
import static com.mobiquity.support.FragmentUtil.startFragment;
import static com.mobiquity.support.ResourceLocator.getString;
import static junit.framework.Assert.assertNotNull;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * @since 1.0
 */
@RunWith (RobolectricTestRunner.class)

public class ButtonFragmentTest
{
    private ButtonFragment buttonFragment;

    @Before
    public void setUp() throws Exception
    {
        buttonFragment = new ButtonFragment();
        startFragment( buttonFragment );
    }

    @Test
    public void shouldNotBeNull() throws Exception
    {
        assertNotNull( buttonFragment );
    }

    @Test
    public void shouldHave1Key() throws Exception
    {
        verifyKey( R.id.key1, R.string.key1, "1" );
    }

    @Test
    @Config (qualifiers = "ja")
    public void shouldHaveJa1Key()
    {
        verifyKey( R.id.key1, R.string.key1, "一" );
    }

    @Test
    public void shouldHave2Key() throws Exception
    {
        verifyKey( R.id.key2, R.string.key2, "2" );
    }

    @Test
    @Config (qualifiers = "ja")
    public void shouldHaveJa2Key()
    {
        verifyKey( R.id.key2, R.string.key2, "二");
    }

    @Test
    public void shouldHave3Key() throws Exception
    {
        verifyKey( R.id.key3, R.string.key3, "3");
    }

    @Test
    @Config (qualifiers = "ja")
    public void shouldHaveJa3Key()
    {
        verifyKey( R.id.key3, R.string.key3, "三");
    }

    @Test
    public void shouldHave4Key() throws Exception
    {
        verifyKey( R.id.key4, R.string.key4, "4");
    }

    @Test
    @Config (qualifiers = "ja")
    public void shouldHaveJa4Key()
    {
        verifyKey( R.id.key4, R.string.key4, "四");
    }

    @Test
    public void shouldHave5Key() throws Exception
    {
        verifyKey( R.id.key5, R.string.key5, "5");
    }

    @Test
    @Config (qualifiers = "ja")
    public void shouldHaveJa5Key()
    {
        verifyKey( R.id.key5, R.string.key5, "五");
    }

    @Test
    public void shouldHave6Key() throws Exception
    {
        verifyKey( R.id.key6, R.string.key6, "6");
    }

    @Test
    @Config (qualifiers = "ja")
    public void shouldHaveJa6Key()
    {
        verifyKey( R.id.key6, R.string.key6, "六");
    }

    @Test
    public void shouldHave7Key() throws Exception
    {
        verifyKey( R.id.key7, R.string.key7, "7");
    }
    @Test
    @Config (qualifiers = "ja")
    public void shouldHaveJa7Key()
    {
        verifyKey( R.id.key7, R.string.key7, "七");
    }

    @Test
    public void shouldHave8Key() throws Exception
    {
        verifyKey( R.id.key8, R.string.key8, "8");
    }
    @Test
    @Config (qualifiers = "ja")
    public void shouldHaveJa8Key()
    {
        verifyKey( R.id.key8, R.string.key8, "八");
    }

    @Test
    public void shouldHave9Key() throws Exception
    {
        verifyKey( R.id.key9, R.string.key9, "9");
    }

    @Test
    @Config (qualifiers = "ja")
    public void shouldHaveJa9Key()
    {
        verifyKey( R.id.key9, R.string.key9, "九");
    }

    @Test
    public void shouldHave0Key() throws Exception
    {
        verifyKey( R.id.key0, R.string.key0, "0");
    }

    @Test
    @Config (qualifiers = "ja")
    public void shouldHaveJa0Key()
    {
        verifyKey( R.id.key0, R.string.key0, "零" );
    }

    private void verifyKey( int id, int stringId, String expectedString )
    {
        Button key = (Button) getViewById( id );
        assertViewIsVisible( key );

        String resourceString = getString( stringId );
        assertThat( key.getText().toString(),
                    equalTo( resourceString ) );
        assertThat( expectedString,
                    equalTo( resourceString ) );
    }

    @Test
    public void shouldHavePlusKey() throws Exception
    {
        Button plus = (Button) getViewById( R.id.plus );
        assertViewIsVisible( plus );
        assertThat( plus.getText().toString(),
                    equalTo( getString( R.string.plus ) ) );
    }

    @Test
    public void shouldHaveMinusKey() throws Exception
    {
        Button minus = (Button) getViewById( R.id.minus );
        assertViewIsVisible( minus );
        assertThat( minus.getText().toString(),
                    equalTo( getString( R.string.minus ) ) );
    }

    @Test
    public void shouldHaveMultiplyKey() throws Exception
    {
        Button multiply = (Button) getViewById( R.id.multiply );
        assertViewIsVisible( multiply );
        assertThat( multiply.getText().toString(),
                    equalTo( getString( R.string.multiply ) ) );
    }

    @Test
    public void shouldHaveDivideKey() throws Exception
    {
        Button divide = (Button) getViewById( R.id.divide );
        assertViewIsVisible( divide );
        assertThat( divide.getText().toString(),
                    equalTo( getString( R.string.divide ) ) );
    }

    @Test
    public void shouldHaveModuloKey() throws Exception
    {
        Button modulo = (Button) getViewById( R.id.modulo );
        assertViewIsVisible( modulo );
        assertThat( modulo.getText().toString(),
                    equalTo( getString( R.string.modulo ) ) );
    }

    @Test
    public void shouldHaveEqualKey() throws Exception
    {
        Button equal = (Button) getViewById( R.id.equal );
        assertViewIsVisible( equal );
        assertThat( equal.getText().toString(),
                    equalTo( getString( R.string.equal ) ) );
    }

    @Test
    public void shouldHaveClearKey() throws Exception
    {
        Button clear = (Button) getViewById( R.id.clear );
        assertViewIsVisible( clear );
        assertThat( clear.getText().toString(),
                    equalTo( getString( R.string.clear ) ) );
    }

    private View getViewById( int id )
    {
        return buttonFragment.getView().findViewById( id );
    }
}
