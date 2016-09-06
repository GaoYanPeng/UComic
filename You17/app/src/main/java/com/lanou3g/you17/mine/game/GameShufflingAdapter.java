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


import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.lanou3g.you17.R;

/**
 * 游戏-轮播图适配器
 */
public class GameShufflingAdapter extends PagerAdapter{
    private Context context;
    private GameShufflingBean bean;
    private int cont = 1;
    private ImageView[] tips;

    public void setTips(ImageView[] tips) {
        this.tips = tips;
    }

    public void setImags (GameShufflingBean bean) {
        this.bean = bean;
        cont = bean.getData().getReturnData ().getGameheader ().getBanner ().size ();
        notifyDataSetChanged ();
    }

    public GameShufflingAdapter (Context context) {
        this.context = context;
    }

    @Override
    public int getCount () {
        return bean!=null?Integer.MAX_VALUE:0;
    }

    @Override
    public boolean isViewFromObject (View view, Object object) {
        return view==object;
    }

    @Override
    public Object instantiateItem (ViewGroup container, int position) {
        View view= LayoutInflater.from (context).inflate (R.layout.mine_game_shuffling,null);
        ImageView gameShufflingImageView = (ImageView) view.findViewById(R.id.gameShufflingImageView);
        Glide.with(context).load(bean.getData ().getReturnData ().getGameheader ().getBanner ().get (position%cont).getCoverUrl ()).into (gameShufflingImageView);
        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem (ViewGroup container, int position, Object object) {

    }
}
