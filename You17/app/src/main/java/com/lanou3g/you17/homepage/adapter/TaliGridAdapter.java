package com.lanou3g.you17.homepage.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.lanou3g.you17.R;
import com.lanou3g.you17.homepage.HomeBean;
import com.lanou3g.you17.homepage.HomeBean.DataBean.ReturnDataBean;

/**
 * Created by 高延鹏.on 16/9/2.
 */
public class TaliGridAdapter extends BaseAdapter {
    private Context mContext;
    private HomeBean.DataBean.ReturnDataBean tailBean;


    public TaliGridAdapter(Context context) {
        mContext = context;

    }

    public void setTailBean(ReturnDataBean tailBean) {
        this.tailBean = tailBean;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return tailBean.getComicLists().get(10).getComics().size();
    }

    @Override
    public Object getItem(int position) {
        return tailBean.getComicLists().get(10).getComics().get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TailViewHolder holder = null;
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate
                    (R.layout.home_tail_item_laout, parent, false);
            holder = new TailViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (TailViewHolder) convertView.getTag();
        }

        holder.tailName.setText(tailBean.getComicLists().get(10).getComics().get(position).getName());
        holder.thirdAuthor.setText(tailBean.getComicLists().get(10).getComics().get(position).getAuthor_name());
        if (tailBean.getComicLists().get(10).getComics().get(position).getTags().size() == 1){
            holder.thirdDescription.setText(tailBean.getComicLists().get(10).getComics().get(position).getTags().get(0));
            holder.towDescription.setText("");
            holder.threeDescription.setText("");
        }else if (tailBean.getComicLists().get(10).getComics().get(position).getTags().size() == 2){
            holder.thirdDescription.setText(tailBean.getComicLists().get(10).getComics().get(position).getTags().get(0));
            holder.towDescription.setText(tailBean.getComicLists().get(10).getComics().get(position).getTags().get(1));
            holder.threeDescription.setText("");
        }else  if(tailBean.getComicLists().get(10).getComics().get(position).getTags().size() == 3){
            holder.thirdDescription.setText(tailBean.getComicLists().get(10).getComics().get(position).getTags().get(0));
            holder.towDescription.setText(tailBean.getComicLists().get(10).getComics().get(position).getTags().get(1));
            holder.threeDescription.setText(tailBean.getComicLists().get(10).getComics().get(position).getTags().get(2));
        }

        if (position == 0){
            holder.number.setImageResource(R.mipmap.icon_rank_first);
            holder.man.setImageResource(R.mipmap.icon_yaoqiniang_first);
        }else if (position ==1){
            holder.number.setImageResource(R.mipmap.icon_rank_second);
            holder.man.setImageResource(R.mipmap.icon_yaoqiniang_second);
        }else if (position ==2){
            holder.number.setImageResource(R.mipmap.icon_rank_third);
            holder.man.setImageResource(R.mipmap.icon_yaoqiniang_third);
        }else if (position ==3){
            holder.number.setImageResource(R.mipmap.icon_rank_fourth);
            holder.man.setVisibility(View.GONE);
        }else if (position ==4){
            holder.number.setImageResource(R.mipmap.icon_rank_fifth);
            holder.man.setVisibility(View.GONE);
        }



        Glide.with(mContext).load(tailBean.getComicLists().get(10)
                .getComics().get(position).getCover()).thumbnail(0.5f).into(holder.homeTailCarce);
        return convertView;
    }

    class TailViewHolder {
        private ImageView homeTailCarce,number,man;
        private TextView tailName, thirdAuthor, thirdDescription, towDescription, threeDescription;

        public TailViewHolder(View view) {
            homeTailCarce = (ImageView) view.findViewById(R.id.home_tail_carce);
            tailName = (TextView) view.findViewById(R.id.home_third_name);
            thirdAuthor = (TextView) view.findViewById(R.id.home_third_author_name);
            thirdDescription = (TextView) view.findViewById(R.id.home_third_description);
            towDescription = (TextView) view.findViewById(R.id.home_third_tow_description);
            threeDescription = (TextView) view.findViewById(R.id.home_third_three_description);
            number  = (ImageView) view.findViewById(R.id.home_tail_number);
            man = (ImageView) view.findViewById(R.id.home_tail_man);

        }
    }
}
