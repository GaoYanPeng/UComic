package com.lanou3g.you17.search.SearchTopGridView;
 /*
                   _ooOoo_
                  o8888888o
                  88" . "88
                  (| -_- |)
                  O\  =  /O
               ____/`---'\____
             .'  \\|     |//  `.
            /  \\|||  :  |||//  \
           /  _||||| -:- |||||-  \
           |   | \\\  -  /// |   |
           | \_|  ''\---/''  |   |
           \  .-\__  `-`  ___/-. /
         ___`. .'  /--.--\  `. . __
      ."" '<  `.___\_<|>_/___.'  >'"".
     | | :  `- \`.;`\ _ /`;.`/ - ` : | |
     \  \ `-.   \_ __\ /__ _/   .-` /  /
======`-.____`-.___\_____/___.-`____.-'======
                   `=---='
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
         佛祖保佑       永无BUG

Created by Android_刘德强 on 16/9/21.
*/

import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

import com.lanou3g.you17.R;
import com.lanou3g.you17.base.BaseActivity;
import com.lanou3g.you17.okhttp.NetTool;
import com.lanou3g.you17.okhttp.onHttpCallBack;
import com.lanou3g.you17.search.SearchGridViewBean;
import com.lanou3g.you17.tools.API;

//一级搜索界面点击上方GridView进入详情
public class SearchRecommendedActivity extends BaseActivity implements OnClickListener {

    private ImageView search_recommended_back;
    private TextView Gridview_recommended_type;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected int getLayout () {
        return R.layout.searchrecommended;
    }

    @Override
    public void initView () {
        search_recommended_back = (ImageView) findViewById (R.id.search_recommended_back);
        search_recommended_back.setOnClickListener (this);
        Gridview_recommended_type = (TextView) findViewById (R.id.Gridview_recommended_type);
        tabLayout = (TabLayout) findViewById (R.id.recommended_tablayout);
        viewPager = (ViewPager) findViewById (R.id.recommended_viewpager);
    }

    @Override
    protected void initData () {
        SearchRecommendedAdapter adapter = new SearchRecommendedAdapter (getSupportFragmentManager ());
        viewPager.setAdapter (adapter);
        tabLayout.setupWithViewPager (viewPager);
        //参1: 未选中标题颜色  参2:选中标题颜色
        tabLayout.setTabTextColors (Color.GRAY, Color.GREEN);
        //导航下划线颜色
        tabLayout.setSelectedTabIndicatorColor (0xFFFFFFF);
        NetTool.getInstance ().startRequest (API.API_SEARCH_GRIDVIEW, SearchGridViewBean.class, new onHttpCallBack<SearchGridViewBean> () {
            @Override
            public void onSuccess (SearchGridViewBean response) {
                String type = getIntent ().getStringExtra ("recommended_type");
                Gridview_recommended_type.setText (type);

            }

            @Override
            public void onError (Throwable e) {

            }
        });



    }

    @Override
    public void onClick (View v) {
        switch (v.getId ()) {
            case R.id.search_recommended_back:
                finish ();
                break;
        }
    }
}
