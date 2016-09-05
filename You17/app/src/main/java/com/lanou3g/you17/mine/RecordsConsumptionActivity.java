package com.lanou3g.you17.mine;
 /*
Created by tliYgTong_刘德强 on 16/9/3.
*/

import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

import com.lanou3g.you17.R;
import com.lanou3g.you17.base.BaseActivity;

/**
 * "我的"页面 - 消费记录
 */
public class RecordsConsumptionActivity extends BaseActivity implements OnClickListener{

    private ImageView recordsConsumption_back;
    private TabLayout tablayout;
    private ViewPager viewpager;


    @Override
    protected int getLayout () {
        return R.layout.mine_records_consumption;
    }

    @Override
    public void initView () {
        recordsConsumption_back= (ImageView) findViewById (R.id.recordsConsumption_back);
        recordsConsumption_back.setOnClickListener (this);
        tablayout= (TabLayout) findViewById (R.id.consumption_tablayout);
        viewpager= (ViewPager) findViewById (R.id.consumption_viewpager);

    }

    @Override
    protected void initData () {
        RecordsConsumptionAdapter adapter
                =new RecordsConsumptionAdapter (getSupportFragmentManager ());
        viewpager.setAdapter (adapter);
        tablayout.setupWithViewPager (viewpager);
        int tabCount= tablayout.getTabCount ();
        for (int i = 0; i < tabCount; i++) {
            TabLayout.Tab tab =tablayout.getTabAt (i);
        }
        //参1: 未选中标题颜色  参2:选中标题颜色
        tablayout.setTabTextColors (Color.GRAY,Color.BLACK);
        //导航下划线颜色
        tablayout.setSelectedTabIndicatorColor (Color.BLACK);



    }

    @Override
    public void onClick (View v) {
        switch (v.getId ()){
            case R.id.recordsConsumption_back:
                finish ();
                break;
        }
    }
}
