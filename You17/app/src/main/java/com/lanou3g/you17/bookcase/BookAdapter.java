package com.lanou3g.you17.bookcase;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by dllo on 16/8/27.
 */
public class BookAdapter extends FragmentPagerAdapter {

    public BookAdapter (FragmentManager fm) {
        super (fm);
    }

    @Override
    public Fragment getItem (int position) {
        return BookTabInfo.getBookTabInfo ().get (position).getF ();
    }

    @Override
    public int getCount () {
        return BookTabInfo.getBookTabInfo ().size ();
    }

    @Override
    public CharSequence getPageTitle (int position) {
        return BookTabInfo.getBookTabInfo ().get (position).getTitle ();
    }
}
