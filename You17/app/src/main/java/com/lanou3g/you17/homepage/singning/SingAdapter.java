package com.lanou3g.you17.homepage.singning;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.lanou3g.you17.R;
import com.lanou3g.you17.homepage.singning.SingBean.DataBean.ReturnDataBean;

/**
 * Created by 高延鹏.on 16/9/3.
 */
public class SingAdapter extends BaseAdapter {
    private Context mContext;
    private SingBean.DataBean.ReturnDataBean mSingBean;

    public SingAdapter(Context context) {
        mContext = context;
    }

    public void setSingBean(ReturnDataBean singBean) {
        mSingBean = singBean;
        notifyDataSetChanged();
    }



    @Override
    public int getCount() {
        return mSingBean.getComics().size();
    }

    @Override
    public Object getItem(int position) {
        return mSingBean.getComics().get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        SingViewHolder holder = null;
        if (convertView == null){
            convertView = LayoutInflater.from(mContext).inflate(R.layout.sing_adapter_item,parent,false);
            holder = new SingViewHolder(convertView);
            convertView.setTag(holder);
        }else {
            holder = (SingViewHolder) convertView.getTag();
            holder.name.setText(mSingBean.getComics().get(position).getName());
            holder.author.setText(mSingBean.getComics().get(position).getAuthor());
            holder.description.setText(mSingBean.getComics().get(position).getDescription());
            holder.conName.setText(mSingBean.getComics().get(position).getConName());
            Glide.with(mContext).load(mSingBean.getComics().get(position).getCover()).thumbnail(0.2f).into(holder.cover);

            if (mSingBean.getComics().get(position).getTags().size() == 1){
                holder.tagFirth.setText(mSingBean.getComics().get(position).getTags().get(0));
                holder.tagSecond.setText("");
                holder.tagThird.setText("");
                holder.tagFourth.setText("");
            }else if (mSingBean.getComics().get(position).getTags().size() == 2){
                holder.tagFirth.setText(mSingBean.getComics().get(position).getTags().get(0));
                holder.tagSecond.setText(mSingBean.getComics().get(position).getTags().get(1));
                holder.tagThird .setText("");
                holder.tagFourth.setText("");
            }else if (mSingBean.getComics().get(position).getTags().size() == 3){
                holder.tagFirth.setText(mSingBean.getComics().get(position).getTags().get(0));
                holder.tagSecond.setText(mSingBean.getComics().get(position).getTags().get(1));
                holder.tagThird .setText(mSingBean.getComics().get(position).getTags().get(2));
                holder.tagFourth.setText("");
            }else if (mSingBean.getComics().get(position).getTags().size() == 4){
                holder.tagFirth.setText(mSingBean.getComics().get(position).getTags().get(0));
                holder.tagSecond.setText(mSingBean.getComics().get(position).getTags().get(1));
                holder.tagThird .setText(mSingBean.getComics().get(position).getTags().get(2));
                holder.tagFourth.setText(mSingBean.getComics().get(position).getTags().get(3));


            }
        }
        return convertView;
    }
    class SingViewHolder{
        private ImageView cover;
        private TextView name,author,description,conName,tagFirth,tagSecond,tagThird,tagFourth;
        public SingViewHolder(View view) {
            cover = (ImageView) view.findViewById(R.id.sing_cover);
            name = (TextView) view.findViewById(R.id.sing_name);
            author = (TextView) view.findViewById(R.id.sing_author);
            description = (TextView) view.findViewById(R.id.sing_description);
            conName = (TextView) view.findViewById(R.id.sing_con_name);
            tagFirth = (TextView) view.findViewById(R.id.sing_tags_first);
            tagSecond = (TextView) view.findViewById(R.id.sing_tags_second);
            tagThird = (TextView) view.findViewById(R.id.sing_tags_third);
            tagFourth = (TextView) view.findViewById(R.id.sing_tags_fourth);



        }
    }
}
