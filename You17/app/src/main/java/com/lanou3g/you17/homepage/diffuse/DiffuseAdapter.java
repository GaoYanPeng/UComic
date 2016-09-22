package com.lanou3g.you17.homepage.diffuse;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.lanou3g.you17.R;
import com.lanou3g.you17.homepage.diffuse.DiffuseBean.DataBean.ReturnDataBean;

/**
 * Created by 高延鹏.on 16/9/21.
 */
public class DiffuseAdapter extends BaseAdapter {
    private Context mContext;
    private DiffuseBean.DataBean.ReturnDataBean difBean;

    public DiffuseAdapter(Context context) {
        mContext = context;
    }

    public void setDifBean(ReturnDataBean difBean) {
        this.difBean = difBean;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return difBean.getComics().size();
    }

    @Override
    public Object getItem(int position) {
        return difBean.getComics().get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        DiffuseViewHolder holder = null;
        if (convertView == null){
            convertView = LayoutInflater.from(mContext).inflate(R.layout.dif_adapter_item,parent,false);
            holder = new DiffuseViewHolder(convertView);
            convertView.setTag(holder);
        }else {
            holder = (DiffuseViewHolder) convertView.getTag();
        }
        holder.grade.setText(difBean.getComics().get(position).getGrade());
        holder.description.setText(difBean.getComics().get(position).getDescription());
        Glide.with(mContext).load(difBean.getComics().get(position).getCover()).thumbnail(0.2f).into(holder.cover);
        return convertView;
    }
    class DiffuseViewHolder{
        private ImageView cover;
        private TextView grade,description;
        public DiffuseViewHolder(View view) {
            cover = (ImageView) view.findViewById(R.id.dif_item_cover);
            grade = (TextView) view.findViewById(R.id.dif_item_grade);
            description = (TextView) view.findViewById(R.id.dif_item_description);

        }
    }
}
