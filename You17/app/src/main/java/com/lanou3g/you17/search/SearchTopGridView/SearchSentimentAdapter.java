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

import java.math.BigDecimal;

//一级界面点击上方四个GridView进入详情后Adapter
//人气总榜.2
public class SearchSentimentAdapter extends BaseAdapter {


    private Context context;
    private SearchHottestBean bean;

    public SearchSentimentAdapter (Context context) {
        this.context = context;
    }

    public void setBean (SearchHottestBean bean) {
        this.bean = bean;
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
        float i = 0;
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
        i = Float.parseFloat (bean.getData ().getReturnData ().getComics ().get (position).getConTag ());
        if (i >= 10000 && i < 100000000) {
            i = i / 10000;
            BigDecimal b = new BigDecimal (i);
            i = b.setScale (2, BigDecimal.ROUND_HALF_UP).floatValue ();
            holder.Ten_thousand.setText ("万");
        } else if (i >= 100000000) {
            i = i / 100000000;
            BigDecimal b = new BigDecimal (i);
            i = b.setScale (2, BigDecimal.ROUND_HALF_UP).floatValue ();
            holder.Ten_thousand.setText ("亿");
        }
        String p = Float.toString (i);
        holder.Click_on_quantity.setText ("总点击");
        holder.ClickOnTheQuantity.setText (p);
        return convertView;
    }

    class ViewHolder {
        private ImageView Sentiment_imageview;
        private TextView Sentiment_name, Sentiment_type, Sentiment_author, Sentiment_Introduction, Click_on_quantity, Ten_thousand, ClickOnTheQuantity;

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
        }
    }
}
