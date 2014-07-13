package com.mobiquity.calculator;

import android.view.View;
import android.widget.Button;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.robolectric.RobolectricTestRunner;

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
        Button key1 = (Button) getViewById( R.id.key1 );
        assertViewIsVisible( key1 );
        assertThat( key1.getText().toString(),
                    equalTo( getString( R.string.key1 ) ) );
    }

    @Test
    public void shouldHave2Key() throws Exception
    {
        Button key2 = (Button) getViewById( R.id.key2 );
        assertViewIsVisible( key2 );
        assertThat( key2.getText().toString(),
                    equalTo( getString( R.string.key2 ) ) );
    }

    @Test
    public void shouldHave3Key() throws Exception
    {
        Button key3 = (Button) getViewById( R.id.key3 );
        assertViewIsVisible( key3 );
        assertThat( key3.getText().toString(),
                    equalTo( getString( R.string.key3 ) ) );
    }

    @Test
    public void shouldHave4Key() throws Exception
    {
        Button key4 = (Button) getViewById( R.id.key4 );
        assertViewIsVisible( key4 );
        assertThat( key4.getText().toString(),
                    equalTo( getString( R.string.key4 ) ) );
    }

    @Test
    public void shouldHave5Key() throws Exception
    {
        Button key5 = (Button) getViewById( R.id.key5 );
        assertViewIsVisible( key5 );
        assertThat( key5.getText().toString(),
                    equalTo( getString( R.string.key5 ) ) );
    }

    @Test
    public void shouldHave6Key() throws Exception
    {
        Button key6 = (Button) getViewById( R.id.key6 );
        assertViewIsVisible( key6 );
        assertThat( key6.getText().toString(),
                    equalTo( getString( R.string.key6 ) ) );
    }

    @Test
    public void shouldHave7Key() throws Exception
    {
        Button key7 = (Button) getViewById( R.id.key7 );
        assertViewIsVisible( key7 );
        assertThat( key7.getText().toString(),
                    equalTo( getString( R.string.key7 ) ) );
    }

    @Test
    public void shouldHave8Key() throws Exception
    {
        Button key8 = (Button) getViewById( R.id.key8 );
        assertViewIsVisible( key8 );
        assertThat( key8.getText().toString(),
                    equalTo( getString( R.string.key8 ) ) );
    }

    @Test
    public void shouldHave9Key() throws Exception
    {
        Button key9 = (Button) getViewById( R.id.key9 );
        assertViewIsVisible( key9 );
        assertThat( key9.getText().toString(),
                    equalTo( getString( R.string.key9 ) ) );
    }

    @Test
    public void shouldHave0Key() throws Exception
    {
        Button key0 = (Button) getViewById( R.id.key0 );
        assertViewIsVisible( key0 );
        assertThat( key0.getText().toString(),
                    equalTo( getString( R.string.key0 ) ) );
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
