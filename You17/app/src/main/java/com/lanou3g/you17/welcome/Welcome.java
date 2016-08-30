package com.lanou3g.you17.welcome;
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

Created by tliYgTong_刘德强 on 16/8/30.
*/


import android.content.Intent;
import android.os.CountDownTimer;

import com.lanou3g.you17.R;
import com.lanou3g.you17.base.BaseActivity;
import com.lanou3g.you17.mainactivity.MainActivity;

public class Welcome extends BaseActivity{

    //倒计时计时器
    private CountDownTimer timer;
    @Override
    protected int getLayout () {
        return R.layout.welecome_activity;
    }

    @Override
    public void initView () {

    }

    @Override
    protected void initData () {
        //开启倒计时
        //参1:倒计时总时长  参2:倒计时时间间隔
        timer= new CountDownTimer (3000,1000) {
            @Override
            public void onTick (long millisUntilFinished) {

            }

            @Override
            public void onFinish () {
                startActivity (new Intent (Welcome.this, MainActivity.class));
                finish ();
            }
        }.start ();

    }
}
