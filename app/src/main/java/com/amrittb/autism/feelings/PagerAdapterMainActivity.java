package com.amrittb.autism.feelings;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PagerAdapterMainActivity extends FragmentPagerAdapter {

    private static final int NUM_FRAGMENTS = 2;      // Number of tabs
    private static final String[] TAB_NAMES = {"FEELINGS", "SEND TO"};  // Tab titles


    public PagerAdapterMainActivity(FragmentManager fm) {
        super(fm);
    }


    // Indicates which fragment will be called when viewpager is in a certain position
    @Override
    public Fragment getItem(int position) {
        if(position == 0)
            return new EmojiGridFragment();
        else
            return new ContactChecklistFragment();
    }


    @Override
    public int getCount() {
        return NUM_FRAGMENTS;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        return TAB_NAMES[position];
    }
}
