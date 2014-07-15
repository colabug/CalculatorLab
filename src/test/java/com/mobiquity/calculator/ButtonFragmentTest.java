package com.mobiquity.calculator;

import android.widget.Button;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import java.util.ArrayList;

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

    private class ButtonTestValues
    {
        int    id;
        int    stringId;
        String expectedString;

        public ButtonTestValues( int id, int stringId, String expectedString )
        {
            this.id = id;
            this.stringId = stringId;
            this.expectedString = expectedString;
        }
    }

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
    public void shouldVerifyEnglishButtons() throws Exception
    {
        for ( ButtonTestValues button : createEnglishList() )
        {
            verifyButton( button.id,
                          button.stringId,
                          button.expectedString );
        }
    }

    private ArrayList<ButtonTestValues> createEnglishList()
    {
        ArrayList<ButtonTestValues> englishList = new ArrayList<ButtonTestValues>();

        englishList.add( new ButtonTestValues( R.id.key1, R.string.key1, "1" ) );
        englishList.add( new ButtonTestValues( R.id.key2, R.string.key2, "2" ) );
        englishList.add( new ButtonTestValues( R.id.key3, R.string.key3, "3" ) );
        englishList.add( new ButtonTestValues( R.id.key4, R.string.key4, "4" ) );
        englishList.add( new ButtonTestValues( R.id.key5, R.string.key5, "5" ) );
        englishList.add( new ButtonTestValues( R.id.key6, R.string.key6, "6" ) );
        englishList.add( new ButtonTestValues( R.id.key7, R.string.key7, "7" ) );
        englishList.add( new ButtonTestValues( R.id.key8, R.string.key8, "8" ) );
        englishList.add( new ButtonTestValues( R.id.key9, R.string.key9, "9" ) );
        englishList.add( new ButtonTestValues( R.id.key0, R.string.key0, "0" ) );
        englishList.add( new ButtonTestValues( R.id.plus, R.string.plus, "+" ) );
        englishList.add( new ButtonTestValues( R.id.minus, R.string.minus, "-" ) );
        englishList.add( new ButtonTestValues( R.id.multiply, R.string.multiply, "*" ) );
        englishList.add( new ButtonTestValues( R.id.divide, R.string.divide, "/" ) );
        englishList.add( new ButtonTestValues( R.id.modulo, R.string.modulo, "%" ) );
        englishList.add( new ButtonTestValues( R.id.equal, R.string.equal, "=" ) );
        englishList.add( new ButtonTestValues( R.id.clear, R.string.clear, "C" ) );

        return englishList;
    }

    @Test
    @Config (qualifiers = "ja")
    public void shouldHaveJapaneseButtons()
    {
        ArrayList<ButtonTestValues> japaneseList = createJapaneseList();
        for ( ButtonTestValues e : japaneseList )
        {
            verifyButton( e.id, e.stringId, e.expectedString );
        }
    }

    private ArrayList<ButtonTestValues> createJapaneseList()
    {
        ArrayList<ButtonTestValues> japaneseList = new ArrayList<ButtonTestValues>();

        japaneseList.add( new ButtonTestValues( R.id.key1, R.string.key1, "一" ) );
        japaneseList.add( new ButtonTestValues( R.id.key2, R.string.key2, "二" ) );
        japaneseList.add( new ButtonTestValues( R.id.key3, R.string.key3, "三" ) );
        japaneseList.add( new ButtonTestValues( R.id.key4, R.string.key4, "四" ) );
        japaneseList.add( new ButtonTestValues( R.id.key5, R.string.key5, "五" ) );
        japaneseList.add( new ButtonTestValues( R.id.key6, R.string.key6, "六" ) );
        japaneseList.add( new ButtonTestValues( R.id.key7, R.string.key7, "七" ) );
        japaneseList.add( new ButtonTestValues( R.id.key8, R.string.key8, "八" ) );
        japaneseList.add( new ButtonTestValues( R.id.key9, R.string.key9, "九" ) );
        japaneseList.add( new ButtonTestValues( R.id.key0, R.string.key0, "零" ) );

        return japaneseList;
    }

    private void verifyButton( int id, int stringId, String expectedString )
    {
        Button key = (Button) buttonFragment.getView().findViewById( id );
        assertViewIsVisible( key );

        String resourceString = getString( stringId );
        assertThat( key.getText().toString(), equalTo( resourceString ) );
        assertThat( expectedString, equalTo( resourceString ) );
    }
}
