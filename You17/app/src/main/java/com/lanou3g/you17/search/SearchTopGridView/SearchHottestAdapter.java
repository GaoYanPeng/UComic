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

Created by Android_刘德强 on 16/9/23.
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
import com.lanou3g.you17.search.SearchGridViewBean;

import java.math.BigDecimal;

//一级界面点击上方四个GridView进入详情后Adapter
//今日最热
public class SearchHottestAdapter extends BaseAdapter {


    private Context context;
    private SearchHottestBean bean;
    private SearchGridViewBean mBean;

    public SearchHottestAdapter (Context context) {
        this.context = context;
    }

    public void setBean (SearchHottestBean bean) {
        this.bean = bean;
        notifyDataSetChanged ();
    }

    public void setmBean (SearchGridViewBean mBean) {
        this.mBean = mBean;
    }

    @Override
    public int getCount () {
        return bean.getData ().getReturnData ().getComics ().size ();
    }

    @Override
    public Object getItem (int position) {
        return bean.getData ().getReturnData ().getComics ().get (position);
    }

    @Override
    public long getItemId (int position) {
        return position;
    }

    @Override
    public View getView (int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        String species ;
        int flag;
        if (convertView == null) {
            convertView = LayoutInflater.from (context).inflate (R.layout.search_item_sentiment, null);
            holder = new ViewHolder (convertView);
            convertView.setTag (holder);
        } else {
            holder = (ViewHolder) convertView.getTag ();
        }
        Glide.with (context).load (bean.getData ().getReturnData ().getComics ().get (position).getCover ()).thumbnail (0.5f).into (holder.Sentiment_imageview);
        holder.Sentiment_name.setText (bean.getData ().getReturnData ().getComics ().get (position).getName ());
        holder.Sentiment_author.setText (bean.getData ().getReturnData ().getComics ().get (position).getAuthor ());
        holder.Sentiment_Introduction.setText (bean.getData ().getReturnData ().getComics ().get (position).getDescription ());
        holder.Sentiment_type.setText (bean.getData ().getReturnData ().getComics ().get (position).getTags ().toString ());
//        species=mBean.getData ().getReturnData ().getTopList ().get (position).getExtra ().getTabList ().get (0).getTabTitle ();
//        if (species=="近日更新"){
//            holder.ClickOnTheQuantity.setText ("");
//        }else {
        float ConTag = Float.parseFloat (bean.getData ().getReturnData ().getComics ().get (position).getConTag ()) / 10000;
        BigDecimal b = new BigDecimal (ConTag);
        ConTag = b.setScale (2, BigDecimal.ROUND_HALF_UP).floatValue ();
        String p = Float.toString (ConTag);
        holder.Click_on_quantity.setText ("总点击");
        holder.Ten_thousand.setText ("万");
        holder.ClickOnTheQuantity.setText (p);
        flag = bean.getData ().getReturnData ().getComics ().get (position).getFlag ();
        if (flag == 1) {
            holder.permissions_imageview.setImageResource (R.mipmap.icon_comic_pay);
        } else if (flag == 3) {
            holder.permissions_imageview.setImageResource (R.mipmap.icon_comic_vip);
        } else {
            holder.permissions_imageview.setImageResource (R.mipmap.icon_game_dot_selected);
        }
        switch (position){
            case 0:
                holder.ranking_ImageView.setImageResource (R.mipmap.icon_ranking_first);
                break;
            case 1:
                holder.ranking_ImageView.setImageResource (R.mipmap.icon_ranking_second);
                break;
            case 2:
                holder.ranking_ImageView.setImageResource (R.mipmap.icon_ranking_third);
                break;
            default:
                holder.ranking_ImageView.setImageResource (R.mipmap.icon_game_dot_selected);
                break;
        }
//    }
        return convertView;
    }

    class ViewHolder {
        private ImageView Sentiment_imageview,permissions_imageview,ranking_ImageView;
        private TextView Sentiment_name, Sentiment_type, Sentiment_author, Sentiment_Introduction, ClickOnTheQuantity,
                Click_on_quantity, Ten_thousand;

        private ViewHolder (View view) {
            super ();
            Sentiment_imageview = (ImageView) view.findViewById (R.id.Sentiment_imageview);
            Sentiment_name = (TextView) view.findViewById (R.id.Sentiment_name);
            Sentiment_author = (TextView) view.findViewById (R.id.Sentiment_author);
            Sentiment_type = (TextView) view.findViewById (R.id.Sentiment_type);
            Sentiment_Introduction = (TextView) view.findViewById (R.id.Sentiment_Introduction);
            ClickOnTheQuantity = (TextView) view.findViewById (R.id.ClickOnTheQuantity);
            Click_on_quantity = (TextView) view.findViewById (R.id.Click_on_quantity);
            Ten_thousand = (TextView) view.findViewById (R.id.Ten_thousand);
            permissions_imageview= (ImageView) view.findViewById (R.id.permissions_imageview);
            ranking_ImageView= (ImageView) view.findViewById (R.id.ranking_ImageView);
        }
    }
}
