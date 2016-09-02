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
import com.lanou3g.you17.homepage.adapter.AllRecyclerAdapter.AllRyItemHolderView;


/**
 * Created by 高延鹏.on 16/9/1.
 */
public class AllRecyclerAdapter extends RecyclerView.Adapter<AllRyItemHolderView> {
    private Context mContext;
    private HomeBean.DataBean.ReturnDataBean allRyItemBean;
    int pos;

    public AllRecyclerAdapter(Context context, int pos) {
        mContext = context;
        this.pos = pos;
    }

    public void setAllRyItemBean(ReturnDataBean allRyItemBean) {
        this.allRyItemBean = allRyItemBean;
        notifyDataSetChanged();
    }

    @Override
    public AllRyItemHolderView onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(mContext).inflate(R.layout.home_item_recommend, parent, false);
        AllRyItemHolderView holderVeiw = new AllRyItemHolderView(view);

        return holderVeiw;
    }

    @Override
    public void onBindViewHolder(AllRyItemHolderView holder, int position) {
        holder.nameTextView.setText(allRyItemBean.getComicLists().get(pos)
                .getComics().get(position).getName());
        Glide.with(mContext).load(allRyItemBean.getComicLists().get(pos)
                .getComics().get(position).getCover()).thumbnail(0.5f).into(holder.coverImageView);

    }

    @Override
    public int getItemCount() {
        return 10;
    }


    class AllRyItemHolderView extends ViewHolder {
        private ImageView   coverImageView;
        private TextView nameTextView;
        public AllRyItemHolderView(View itemView) {
            super(itemView);
            coverImageView = (ImageView) itemView.findViewById(R.id.home_item_image);
            nameTextView = (TextView) itemView.findViewById(R.id.home_item_text);
        }
    }
}
