package com.lanou3g.you17.homepage.ranking;

import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;

import com.lanou3g.you17.R;
import com.lanou3g.you17.base.BaseActivity;

/**
 * Created by 高延鹏.on 16/9/2.
 */
public class RankingActivity extends BaseActivity {
    private ViewPager mViewPager;
    private TabLayout mTabLayout;
    @Override
    protected int getLayout() {
        return R.layout.ranking_activity;
    }

    @Override
    public void initView() {
        mViewPager = findView(R.id.ranking_view_pager);
        mTabLayout = findView(R.id.ranking_tab);



    }

    @Override
    protected void initData() {
        RankFmViewPager viewPager = new RankFmViewPager(getSupportFragmentManager());
        mViewPager.setAdapter(viewPager);
        mTabLayout.setupWithViewPager(mViewPager);
        mTabLayout.setSelectedTabIndicatorColor(0x00000000);
        mTabLayout.setTabTextColors(Color.GRAY,0xff8BE057);
        mTabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);

    }
}
