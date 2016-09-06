package com.lanou3g.you17.homepage.topic;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.lanou3g.you17.R;
import com.lanou3g.you17.homepage.topic.TopicBean.DataBean.ReturnDataBean;

/**
 * Created by 高延鹏.on 16/9/5.
 */
public class TopicAdapter extends BaseAdapter {
    private Context mContext;
    private TopicBean.DataBean.ReturnDataBean mTopicBean;

    public TopicAdapter(Context context) {
        mContext = context;
    }

    public void setTopicBean(ReturnDataBean topicBean) {
        mTopicBean = topicBean;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return mTopicBean.getComics().size();
    }

    @Override
    public Object getItem(int position) {
        return mTopicBean.getComics().get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TopViewHolder holder = null;
        if (convertView == null){
            convertView = LayoutInflater.from(mContext).inflate(R.layout.topic_ad_item,parent,false);
            holder = new TopViewHolder(convertView);
            convertView.setTag(holder);
        }else {
           holder = (TopViewHolder) convertView.getTag();
        }
        holder.topTitle.setText(mTopicBean.getComics().get(position).getTitle());
        holder.topSubTitle.setText(mTopicBean.getComics().get(position).getSubTitle());
        Glide.with(mContext).load(mTopicBean.getComics().get(position).getCover()).thumbnail(0.2f).into(holder.topCover);
        if (mTopicBean.getComics().get(position).getSpecialType() ==2){
            holder.topType.setImageResource(R.mipmap.boutique_special_tag_space);
        }else if (mTopicBean.getComics().get(position).getSpecialType()==1){
            holder.topType.setImageResource(R.mipmap.boutique_special_tag_comic);
        }
        return convertView;
    }
    class TopViewHolder{
        private ImageView topCover,topType;
        private TextView topTitle,topSubTitle;
        public TopViewHolder(View view) {
            topCover = (ImageView) view.findViewById(R.id.top_cover);
            topType = (ImageView) view.findViewById(R.id.top_type);
            topSubTitle = (TextView) view.findViewById(R.id.top_sub_title);
            topTitle = (TextView) view.findViewById(R.id.top_title);

        }
    }
}
