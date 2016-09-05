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

import java.util.ArrayList;
import java.util.List;

/**
 * "我的页面"-消费记录下TabLayout实体类
 */
public class RecordsConsumptionEntity {

    private String title;
    private Fragment fragment;


    public RecordsConsumptionEntity (String title, Fragment fragment) {
        this.title = title;
        this.fragment = fragment;
    }

    public String getTitle () {
        return title;
    }

    public Fragment getFragment () {
        return fragment;
    }

    public static List<RecordsConsumptionEntity> getRecordsConsumptionEntity(){
        List<RecordsConsumptionEntity> recordsConsumptionEntities= new ArrayList<> ();
        recordsConsumptionEntities.add (new RecordsConsumptionEntity ("妖气币记录",new RCCoinRecordsFragment ()));
        recordsConsumptionEntities.add (new RecordsConsumptionEntity ("月票记录",new RCMonthlyTicketRecordFragment ()));
        return recordsConsumptionEntities;
    }
}
