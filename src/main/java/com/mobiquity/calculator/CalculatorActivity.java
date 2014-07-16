package com.mobiquity.calculator;

import android.app.Activity;
import android.app.Fragment;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;

public class CalculatorActivity extends Activity
{
    private static final String TAG = "Lifecycle " + CalculatorActivity.class.getSimpleName();

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.main );
        Log.d( TAG, "onCreate()" );
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
    protected void onPause()
    {
        super.onPause();
        Log.d( TAG, "onPause()" );
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
