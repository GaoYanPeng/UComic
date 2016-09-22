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

Created by tliYgTong_刘德强 on 16/9/20.
*/

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.lanou3g.you17.R;
import com.lanou3g.you17.search.SearchGridViewBean;

//一级搜索界面中间四个ImageView的GridView适配器
public class SearchTitleGirdViewAdapter extends BaseAdapter {

    private Context context;
    private SearchGridViewBean bean;

    public SearchTitleGirdViewAdapter (Context context) {
        this.context = context;
    }

    public void setBean (SearchGridViewBean bean) {
        this.bean = bean;
    }

    @Override
    public int getCount () {
        return bean.getData ().getReturnData ().getTopList ().size ();
    }

    @Override
    public Object getItem (int position) {
        return bean.getData ().getReturnData ().getRankingList ().get (position);
    }

    @Override
    public long getItemId (int position) {
        return position;
    }

    @Override
    public View getView (int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        Intent intent = new Intent ();
        if (convertView == null) {
            convertView = LayoutInflater.from (context).inflate (R.layout.search_item_title_girdview, null);
            holder = new ViewHolder (convertView);
            convertView.setTag (holder);
        } else {
            holder = (ViewHolder) convertView.getTag ();
        }
        Glide.with (context).load (bean.getData ().getReturnData ().getTopList ().get (position).getCover ()).into (holder.imageView);
        return convertView;
    }

    class ViewHolder {
        private ImageView imageView;
        private String title;

        public ViewHolder (View view) {
            super ();
            imageView = (ImageView) view.findViewById (R.id.title_girdview_img);
        }
    }
}
