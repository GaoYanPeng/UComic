package com.lanou3g.you17.homepage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;
import com.lanou3g.you17.R;

/**
 * Created by 高延鹏.on 16/8/30.
 */
public class HomeAdapter extends RecyclerView.Adapter <HomeAdapter.HomeViewHolder>{
    private  HomeBean mHomeBean;
    private Context mContext;

    public HomeAdapter(Context context) {
       this. mContext = context;
    }

    public void setHomeBean(HomeBean homeBean) {
       this. mHomeBean = homeBean;
        notifyDataSetChanged();
    }

    @Override
    public HomeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.d("HomeAdapter", "aaaaaaaaaaaa");
        View view = LayoutInflater.from(mContext).inflate(R.layout.home_item_recommend,parent,false);
        HomeViewHolder homeViewHolder = new HomeViewHolder(view);
        return homeViewHolder;
    }

    @Override
    public void onBindViewHolder(HomeViewHolder holder, int position) {
        holder.name.setText(mHomeBean.getData().getReturnData().getComicLists().get(position).getComics().get(0).getName());
        Glide.with(mContext).load(mHomeBean.getData().getReturnData().getComicLists().get(position).getComics().get(0).getCover()).into(holder.cover);
    }

    @Override
    public int getItemCount() {
        return mHomeBean.getData().getReturnData().getComicLists().size();
    }

    class HomeViewHolder extends ViewHolder{
        public ImageView cover;
        public TextView name;

    public HomeViewHolder(View itemView) {
        super(itemView);
        cover = (ImageView) itemView.findViewById(R.id.home_item_image);
        name = (TextView) itemView.findViewById(R.id.home_item_text);
    }

    }
}
