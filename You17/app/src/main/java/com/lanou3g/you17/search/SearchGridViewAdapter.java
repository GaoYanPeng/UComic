package com.lanou3g.you17.search;
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

Created by tliYgTong_刘德强 on 16/8/31.
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

public class SearchGridViewAdapter extends BaseAdapter{

    private Context context;
    private SearchGridViewBean bean;

    public SearchGridViewAdapter (Context context) {
        this.context = context;
    }

    public void setBean (SearchGridViewBean bean) {
        this.bean = bean;
    }

    @Override
    public int getCount () {
        return bean.getData ().getReturnData ().getRankinglist ().size ();
    }

    @Override
    public Object getItem (int position) {
        return bean.getData ().getReturnData ().getRankinglist ().get (position);
    }

    @Override
    public long getItemId (int position) {
        return position;
    }

    @Override
    public View getView (int position, View convertView, ViewGroup parent) {
        ViewHolder holder=null;
        if (convertView==null){
            convertView= LayoutInflater.from (context).inflate (R.layout.search_item_gridview,parent,false);
            holder=new ViewHolder (convertView);
            convertView.setTag (holder);
        }else {
            holder= (ViewHolder) convertView.getTag ();
        }
        holder.textView.setText (bean.getData ().getReturnData ().getRankinglist ().get (position).getSortName ());
        Glide.with (context).load (bean.getData ().getReturnData ().getRankinglist ().get (position).getCover ()).into (holder.imageView);
        return convertView;
    }

    class ViewHolder{
        private ImageView imageView;
        private TextView textView;
        private ViewHolder(View view){
            super();
            imageView= (ImageView) view.findViewById (R.id.search_girdview_imageview);
            textView= (TextView) view.findViewById (R.id.search_girdview_textview);
        }
    }
}
