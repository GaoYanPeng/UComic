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
 * Created by 高延鹏.on 16/9/1.
 */
public class HomeGridAdapter extends BaseAdapter {
    private HomeBean.DataBean.ReturnDataBean mDataBean;
    private Context mContext;

    public HomeGridAdapter(Context context) {
        mContext = context;
    }

    public void setDataBean(ReturnDataBean dataBean) {
        mDataBean = dataBean;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return mDataBean.getComicLists().get(5).getComics().size();
    }

    @Override
    public Object getItem(int position) {
        return mDataBean.getComicLists().get(5).getComics().get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.home_grid_adapter_item, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.name.setText(mDataBean.getComicLists().get(5).getComics().get(position).getName());
        holder.number.setText(mDataBean.getComicLists().get(5).getComics().get(position).getChapterNew());
        Glide.with(mContext).load(mDataBean.getComicLists().get(5).getComics()
                .get(position).getCover()).thumbnail(0.5f).into(holder.mImageView);
        return convertView;
    }

    class ViewHolder {
        private ImageView mImageView;
        private TextView name,number;
        public ViewHolder(View view) {

            name = (TextView) view.findViewById(R.id.home_grid_adapter_name);
            mImageView = (ImageView) view.findViewById(R.id.home_grid_adapter_item);
            number = (TextView) view.findViewById(R.id.number);
        }
    }
}
