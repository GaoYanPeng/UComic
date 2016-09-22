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


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.lanou3g.you17.search.SearchGridViewBean;

//一级搜索页面点击推荐GridView进入详情 Tablayout的适配器
public class SearchRecommendedAdapter extends FragmentPagerAdapter {

    private SearchGridViewBean bean;

    public SearchRecommendedAdapter (FragmentManager fm) {
        super (fm);
    }

    @Override
    public Fragment getItem (int position) {
        return SearchRecommendedEntity.getSearchRecommendedEntity ().get (position).getFragment ();
    }

    @Override
    public int getCount () {
        return SearchRecommendedEntity.getSearchRecommendedEntity ().size ();
    }
    //设置标题
    @Override
    public CharSequence getPageTitle (int position) {
        return SearchRecommendedEntity.getSearchRecommendedEntity ().get (position).getTitle ();
//        return bean.getData ().getReturnData ().getTopList ().
//                get (position).getExtra ().getTabList ().get (position).getTabTitle ();

    }

}
