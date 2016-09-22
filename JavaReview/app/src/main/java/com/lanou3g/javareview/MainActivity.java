package com.lanou3g.javareview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        //功能:生成随机数
        Random random=new Random ();
        //生成的随机数存在变量num中
        //产生范围是a~b的数
        //random.nextInt (b-a+1)+a;
        int num=random.nextInt (5-2+1)+2;
        //随机数范围是2~5
        Log.d ("MainActivity", "taohaha" + num);



    }
}
