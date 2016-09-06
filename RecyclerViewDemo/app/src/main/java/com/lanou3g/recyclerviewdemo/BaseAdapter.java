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
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public abstract class BaseAdapter<T> extends RecyclerView.Adapter <ViewHolder>{

    private Context mContext;
    private List<T> data;
    private int layoutId;
    private OnMyListener mListener;


    public void setListener(OnMyListener listener){
        mListener=listener;
    }

    public BaseAdapter (Context context, List<T> data, int layoutId) {
        mContext = context;
        this.data = data;
        this.layoutId = layoutId;
    }

    @Override
    public ViewHolder onCreateViewHolder (ViewGroup parent, int viewType) {
        ViewHolder holder = ViewHolder.createViewHolder
                (mContext,parent,layoutId);
        return holder;
    }


    @Override
    public void onBindViewHolder (final ViewHolder holder, int position) {
        convert (holder,data.get(position));
        holder.itemView.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick (View view) {
                int pos=holder.getAdapterPosition ();
                mListener.onMyClick (view ,pos);
            }
        });
    }

    @Override
    public int getItemCount () {
        return data.size ();
    }

    public abstract void convert (ViewHolder holder, T t);

}
