package com.lanou3g.recyclerviewdemo;
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
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class ViewHolder extends RecyclerView.ViewHolder{

    private Context context;
    private View mView;  //行布局
    //类似lsi Map,用id来存放想要的view
    private SparseArray<View> viewSparseArray;


    public ViewHolder (View itemView, Context context) {
        super (itemView);
        this.context = context;
        mView=itemView;
        viewSparseArray=new SparseArray<> ();
    }


    public  static ViewHolder createViewHolder(Context context, ViewGroup parent, int layoutId){
        View itemView= LayoutInflater.from (context).inflate (layoutId,parent,false);
        ViewHolder holder=new ViewHolder (itemView,context);
        return holder;

    }


    /**
     * 通过Id 获取我们想要的View
     * @param layoutId
     * @param <T>
     * @return
     */
    public <T extends View> T getView(int layoutId){
        View view=viewSparseArray.get (layoutId);
        if (view ==null){
            view=mView.findViewById (layoutId);
            viewSparseArray.put (layoutId,view);
        }
        return (T)view;
    }

    //设置文字
    public ViewHolder setText(int id,String s){
        TextView textView=getView (id);
        textView.setText (s);
        return this;
    }
    //设置图片
    public ViewHolder setImage(int id,String url){
        ImageView imageView=getView (id);
        Glide.with (context).load (url).into (imageView);
        return this;
    }
}
