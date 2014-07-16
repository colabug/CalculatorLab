package com.mobiquity.calculator;

import android.app.Fragment;

import com.mobiquity.calculator.events.BaseEvent;

import com.squareup.otto.Bus;

/**
 * Base fragment
 *
 * @since 1.0
 */
public class BaseFragment extends Fragment
{
    public void postToBus( BaseEvent event )
    {
        CalculatorApplication.postToBus( event );
    }

    @Override
    public void onResume()
    {
        super.onResume();
        registerWithBus();
    }

    @Override
    public void onPause()
    {
        super.onPause();
        unRegisterFromBus();
    }

    private void registerWithBus()
    {
        getBus().register( this );
    }

    private void unRegisterFromBus()
    {
        getBus().unregister( this );
    }

    protected Bus getBus()
    {
        return CalculatorApplication.getInstance().getBus();
    }
}
