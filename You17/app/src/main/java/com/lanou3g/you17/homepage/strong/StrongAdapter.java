package com.lanou3g.you17.homepage.strong;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.lanou3g.you17.R;
import com.lanou3g.you17.homepage.strong.StrongBean.DataBean.ReturnDataBean;

/**
 * Created by 高延鹏.on 16/9/6.
 */
public class StrongAdapter extends BaseAdapter{

    private Context mContext;
    private StrongBean.DataBean.ReturnDataBean strongBean;

    public StrongAdapter(Context context) {
        mContext = context;
    }

    public void setStrongBean(ReturnDataBean strongBean) {
        this.strongBean = strongBean;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return strongBean.getComics().size();
    }

    @Override
    public Object getItem(int position) {
        return strongBean.getComics().get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        StrongViewHolder holder = null;
        if (convertView  == null){
            convertView = LayoutInflater.from(mContext).inflate(R.layout.sing_adapter_item,parent,false);
            holder = new StrongViewHolder(convertView);
            convertView.setTag(holder);
        }else {
            holder = (StrongViewHolder) convertView.getTag();
        }
        holder.name.setText(strongBean.getComics().get(position).getName());
        holder.author.setText(strongBean.getComics().get(position).getAuthor());
        holder.description.setText(strongBean.getComics().get(position).getDescription());
        Glide.with(mContext).load(strongBean.getComics().get(position).getCover()).thumbnail(0.2f).into(holder.cover);

        if (strongBean.getComics().get(position).getTags().size() == 1){
            holder.tagFirth.setText(strongBean.getComics().get(position).getTags().get(0));
            holder.tagSecond.setText("");
            holder.tagThird.setText("");
            holder.tagFourth.setText("");
        }else if (strongBean.getComics().get(position).getTags().size() == 2){
            holder.tagFirth.setText(strongBean.getComics().get(position).getTags().get(0));
            holder.tagSecond.setText(strongBean.getComics().get(position).getTags().get(1));
            holder.tagThird .setText("");
            holder.tagFourth.setText("");
        }else if (strongBean.getComics().get(position).getTags().size() == 3){
            holder.tagFirth.setText(strongBean.getComics().get(position).getTags().get(0));
            holder.tagSecond.setText(strongBean.getComics().get(position).getTags().get(1));
            holder.tagThird .setText(strongBean.getComics().get(position).getTags().get(2));
            holder.tagFourth.setText("");
        }else if (strongBean.getComics().get(position).getTags().size() == 4){
            holder.tagFirth.setText(strongBean.getComics().get(position).getTags().get(0));
            holder.tagSecond.setText(strongBean.getComics().get(position).getTags().get(1));
            holder.tagThird .setText(strongBean.getComics().get(position).getTags().get(2));
            holder.tagFourth.setText(strongBean.getComics().get(position).getTags().get(3));


        }
        return convertView;
    }
    class StrongViewHolder{

        public TextView name, author,description,tagFirth,tagSecond,tagThird,tagFourth;
        public ImageView cover;
        public StrongViewHolder(View view) {
            name = (TextView) view.findViewById(R.id.sing_name);
            cover = (ImageView) view.findViewById(R.id.sing_cover);
            author = (TextView) view.findViewById(R.id.sing_author);
            description = (TextView) view.findViewById(R.id.sing_description);
            tagFirth = (TextView) view.findViewById(R.id.sing_tags_first);
            tagSecond = (TextView) view.findViewById(R.id.sing_tags_second);
            tagThird = (TextView) view.findViewById(R.id.sing_tags_third);
            tagFourth = (TextView) view.findViewById(R.id.sing_tags_fourth);
        }
    }
}
