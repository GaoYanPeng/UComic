package com.lanou3g.you17.homepage.animation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.lanou3g.you17.R;

/**
 * Created by 高延鹏.on 16/9/6.
 */
public class AnimationAdapter  {
//   private Context mContext;
//    private AnimationBean mAnimationBean;
//
//    public AnimationAdapter(Context context) {
//        mContext = context;
//    }
//
//    public void setAnimationBean(AnimationBean animationBean) {
//        mAnimationBean = animationBean;
//        notifyDataSetChanged();
//    }
//
//    @Override
//    public int getCount() {
//        return mAnimationBean.getArray().size();
//    }
//
//    @Override
//    public Object getItem(int position) {
//        return mAnimationBean.getArray().get(position);
//    }
//
//    @Override
//    public long getItemId(int position) {
//        return 0;
//    }
//
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        AnimViewHolder holder  = null;
//        if (convertView == null){
//            convertView = LayoutInflater.from(mContext).inflate(R.layout.anim_adp_item,parent,false);
//            holder = new AnimViewHolder(convertView);
//            convertView .setTag(holder);
//        }else {
//
//        holder = (AnimViewHolder) convertView.getTag();
//        }
//        Glide.with(mContext).load(mAnimationBean.getArray().get(position).getImg()).thumbnail(0.2f).into(holder.img);
//        return convertView;
//    }
//    class AnimViewHolder{
//        private ImageView img;
//        public AnimViewHolder(View view) {
//            img = (ImageView) view.findViewById(R.id.animation_imageview);
//        }
//    }
}
