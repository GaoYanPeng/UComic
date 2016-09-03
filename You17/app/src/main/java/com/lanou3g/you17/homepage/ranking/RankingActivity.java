package com.lanou3g.you17.homepage.ranking;

import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;

import com.lanou3g.you17.R;
import com.lanou3g.you17.base.BaseActivity;

/**
 * Created by 高延鹏.on 16/9/2.
 */
public class RankingActivity extends BaseActivity implements OnClickListener{
    private ViewPager mViewPager;
    private TabLayout mTabLayout;
    private RelativeLayout mDelete;
    @Override
    protected int getLayout() {
        return R.layout.ranking_activity;
    }

    @Override
    public void initView() {
        mViewPager = findView(R.id.ranking_view_pager);
        mTabLayout = findView(R.id.ranking_tab);
        mDelete = findView(R.id.ranking_delete);

        mDelete.setOnClickListener(this);



    }

    @Override
    protected void initData() {
        RankFmViewPager viewPager = new RankFmViewPager(getSupportFragmentManager());
        mViewPager.setAdapter(viewPager);
        mTabLayout.setupWithViewPager(mViewPager);
        mTabLayout.setSelectedTabIndicatorColor(0xff8BE057);
        mTabLayout.setTabTextColors(Color.GRAY,0xff8BE057);
        mTabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ranking_delete:
                finish();
                break;
        }
    }
}
