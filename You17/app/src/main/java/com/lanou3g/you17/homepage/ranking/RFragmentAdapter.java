package com.lanou3g.you17.homepage.ranking;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.lanou3g.you17.R;
import com.lanou3g.you17.homepage.ranking.RankingBean.DataBean.ReturnDataBean;

/**
 * Created by 高延鹏.on 16/9/2.
 */
public class RFragmentAdapter extends BaseAdapter {
    private Context mContext;
    private RankingBean.DataBean.ReturnDataBean mRankingBean;

    public RFragmentAdapter(Context context) {
        mContext = context;
    }

    public void setRankingBean(ReturnDataBean rankingBean) {
        mRankingBean = rankingBean;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return mRankingBean.getComics().size();
    }

    @Override
    public Object getItem(int position) {
        return mRankingBean.getComics().get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        rankViewHolder holder = null;
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.rank_fm_item, parent, false);
            holder = new rankViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (rankViewHolder) convertView.getTag();
            holder.name.setText(mRankingBean.getComics().get(position).getName());
            holder.author.setText(mRankingBean.getComics().get(position).getAuthor());
            holder.conTag.setText(mRankingBean.getComics().get(position).getConTag());
            holder.description.setText(mRankingBean.getComics().get(position).getDescription());
            Glide.with(mContext).load(mRankingBean.getComics().get(position).getCover())
                    .thumbnail(0.2f).into(holder.cover);

//.............pan'duan判断Tag类型
            if (mRankingBean.getComics().get(position).getTags().size() == 1) {
                holder.tagFirst.setText(mRankingBean.getComics().get(position).getTags().get(0));
                holder.tagSecond.setText("");
                holder.tagThird.setText("");
                holder.tagFourth.setText("");
            } else if (mRankingBean.getComics().get(position).getTags().size() == 2) {
                holder.tagFirst.setText(mRankingBean.getComics().get(position).getTags().get(0));
                holder.tagSecond.setText(mRankingBean.getComics().get(position).getTags().get(1));
                holder.tagThird.setText("");
                holder.tagFourth.setText("");
            } else if (mRankingBean.getComics().get(position).getTags().size() == 3) {
                holder.tagFirst.setText(mRankingBean.getComics().get(position).getTags().get(0));
                holder.tagSecond.setText(mRankingBean.getComics().get(position).getTags().get(1));
                holder.tagThird.setText(mRankingBean.getComics().get(position).getTags().get(2));
                holder.tagFourth.setText("");
            } else if (mRankingBean.getComics().get(position).getTags().size() == 4) {
                holder.tagFirst.setText(mRankingBean.getComics().get(position).getTags().get(0));
                holder.tagSecond.setText(mRankingBean.getComics().get(position).getTags().get(1));
                holder.tagThird.setText(mRankingBean.getComics().get(position).getTags().get(2));
                holder.tagFourth.setText(mRankingBean.getComics().get(position).getTags().get(3));
            }

//....................判断ListView第几行显示第几个数
            if (mRankingBean.getComics().get(position).getFlag() == 0) {
                holder.flag.setVisibility(View.GONE);
            } else {
                holder.flag.setVisibility(View.VISIBLE);
            }
            if (position == 0) {
                holder.ranking_imageview.setImageResource(R.mipmap.icon_comic_first);
                holder.rank.setVisibility(View.GONE);
                holder.number.setVisibility(View.GONE);
            } else if (position == 1) {
                holder.ranking_imageview.setImageResource(R.mipmap.icon_comic_second);
                holder.number.setVisibility(View.GONE);
                holder.rank.setVisibility(View.GONE);
            } else if (position == 2) {
                holder.ranking_imageview.setImageResource(R.mipmap.icon_comic_third);
                holder.number.setVisibility(View.GONE);
                holder.rank.setVisibility(View.GONE);

            } else {
                holder.rank.setVisibility(View.VISIBLE);
                holder.number.setVisibility(View.VISIBLE);

            }
            holder.number.setText(position + 1 + "");

        }

        return convertView;
    }

    class rankViewHolder {
        private ImageView cover, flag, ranking_imageview, rank;
        private TextView name, description, tagFirst, conTag, author, number, tagSecond, tagThird, tagFourth;

        public rankViewHolder(View view) {
            cover = (ImageView) view.findViewById(R.id.rank_cover);
            name = (TextView) view.findViewById(R.id.rank_name);
            description = (TextView) view.findViewById(R.id.rank_description);
            tagFirst = (TextView) view.findViewById(R.id.rank_tags_first);
            conTag = (TextView) view.findViewById(R.id.rank_con_tag);
            author = (TextView) view.findViewById(R.id.rank_author);
            flag = (ImageView) view.findViewById(R.id.rank_flag);
            ranking_imageview = (ImageView) view.findViewById(R.id.ranking_imageview);
            number = (TextView) view.findViewById(R.id.rank_number);
            rank = (ImageView) view.findViewById(R.id.rankin_imageview);
            tagSecond = (TextView) view.findViewById(R.id.rank_tags_second);
            tagThird = (TextView) view.findViewById(R.id.rank_tags_third);
            tagFourth = (TextView) view.findViewById(R.id.rank_tags_fourth);

        }
    }
}
