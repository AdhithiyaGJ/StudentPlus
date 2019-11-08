package com.example.studentplus;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class pageAdapter extends FragmentPagerAdapter {

    private int numOfTabs;

    pageAdapter(FragmentManager fm, int numOfTabs)
    {
        super(fm);
        this.numOfTabs = numOfTabs;


    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch(position)
        {
            case 0:
                return new tab1Fragment();

            case 1:
                return new tab2Fragment();

             default:
                 return null;


        }
    }

    public int getCount()
    {
        return numOfTabs;
    }
}
