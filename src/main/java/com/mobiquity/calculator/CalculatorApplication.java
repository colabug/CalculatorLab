package com.mobiquity.calculator;

import android.app.Application;

import android.content.res.Configuration;
import android.util.Log;
import com.squareup.otto.Bus;

/**
 * @since 1.0
 */
public class CalculatorApplication extends Application
{
    private static final String TAG = "Lifecycle " + CalculatorApplication.class.getSimpleName();

    private static CalculatorApplication instance = new CalculatorApplication();
//    private CalculatorApplication()
//    {
//    }

    private Bus bus;

    public static CalculatorApplication getInstance()
    {
        return instance;
    }

    public Bus getBus()
    {
        return bus;
    }

    public static void postToBus( BaseEvent event )
    {
        getInstance().getBus().post( event );
    }

    @Override
    public void onCreate()
    {
        super.onCreate();
        instance.bus = new Bus();
        Log.d( TAG, "onCreate()" );
    }

    @Override
    public void onTerminate()
    {
        super.onTerminate();
        Log.d( TAG, "onTerminate()" );
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
}
