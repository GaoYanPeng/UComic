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
 * 游戏 热门推荐游戏适配器
 */
public class GameGridViewAdapter extends BaseAdapter{
    private Context context;
    private GameShufflingBean bean;

    public GameGridViewAdapter (Context context) {
        this.context = context;
    }

    public void setBean (GameShufflingBean bean) {
        this.bean = bean;
    }

    @Override
    public int getCount () {
        return bean.getData ().getReturnData ().getGameheader ().getRecommands ().size ();
    }

    @Override
    public Object getItem (int position) {
        return bean.getData ().getReturnData ().getGameheader ().getRecommands ().get (position);
    }

    @Override
    public long getItemId (int position) {
        return position;
    }

    @Override
    public View getView (int position, View convertView, ViewGroup parent) {
        ViewHolder holder=null;
        if (convertView==null){
            convertView= LayoutInflater.from (context).inflate (R.layout.game_item_gridview,parent,false);
            holder=new ViewHolder (convertView);
            convertView.setTag (holder);
        }else {
            holder= (ViewHolder) convertView.getTag ();
        }
        holder.textView.setText (bean.getData ().getReturnData ().getGameheader ().getRecommands ().get (position).getTitle ());
        holder.type.setText (bean.getData ().getReturnData ().getGameheader ().getRecommands ().get (position).getGameType ());
//        holder.size.setText (bean.getData ().getReturnData ().getGameheader ().getRecommands ().get (position).getSize ());
        Glide.with (context).load (bean.getData ().getReturnData ().getGameheader ().getRecommands ().get (position).getLargeCoverUrl ()).thumbnail (0.5f).into (holder.imageView);
        return convertView;
    }

    class ViewHolder{
        private ImageView imageView;
        private TextView textView,type,size;
        private ViewHolder(View view){
            super();
            imageView= (ImageView) view.findViewById (R.id.game_girdview_imageview);
            textView= (TextView) view.findViewById (R.id.game_girdview_textview);
            type= (TextView) view.findViewById (R.id.game_type);
            size= (TextView) view.findViewById (R.id.game_size);

        }
    }
}
