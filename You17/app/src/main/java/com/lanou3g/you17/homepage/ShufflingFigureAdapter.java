package com.lanou3g.you17.homepage;
 /*

Created by tliYgTong_刘德强 on 16/9/3.
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
 * 轮播图适配器
 */
public class ShufflingFigureAdapter extends PagerAdapter {
    private Context context;
    private ShufflingFigureBean bean;
    private int cont = 1;
    private ImageView[] tips;

    public void setTips(ImageView[] tips) {
        this.tips = tips;
    }

    public void setImags (ShufflingFigureBean bean) {
        this.bean = bean;
        cont = bean.getData().getReturnData ().getGalleryItems ().size ();
        notifyDataSetChanged ();
    }

    public ShufflingFigureAdapter (Context context) {
        this.context = context;
    }

    @Override
    public int getCount () {
        return bean!=null? Integer.MAX_VALUE:0;
    }

    @Override
    public boolean isViewFromObject (View view, Object object) {
        return view==object;
    }

    @Override
    public Object instantiateItem (ViewGroup container, int position) {
        View view= LayoutInflater.from (context).inflate (R.layout.item_shuffling_figure,null);
        ImageView ShufflingFigure_ImageView = (ImageView) view.findViewById(R.id.shuffling_figure_image_view);
        Glide.with(context).load(bean.getData ().getReturnData ().getGalleryItems ().get (position%cont).getCover ()).into (ShufflingFigure_ImageView);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem (ViewGroup container, int position, Object object) {

    }
}
