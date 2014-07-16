package com.mobiquity.calculator;

import android.app.Activity;
import android.app.Fragment;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @since 1.0
 */
public class ButtonFragment extends Fragment
{
    private static final String TAG = "Lifecycle " + ButtonFragment.class.getSimpleName();

    @Override
    public View onCreateView( LayoutInflater inflater,
                              ViewGroup container,
                              Bundle savedInstanceState )
    {
        View layout = inflater.inflate( R.layout.buttons,
                                        container,
                                        false );
        Log.d( TAG, "onCreateView()" );

        return layout;
    }

    @Override
    public void onInflate( Activity activity,
                           AttributeSet attrs,
                           Bundle savedInstanceState )
    {
        super.onInflate( activity, attrs, savedInstanceState );
        Log.d( TAG, "onInflate()" );
    }

    @Override
    public void onAttach( Activity activity )
    {
        super.onAttach( activity );
        Log.d( TAG, "onAttach()" );
    }

    @Override
    public void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        Log.d( TAG, "onCreate()" );
    }

    @Override
    public void onViewCreated( View view, Bundle savedInstanceState )
    {
        super.onViewCreated( view, savedInstanceState );
        Log.d( TAG, "onViewCreated()" );
    }

    @Override
    public void onActivityCreated( Bundle savedInstanceState )
    {
        super.onActivityCreated( savedInstanceState );
        Log.d( TAG, "onActivityCreated()" );
    }

    @Override
    public void onStart()
    {
        super.onStart();
        Log.d( TAG, "onStart()" );
    }

    @Override
    public void onResume()
    {
        super.onResume();
        Log.d( TAG, "onResume()" );
    }

    @Override
    public void onConfigurationChanged( Configuration newConfig )
    {
        super.onConfigurationChanged( newConfig );
        Log.d( TAG, "onConfigurationChanged()" );
    }

    @Override
    public void onSaveInstanceState( Bundle outState )
    {
        super.onSaveInstanceState( outState );
        Log.d( TAG, "onSaveInstanceState()" );
    }

    @Override
    public void onPause()
    {
        super.onPause();
        Log.d( TAG, "onPause()" );
    }

    @Override
    public void onStop()
    {
        super.onStop();
        Log.d( TAG, "onStop()" );
    }

    @Override
    public void onLowMemory()
    {
        super.onLowMemory();
        Log.d( TAG, "onLowMemory()" );
    }

    @Override
    public void onDestroyView()
    {
        super.onDestroyView();
        Log.d( TAG, "onDestroyView()" );
    }

    @Override
    public void onTrimMemory( int level )
    {
        super.onTrimMemory( level );
        Log.d( TAG, "onTrimMemory()" );
    }

    @Override
    public void onDestroy()
    {
        super.onDestroy();
        Log.d( TAG, "onDestroy()" );
    }

    @Override
    public void onDetach()
    {
        super.onDetach();
        Log.d( TAG, "onDetach()" );
    }
}
