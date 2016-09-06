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
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.lanou3g.you17.R;

/**
 * 游戏 Top10 适配器
 */
public class GameListViewAdapter extends BaseAdapter {

    private Context context;
    private GameShufflingBean bean;

    public GameListViewAdapter (Context context) {
        this.context = context;
    }

    public void setBean (GameShufflingBean bean) {
        this.bean = bean;
    }

    @Override
    public int getCount () {
        return bean.getData ().getReturnData ().getItemList ().size ();
    }

    @Override
    public Object getItem (int position) {
        return bean.getData ().getReturnData ().getItemList ().get (position);
    }

    @Override
    public long getItemId (int position) {
        return position;
    }

    @Override
    public View getView (int position, View convertView, ViewGroup parent) {
        ViewHolder holder=null;
        if (convertView==null){
            convertView= LayoutInflater.from (context).inflate (R.layout.game_item_listview,null);
            holder=new ViewHolder (convertView);
            convertView.setTag (holder);
        }else {
            holder= (ViewHolder) convertView.getTag ();
        }
        holder.gameName.setText (bean.getData ().getReturnData ().getItemList ().get (position).getTitle ());
        holder.gameNum.setText (bean.getData ().getReturnData ().getItemList ().get (position).getDownloadTimes ()+"");
        holder.gameSpecies.setText (bean.getData ().getReturnData ().getItemList ().get (position).getGameType ());
        Glide.with (context).load (bean.getData ().getReturnData ().getItemList ().get (position).getLargeCoverUrl ()).into (holder.gameImg);
        return convertView;
    }

    class ViewHolder {
        private ImageView gameImg;
        private TextView gameName,gameNum,gameSpecies;

        private ViewHolder(View view){
            super();
            gameImg= (ImageView) view.findViewById (R.id.gameImg);
            gameName= (TextView) view.findViewById (R.id.gameName);
            gameNum= (TextView) view.findViewById (R.id.gameNum);
            gameSpecies= (TextView) view.findViewById (R.id.gameSpecies);
        }
    }
}
