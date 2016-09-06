package com.lanou3g.you17.mine.game;
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


import android.os.Handler;
import android.os.Message;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.lanou3g.you17.R;
import com.lanou3g.you17.base.BaseActivity;
import com.lanou3g.you17.okhttp.NetTool;
import com.lanou3g.you17.okhttp.onHttpCallBack;
import com.lanou3g.you17.tools.API;
import com.lanou3g.you17.tools.MyGridView;

/**
 * 游戏
 */
public class GameActivity extends BaseActivity{
    private ViewPager gameViewPager;
    private boolean mm = true;
    private boolean flags = true;
    private Handler handler;
    private ImageView[] tips;
    private LinearLayout gamelayout;
    private GameShufflingAdapter adapter;
    private GameShufflingBean bean;
    private MyGridView gridView;
    private GameGridViewAdapter mAdapter;
    private ListView listView;
    private GameListViewAdapter sAdapter;


    @Override
    protected int getLayout () {
        return R.layout.mine_game_listview;
    }

    @Override
    public void initView () {
        View view= LayoutInflater.from (this).inflate (R.layout.mine_game_activity,null,false);
        bean = new GameShufflingBean ();
        adapter = new GameShufflingAdapter (this);
        gameViewPager = (ViewPager)view. findViewById (R.id.game_viewPager);
        gamelayout = (LinearLayout) view.findViewById (R.id.gamelayout);
        gameViewPager.setAdapter (adapter);
        gridView= (MyGridView) view.findViewById (R.id.game_recommended);
        mAdapter=new GameGridViewAdapter (this);
        listView= (ListView) findViewById (R.id.game_listView);
        sAdapter=new GameListViewAdapter (this);
        listView.addHeaderView (view);

    }

    @Override
    protected void initData () {
        //        发送消息,给页数+1
        handler = new Handler (new Handler.Callback () {
            @Override
            public boolean handleMessage (Message message) {
                gameViewPager.setCurrentItem (gameViewPager.getCurrentItem () + 1);

                return false;
            }
        });
        if (mm) {
            new Thread (new Runnable () {
                @Override
                public void run () {
                    while (flags) {
                        try {
                            Thread.sleep (3000);
                        } catch (InterruptedException e) {
                            e.printStackTrace ();
                        }
                        handler.sendEmptyMessage (0);
                    }
                }
            }).start ();
            mm = false;
        }

        NetTool.getInstance ().startRequest (API.MINE_GAME, GameShufflingBean.class, new onHttpCallBack<GameShufflingBean> () {
            @Override
            //成功时进行:
            public void onSuccess (final GameShufflingBean response) {
                adapter.setImags (response);
                gameViewPager.addOnPageChangeListener (new OnPageChangeListener () {
                    @Override
                    public void onPageScrolled (int position, float positionOffset, int positionOffsetPixels) {

                    }

                    @Override
                    public void onPageSelected (int position) {
                        for (int i = 0; i < response.getData ().getReturnData ().getGameheader ().getBanner ().size (); i++) {
                            if (i == position % response.getData ().getReturnData ().getGameheader ().getBanner ().size ()) {
                                //选中的小白点
                                tips[i].setImageResource (R.mipmap.icon_game_dot_selected);
                            } else {
                                //未选中的
                                tips[i].setImageResource (R.mipmap.icon_game_dot_unselected);
                            }
                        }
                    }

                    @Override
                    public void onPageScrollStateChanged (int state) {

                    }
                });
                try {
                    tips = new ImageView[response.getData ().getReturnData ().getGameheader ().getBanner ().size ()];
                    for (int i = 0; i < response.getData ().getReturnData ().getGameheader ().getBanner ().size (); i++) {
                        ImageView imageView = new ImageView (getApplicationContext ());
                        imageView.setLayoutParams (new LinearLayout.LayoutParams (15,15));
                        tips[i] = imageView;
                        if (i == 0) {
                            imageView.setImageResource (R.mipmap.icon_game_dot_selected);
                        } else {
                            imageView.setImageResource (R.mipmap.icon_game_dot_unselected);
                        }
                        LinearLayout.LayoutParams layoutParms = new LinearLayout.LayoutParams (15, 15);
                        layoutParms.leftMargin = 5;
                        layoutParms.rightMargin = 5;
                        gamelayout.addView (imageView, layoutParms);
                    }
                    adapter.setTips (tips);
                } catch (Exception e) {

                }
            }

            @Override
            public void onError (Throwable e) {

            }
        });


        //GridView
        NetTool.getInstance ().startRequest (API.MINE_GAME, GameShufflingBean.class, new onHttpCallBack<GameShufflingBean> () {
            @Override
            public void onSuccess (GameShufflingBean response) {
                mAdapter.setBean (response);
                gridView.setAdapter (mAdapter);

            }

            @Override
            public void onError (Throwable e) {

            }
        });


        //listview
        NetTool.getInstance ().startRequest (API.MINE_GAME, GameShufflingBean.class, new onHttpCallBack<GameShufflingBean> () {
            @Override
            public void onSuccess (GameShufflingBean response) {
                sAdapter.setBean (response);
                listView.setAdapter (sAdapter);
            }

            @Override
            public void onError (Throwable e) {

            }
        });
    }


}

