package com.mobiquity.support;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;

import org.robolectric.Robolectric;

/**
 * @since 1.0
 */
public class FragmentUtil
{
    public static void startFragment( Fragment fragment )
    {
        Activity activity = createActivity();

        FragmentManager fragmentManager = activity.getFragmentManager();
        fragmentManager.beginTransaction()
                       .add( fragment, null )
                       .commit();
    }

    private static Activity createActivity()
    {
        return Robolectric.buildActivity( Activity.class )
                          .create()
                          .start()
                          .resume()
                          .get();
    }
}
