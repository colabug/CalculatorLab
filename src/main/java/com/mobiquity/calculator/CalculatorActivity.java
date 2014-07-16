package com.mobiquity.calculator;

import android.app.Activity;
import android.app.Fragment;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.mobiquity.calculator.events.NumberButtonEvent;

import com.squareup.otto.Bus;
import com.squareup.otto.Subscribe;

public class CalculatorActivity extends Activity
{
    private static final String TAG = "Lifecycle " + CalculatorActivity.class.getSimpleName();

    protected static final String CALCULATOR_STATE_FRAGMENT_TAG = "calculator state";

    @Override
    public void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.main );
        Log.d( TAG, "onCreate()" );

        getFragmentManager().beginTransaction()
                            .add( new CalculatorStateFragment(),
                                  CALCULATOR_STATE_FRAGMENT_TAG )
                            .commit();
    }

    /**
     * Handles the selection of a number.
     *
     * @param event - number entered
     */
    @Subscribe
    public void onNumberSelected( NumberButtonEvent event )
    {
        Toast.makeText( this,
                        "Clicked: " + event.getNumber(),
                        Toast.LENGTH_SHORT )
             .show();
    }

    @Override
    protected void onRestoreInstanceState( Bundle savedInstanceState )
    {
        super.onRestoreInstanceState( savedInstanceState );
        Log.d( TAG, "onRestoreInstanceState()" );
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        Log.d( TAG, "onStart()" );
    }

    @Override
    protected void onRestart()
    {
        super.onRestart();
        Log.d( TAG, "onRestart()" );
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        Log.d( TAG, "onResume()" );
        getBus().register( this );
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        Log.d( TAG, "onPause()" );
        getBus().unregister( this );
    }

    protected Bus getBus()
    {
        return CalculatorApplication.getInstance().getBus();
    }

    @Override
    protected void onPostResume()
    {
        super.onPostResume();
        Log.d( TAG, "onPostResume()" );
    }

    @Override
    protected void onSaveInstanceState( Bundle outState )
    {
        super.onSaveInstanceState( outState );
        Log.d( TAG, "onSaveInstanceState()" );
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        Log.d( TAG, "onStop()" );
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.d( TAG, "onDestroy()" );
    }

    @Override
    public void onConfigurationChanged( Configuration newConfig )
    {
        super.onConfigurationChanged( newConfig );
        Log.d( TAG, "onConfigurationChanged()" );
    }

    @Override
    public void onLowMemory()
    {
        super.onLowMemory();
        Log.d( TAG, "onLowMemory()" );
    }

    @Override
    public void onTrimMemory( int level )
    {
        super.onTrimMemory( level );
        Log.d( TAG, "onTrimMemory()" );
    }

    @Override
    public void onAttachFragment( Fragment fragment )
    {
        super.onAttachFragment( fragment );
        Log.d( TAG, "onAttachFragment()" );
    }
}
