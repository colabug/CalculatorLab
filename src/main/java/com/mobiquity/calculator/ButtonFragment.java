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
import android.widget.Button;
import android.widget.Toast;

import com.mobiquity.calculator.events.NumberButtonEvent;

import static com.mobiquity.calculator.CalculatorApplication.postToBus;

/**
 * @since 1.0
 */
public class ButtonFragment extends Fragment
{
    private static final String TAG = "Lifecycle " + ButtonFragment.class.getSimpleName();
    private View layout;

    @Override
    public View onCreateView( LayoutInflater inflater,
                              ViewGroup container,
                              Bundle savedInstanceState )
    {
        layout = inflater.inflate( R.layout.buttons,
                                   container,
                                   false );
        Log.d( TAG, "onCreateView()" );

        configureNumberKeys();

        return layout;
    }

    private void configureNumberKeys()
    {
        configureNumberKey( R.id.key1 );
        configureNumberKey( R.id.key2 );
        configureNumberKey( R.id.key3 );
        configureNumberKey( R.id.key4 );
        configureNumberKey( R.id.key5 );
        configureNumberKey( R.id.key6 );
        configureNumberKey( R.id.key7 );
        configureNumberKey( R.id.key8 );
        configureNumberKey( R.id.key9 );
        configureNumberKey( R.id.key0 );
    }

    private void configureNumberKey( int id )
    {
        layout.findViewById( id )
              .setOnClickListener( createNumberOnClickListener() );
    }

    private View.OnClickListener createNumberOnClickListener()
    {
        return new View.OnClickListener()
        {
            @Override
            public void onClick( View view )
            {
                String number = ( (Button) view ).getText().toString();
                postToBus( new NumberButtonEvent( number ) );
            }
        };
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
