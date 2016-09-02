package com.lanou3g.you17.homepage.adapter;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.lanou3g.you17.R;
import com.lanou3g.you17.homepage.HomeBean;
import com.lanou3g.you17.homepage.HomeBean.DataBean.ReturnDataBean;
import com.lanou3g.you17.homepage.adapter.VipRecyclerAdapter.VipViewHolder;


/**
 * Created by 高延鹏.on 16/9/2.
 */
public class VipRecyclerAdapter extends RecyclerView.Adapter<VipViewHolder> {
    private Context mContext;
    int pos;
    private HomeBean.DataBean.ReturnDataBean vipRyItemBean;

    public VipRecyclerAdapter(Context context,int pos) {
        mContext = context;
        this.pos = pos;
    }

    public void setVipRyItemBean(ReturnDataBean vipRyItemBean) {
        this.vipRyItemBean = vipRyItemBean;
        notifyDataSetChanged();
    }

    @Override
    public VipViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.home_vip_recommend, parent, false);
        VipViewHolder holderVipVeiw = new VipViewHolder(view);
        return holderVipVeiw;
    }

    @Override
    public void onBindViewHolder(VipViewHolder holder, int position) {
        holder.nameTextVipView.setText(vipRyItemBean.getComicLists().get(pos)
                .getComics().get(position).getName());
        Glide.with(mContext).load(vipRyItemBean.getComicLists().get(pos)
                .getComics().get(position).getCover()).thumbnail(0.5f).into(holder.coverVipImageView);

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    class VipViewHolder extends ViewHolder{
        private ImageView coverVipImageView;
        private TextView nameTextVipView;
        public VipViewHolder(View itemView) {
            super(itemView);
            coverVipImageView = (ImageView) itemView.findViewById(R.id.home_vip_image);
            nameTextVipView = (TextView) itemView.findViewById(R.id.home_vip_text);
        }
    }

}
