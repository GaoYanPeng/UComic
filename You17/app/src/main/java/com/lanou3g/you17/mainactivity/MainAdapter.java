package com.lanou3g.you17.mainactivity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.widget.BaseAdapter;

/**继承FragmentPagerAdapter
 * Created by dllo on 16/8/26.
 */
public class MainAdapter extends FragmentPagerAdapter{
    public MainAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return MainTabInfo.getMainTabInfo().get(position).getF();
    }

    @Override
    public int getCount() {
        return MainTabInfo.getMainTabInfo().size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return MainTabInfo.getMainTabInfo().get(position).getTitle();
    }
}
