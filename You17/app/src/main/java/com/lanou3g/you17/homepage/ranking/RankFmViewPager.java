package com.lanou3g.you17.homepage.ranking;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by 高延鹏.on 16/9/3.
 */
public class RankFmViewPager extends FragmentStatePagerAdapter {
    private  String[] titles = {"月票","点击","吐槽","另类","恐怖","爆笑","新作","感动"};
    public RankFmViewPager(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return RankingFragment.newInstance(position);
    }

    @Override
    public int getCount() {
        return titles.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return  titles[position];
    }
}
