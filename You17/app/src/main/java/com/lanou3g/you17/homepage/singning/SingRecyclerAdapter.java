package com.lanou3g.you17.homepage.singning;

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
import com.lanou3g.you17.homepage.singning.SingBean.DataBean.ReturnDataBean;

/**
 * Created by 高延鹏.on 16/9/3.
 */
public class SingRecyclerAdapter extends RecyclerView.Adapter<SingRecyclerAdapter.SingRyViewHolder> {
    private Context mContext;
    private SingBean.DataBean.ReturnDataBean mSingRyBean;

    public SingRecyclerAdapter(Context context) {
        mContext = context;
    }

    public void setSingRyBean(ReturnDataBean singRyBean) {
        mSingRyBean = singRyBean;
        notifyDataSetChanged();
    }

    @Override
    public SingRyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.sing_recycler_item,parent,false);
        SingRyViewHolder  holder = new SingRyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(SingRyViewHolder holder, int position) {

        holder.name.setText(mSingRyBean.getHeaders().get(position).getName());
        Glide.with(mContext).load(mSingRyBean.getHeaders().get(position).getCover())
                .thumbnail(0.2f).into(holder.cover);

    }

    @Override
    public int getItemCount() {
        return mSingRyBean.getHeaders().size();
    }

    class SingRyViewHolder extends ViewHolder{
        private ImageView cover;
        private  TextView name;
        public SingRyViewHolder(View itemView) {
            super(itemView);
            cover = (ImageView) itemView.findViewById(R.id.sing_item_image);
            name = (TextView) itemView.findViewById(R.id.sing_item_text);
        }
    }
}
