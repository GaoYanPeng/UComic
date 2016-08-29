package com.lanou3g.you17.mainactivity;

import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Toast;

import com.lanou3g.you17.R;
import com.lanou3g.you17.base.BaseActivity;

public class MainActivity extends BaseActivity {
    private ViewPager mainPager;
    private TabLayout mTabLayout;
    private long firstTime = 0;


    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    public void initView() {
        mainPager = findView(R.id.main_activity_pager);
        mTabLayout = findView(R.id.main_activity_tab);
    }

    @Override
    protected void initData() {
        MainAdapter adapter = new MainAdapter(getSupportFragmentManager());
        mainPager.setAdapter(adapter);
        mTabLayout.setupWithViewPager(mainPager);
        mTabLayout.setSelectedTabIndicatorColor(0x00000000);
        mTabLayout.setTabTextColors(Color.GRAY,0xff8BE057);
//        mViewPager.setCurrentItem(1);
        int tabCont = mTabLayout.getTabCount();
        for (int i = 0; i < tabCont; i++) {
            TabLayout.Tab tab = mTabLayout.getTabAt(i);

            tab.setIcon(MainTabInfo.getMainTabInfo().get(i).getImageId());
        }

    }
    //第二中退出程序
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch (keyCode) {
            case KeyEvent.KEYCODE_BACK:
                long secondTime = System.currentTimeMillis();
                if (secondTime - firstTime > 2000) {
                    Toast.makeText(this, "再按一次返回键退出应用", Toast.LENGTH_SHORT).show();
                    firstTime = secondTime;//更新firstTime
                    return true;
                } else {
                    System.exit(0);
                }
                break;
        }
        return super.onKeyDown(keyCode, event);
    }

}
