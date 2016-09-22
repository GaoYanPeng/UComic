package com.lanou3g.you17.search.SearchGridView;
 /*

Created by tliYgTong_刘德强 on 16/9/1.
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
 * 一级搜索页面不同类型GridView点击后进入的详情的Activity的适配器
 */
public class SearchTypeDetailsAdapter extends BaseAdapter {

    private Context context;
    private SearchTypeDetailsBean bean;

    public SearchTypeDetailsAdapter (Context context) {
        this.context = context;
    }

    public void setBean (SearchTypeDetailsBean bean) {
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
        if (convertView == null) {
            convertView = LayoutInflater.from (context).inflate (R.layout.search_item_type_details, null);
            holder = new ViewHolder (convertView);
            convertView.setTag (holder);
        } else {
            holder = (ViewHolder) convertView.getTag ();
        }
        holder.details_name.setText (bean.getData ().getReturnData ().getComics ().get (position).getName ());
        holder.details_type.setText (bean.getData ().getReturnData ().getComics ().get (position).getTags ().toString ());
        holder.details_author.setText (bean.getData ().getReturnData ().getComics ().get (position).getAuthor ());
        holder.details_Introduction.setText (bean.getData ().getReturnData ().getComics ().get (position).getDescription ());
        Glide.with (context).load (bean.getData ().getReturnData ().getComics ().get (position).getCover ()).thumbnail (0.5f).into (holder.details_imageview);
        return convertView;
    }

    class ViewHolder {
        private ImageView details_imageview;
        private TextView details_name, details_type, details_author, details_Introduction;

        private ViewHolder (View view) {
            super ();
            details_imageview = (ImageView) view.findViewById (R.id.details_imageview);
            details_name = (TextView) view.findViewById (R.id.details_name);
            details_type = (TextView) view.findViewById (R.id.details_type);
            details_author = (TextView) view.findViewById (R.id.details_author);
            details_Introduction = (TextView) view.findViewById (R.id.details_Introduction);
        }
    }
}