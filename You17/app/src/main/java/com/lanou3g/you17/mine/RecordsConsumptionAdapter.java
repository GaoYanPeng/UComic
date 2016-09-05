package com.lanou3g.you17.mine;
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

Created by tliYgTong_刘德强 on 16/9/3.
*/


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class RecordsConsumptionAdapter extends FragmentPagerAdapter{


    public RecordsConsumptionAdapter (FragmentManager fm) {
        super (fm);
    }

    @Override
    public Fragment getItem (int position) {
        //Viewpager对应的页面显示对应的Fragment
        return RecordsConsumptionEntity.getRecordsConsumptionEntity ().get (position).getFragment ();
    }

    @Override
    public int getCount () {
        //决定ViewPager对应的页显示对应的Fragment
        return RecordsConsumptionEntity.getRecordsConsumptionEntity ().size ();
    }

    @Override
    public CharSequence getPageTitle (int position) {
        //决定对应的标题
        return RecordsConsumptionEntity.getRecordsConsumptionEntity ().get (position).getTitle ();
    }
}
