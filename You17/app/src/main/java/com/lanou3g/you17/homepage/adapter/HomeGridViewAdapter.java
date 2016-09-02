package com.lanou3g.you17.homepage.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.lanou3g.you17.R;
import com.lanou3g.you17.homepage.HomeBean;
import com.lanou3g.you17.homepage.HomeBean.DataBean.ReturnDataBean;
import com.lanou3g.you17.tools.MyGridView;

/**
 * Created by 高延鹏.on 16/9/1.
 */
public class HomeGridViewAdapter extends BaseAdapter {
    private HomeBean.DataBean.ReturnDataBean mReturnDataBean;
    private Context mContext;

    public HomeGridViewAdapter(Context context) {
        mContext = context;
    }

    public void setReturnDataBean(ReturnDataBean returnDataBean) {
        mReturnDataBean = returnDataBean;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return mReturnDataBean.getComicLists().get(2).getComics().size();
    }

    @Override
    public Object getItem(int position) {
         return mReturnDataBean.getComicLists().get(2).getComics().get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null){
            convertView = LayoutInflater.from(mContext).inflate(R.layout.home_grid_item,parent,false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }
        Glide.with(mContext).load(mReturnDataBean.getComicLists()
                .get(2).getComics().get(position).getCover()).thumbnail(0.5f).into(holder.mImageView);

        return convertView;
    }
    class ViewHolder{

        private ImageView mImageView;
        public ViewHolder(View view) {
            mImageView = (ImageView) view.findViewById(R.id.home_two_image_item);
        }
    }
}
