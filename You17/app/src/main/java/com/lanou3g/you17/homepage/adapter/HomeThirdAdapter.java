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
public class HomeThirdAdapter extends BaseAdapter {
    private Context mContext;
    private HomeBean.DataBean.ReturnDataBean thirdBean;

    public HomeThirdAdapter(Context context) {
        mContext = context;
    }

    public void setThirdBean(ReturnDataBean thirdBean) {
        this.thirdBean = thirdBean;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return thirdBean.getComicLists().get(7).getComics().size();
    }

    @Override
    public Object getItem(int position) {
        return thirdBean.getComicLists().get(7).getComics().get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ThirdViewHolder holder = null;
        if (convertView == null){
            convertView = LayoutInflater.from(mContext).inflate(R.layout.home_third_item_small,parent,false);
            holder = new ThirdViewHolder(convertView);
            convertView.setTag(holder);
        }else {
            holder = (ThirdViewHolder) convertView.getTag();
        }

        holder.thirdName.setText(thirdBean.getComicLists().get(7).getComics().get(position).getName());
        holder.thirdDescription.setText(thirdBean.getComicLists().get(7).getComics().get(position).getDescription());
        holder.author_name.setText(thirdBean.getComicLists().get(7).getComics().get(position).getAuthor_name());
        Glide.with(mContext).load(thirdBean.getComicLists().get(7).getComics().get(position).getCover()).thumbnail(0.5f).into(holder.coverImage);
        return convertView;
    }
    class ThirdViewHolder {
        private ImageView coverImage;
        private TextView thirdName,thirdDescription,author_name;
        public ThirdViewHolder(View view) {
            thirdName = (TextView) view.findViewById(R.id.home_third_name);
            thirdDescription  = (TextView) view.findViewById(R.id.home_third_description);
            author_name = (TextView) view.findViewById(R.id.home_third_author_name);
            coverImage = (ImageView) view.findViewById(R.id.home_image_carce);
        }
    }
}
