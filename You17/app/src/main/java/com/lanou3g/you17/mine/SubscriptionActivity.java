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

Created by tliYgTong_刘德强 on 16/9/5.
*/

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

import com.lanou3g.you17.R;
import com.lanou3g.you17.base.BaseActivity;

/**
 * "我的"- 我的订阅
 */
public class SubscriptionActivity extends BaseActivity implements OnClickListener{

    private ImageView subscribe_back;
    @Override
    protected int getLayout () {
        return R.layout.subscription_activity;
    }

    @Override
    public void initView () {
        subscribe_back=findView (R.id.subscribe_back);
        subscribe_back.setOnClickListener (this);

    }

    @Override
    protected void initData () {

    }

    @Override
    public void onClick (View v) {
        switch (v.getId ()){
            case R.id.subscribe_back:
                finish ();
                break;
        }

    }
}
