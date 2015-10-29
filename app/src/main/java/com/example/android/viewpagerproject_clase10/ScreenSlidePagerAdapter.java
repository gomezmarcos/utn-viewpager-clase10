package com.example.android.viewpagerproject_clase10;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by android on 29/10/15.
 */
public class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter{
    private static final int NUM_PAGES = 3;

    public ScreenSlidePagerAdapter(FragmentManager fm)
    {
        super(fm);
    }

    @Override
    public Fragment getItem(int position)
    {
        // Segun la posicion, creo el fragment correspondiente y lo devuelvo
        switch(position)
        {
            case 0 : return new Pantalla1Fragment();
            case 1 : return new Pantalla2Fragment();
            case 2 : return new Pantalla3Fragment();
        }
        return null;
    }


    // Devolvemos el titulo de cada Fragment
    @Override
    public CharSequence getPageTitle(int position)
    {
        switch(position)
        {
            case 0: return "Salta";
            case 1: return "Santa Cruz";
            default: return "Córdoba";
        }
    }

    @Override
    public int getCount()
    {
        return NUM_PAGES;
    }
}
