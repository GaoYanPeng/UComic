package com.lanou3g.you17.homepage;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import com.lanou3g.you17.R;
import com.lanou3g.you17.homepage.adapter.AllRecyclerAdapter;
import com.lanou3g.you17.homepage.adapter.HomeGridAdapter;
import com.lanou3g.you17.homepage.adapter.HomeGridViewAdapter;
import com.lanou3g.you17.homepage.adapter.HomeThirdAdapter;
import com.lanou3g.you17.homepage.adapter.VipRecyclerAdapter;

/**
 * Created by 高延鹏.on 16/8/30.
 */
public class HomeAdapter extends RecyclerView.Adapter<ViewHolder> {
    private Context mContext;
    private HomeBean mHomeBean;

    public HomeAdapter(Context context) {
        mContext = context;
    }

    public void setHomeBean(HomeBean homeBean) {
        mHomeBean = homeBean;
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ViewHolder holder = null;//100
        Log.d("HomeAdapter", "viewType:" + viewType);
        switch (viewType) {
            case 0:
                View allView = LayoutInflater.from(mContext).inflate
                        (R.layout.home_all_recycler, parent, false);
                holder = new AllRecyclerViewHolder(allView);
                break;
            case 1:
                View allOneView = LayoutInflater.from(mContext).inflate
                        (R.layout.home_all_recycler, parent, false);
                holder = new AllRecyclerViewHolder(allOneView);
                break;
            case 2:
                View view_two_pic = LayoutInflater.from(mContext).inflate
                        (R.layout.my_home_item_grid_view, parent, false);
                holder = new TwoPicHolder(view_two_pic);
                break;
            case 3:
                View allThreeView = LayoutInflater.from(mContext).inflate
                        (R.layout.home_all_recycler, parent, false);
                holder = new AllRecyclerViewHolder(allThreeView);
                break;
            case 4:
                View allFourView = LayoutInflater.from(mContext).inflate
                        (R.layout.home_all_recycler, parent, false);
                holder = new AllRecyclerViewHolder(allFourView);
                break;
            case 5:
                View view_three_pic = LayoutInflater.from(mContext).inflate
                        (R.layout.my_home_item_grid_view, parent, false);
                holder = new TwoPicHolder(view_three_pic);
                break;
            case 6:
                View allSixView = LayoutInflater.from(mContext).inflate
                        (R.layout.home_all_recycler, parent, false);
                holder = new AllRecyclerViewHolder(allSixView);

                break;
            case 7:
                View thirdView = LayoutInflater.from(mContext).inflate
                        (R.layout.home_third_item, parent, false);
                holder = new ThirdHolder(thirdView);
                break;
            case 8:
                View allEightView = LayoutInflater.from(mContext).inflate
                        (R.layout.home_all_recycler, parent, false);
                holder = new AllRecyclerViewHolder(allEightView);
                break;
            case 9:
                View allNineView = LayoutInflater.from(mContext).inflate
                        (R.layout.home_all_recycler, parent, false);
                holder = new AllRecyclerViewHolder(allNineView);

                break;

        }
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        int type = getItemViewType(position);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mContext, LinearLayout.HORIZONTAL, false);
        switch (type) {
            case 0:
                AllRecyclerViewHolder allRyHolder = (AllRecyclerViewHolder) holder;
                AllRecyclerAdapter allRyAdapter = new AllRecyclerAdapter(mContext, 0);
                allRyHolder.myRecyclerView.setLayoutManager(linearLayoutManager);
                allRyAdapter.setAllRyItemBean(mHomeBean.getData().getReturnData());
                allRyHolder.myRecyclerView.setAdapter(allRyAdapter);

                allRyHolder.itemTitle.setText(mHomeBean.getData().getReturnData().getComicLists().get(0).getItemTitle());
                allRyHolder.description.setText(mHomeBean.getData().getReturnData().getComicLists()
                        .get(0).getDescription());
                Glide.with(mContext).load(mHomeBean.getData().getReturnData()
                        .getComicLists().get(0).getTitleIconUrl()).into(allRyHolder.titleIconUrl);
                break;
            case 1:
                AllRecyclerViewHolder allOneRyHolder = (AllRecyclerViewHolder) holder;
                AllRecyclerAdapter allOneRyAdapter = new AllRecyclerAdapter(mContext, 1);
                allOneRyHolder.myRecyclerView.setLayoutManager(linearLayoutManager);
                allOneRyAdapter.setAllRyItemBean(mHomeBean.getData().getReturnData());
                allOneRyHolder.myRecyclerView.setAdapter(allOneRyAdapter);

                allOneRyHolder.itemTitle.setText(mHomeBean.getData().getReturnData().getComicLists().get(1).getItemTitle());
                allOneRyHolder.description.setText(mHomeBean.getData().getReturnData().getComicLists()
                        .get(1).getDescription());
                Glide.with(mContext).load(mHomeBean.getData().getReturnData()
                        .getComicLists().get(1).getTitleIconUrl()).into(allOneRyHolder.titleIconUrl);
                break;
            case 2:
                TwoPicHolder twoPicHolder = (TwoPicHolder) holder;
                HomeGridViewAdapter adapter = new HomeGridViewAdapter(mContext);
                adapter.setReturnDataBean(mHomeBean.getData().getReturnData());
                twoPicHolder.mGridView.setAdapter(adapter);

                twoPicHolder.titleItemGrid.setText(mHomeBean.getData().getReturnData().getComicLists().get(2).getItemTitle());
                twoPicHolder.descriptionGgrid.setText(mHomeBean.getData().getReturnData().getComicLists().get(2).getDescription());
                Glide.with(mContext).load(mHomeBean.getData().getReturnData().getComicLists()
                        .get(2).getTitleIconUrl()).into(twoPicHolder.titleIconUrlTow);
                break;
            case 3:
                AllRecyclerViewHolder allThreeRyHolder = (AllRecyclerViewHolder) holder;
                AllRecyclerAdapter allThreeRyAdapter = new AllRecyclerAdapter(mContext, 3);
                allThreeRyHolder.myRecyclerView.setLayoutManager(linearLayoutManager);
                allThreeRyAdapter.setAllRyItemBean(mHomeBean.getData().getReturnData());
                allThreeRyHolder.myRecyclerView.setAdapter(allThreeRyAdapter);
                allThreeRyHolder.itemTitle.setText(mHomeBean.getData().getReturnData().getComicLists().get(3).getItemTitle());
                allThreeRyHolder.description.setText(mHomeBean.getData().getReturnData().getComicLists()
                        .get(3).getDescription());
                Glide.with(mContext).load(mHomeBean.getData().getReturnData()
                        .getComicLists().get(3).getTitleIconUrl()).into(allThreeRyHolder.titleIconUrl);

                break;
            case 4:
                AllRecyclerViewHolder allFourRyHolder = (AllRecyclerViewHolder) holder;
                AllRecyclerAdapter allFourRyAdapter = new AllRecyclerAdapter(mContext, 4);
                allFourRyHolder.myRecyclerView.setLayoutManager(linearLayoutManager);
                allFourRyAdapter.setAllRyItemBean(mHomeBean.getData().getReturnData());
                allFourRyHolder.myRecyclerView.setAdapter(allFourRyAdapter);
                allFourRyHolder.itemTitle.setText(mHomeBean.getData().getReturnData().getComicLists().get(4).getItemTitle());
                allFourRyHolder.description.setText(mHomeBean.getData().getReturnData().getComicLists()
                        .get(4).getDescription());
                Glide.with(mContext).load(mHomeBean.getData().getReturnData()
                        .getComicLists().get(4).getTitleIconUrl()).into(allFourRyHolder.titleIconUrl);
                break;
            case 5:
                TwoPicHolder gridPicHolder = (TwoPicHolder) holder;
                HomeGridAdapter homeAdapter = new HomeGridAdapter(mContext);
                homeAdapter.setDataBean(mHomeBean.getData().getReturnData());
                gridPicHolder.mGridView.setAdapter(homeAdapter);
                gridPicHolder.titleItemGrid.setText(mHomeBean.getData().getReturnData().getComicLists().get(5).getItemTitle());
                gridPicHolder.descriptionGgrid.setText(mHomeBean.getData().getReturnData().getComicLists().get(5).getDescription());
                Glide.with(mContext).load(mHomeBean.getData().getReturnData().getComicLists()
                        .get(5).getTitleIconUrl()).into(gridPicHolder.titleIconUrlTow);
                break;
            case 6:
                AllRecyclerViewHolder allSixRyHolder = (AllRecyclerViewHolder) holder;
                AllRecyclerAdapter allSixRyAdapter = new AllRecyclerAdapter(mContext, 6);
                allSixRyHolder.myRecyclerView.setLayoutManager(linearLayoutManager);
                allSixRyAdapter.setAllRyItemBean(mHomeBean.getData().getReturnData());
                allSixRyHolder.myRecyclerView.setAdapter(allSixRyAdapter);
                allSixRyHolder.itemTitle.setText(mHomeBean.getData().getReturnData().getComicLists().get(6).getItemTitle());
                allSixRyHolder.description.setText(mHomeBean.getData().getReturnData().getComicLists()
                        .get(6).getDescription());
                Glide.with(mContext).load(mHomeBean.getData().getReturnData()
                        .getComicLists().get(6).getTitleIconUrl()).into(allSixRyHolder.titleIconUrl);

                break;
            case 7:
                ThirdHolder thirdPicHolder = (ThirdHolder) holder;
                HomeThirdAdapter thirdAdapter = new HomeThirdAdapter(mContext);
                thirdAdapter.setThirdBean(mHomeBean.getData().getReturnData());
                thirdPicHolder.homeThirdGrid.setAdapter(thirdAdapter);

                thirdPicHolder.thirdHomeName.setText(mHomeBean.getData().getReturnData().getComicLists().get(7).getItemTitle());
                Glide.with(mContext).load(mHomeBean.getData().getReturnData().getComicLists()
                        .get(7).getTitleIconUrl()).into(thirdPicHolder.thirdImage);

                break;
            case 8:
                AllRecyclerViewHolder allEiRyHolder = (AllRecyclerViewHolder) holder;
                VipRecyclerAdapter vipEightRyAdapter = new VipRecyclerAdapter(mContext, 8);
                allEiRyHolder.myRecyclerView.setLayoutManager(linearLayoutManager);
                vipEightRyAdapter.setVipRyItemBean(mHomeBean.getData().getReturnData());
                allEiRyHolder.myRecyclerView.setAdapter(vipEightRyAdapter);
                allEiRyHolder.itemTitle.setText(mHomeBean.getData().getReturnData().getComicLists().get(8).getItemTitle());
                allEiRyHolder.description.setText(mHomeBean.getData().getReturnData().getComicLists()
                        .get(8).getDescription());
                Glide.with(mContext).load(mHomeBean.getData().getReturnData()
                        .getComicLists().get(8).getTitleIconUrl()).into(allEiRyHolder.titleIconUrl);
                break;
            case 9:
                AllRecyclerViewHolder allNineRyHolder = (AllRecyclerViewHolder) holder;
                AllRecyclerAdapter allNineRyAdapter = new AllRecyclerAdapter(mContext, 9);
                allNineRyHolder.myRecyclerView.setLayoutManager(linearLayoutManager);
                allNineRyAdapter.setAllRyItemBean(mHomeBean.getData().getReturnData());
                allNineRyHolder.myRecyclerView.setAdapter(allNineRyAdapter);
                allNineRyHolder.itemTitle.setText(mHomeBean.getData().getReturnData().getComicLists().get(9).getItemTitle());
                allNineRyHolder.description.setText(mHomeBean.getData().getReturnData().getComicLists()
                        .get(9).getDescription());
                Glide.with(mContext).load(mHomeBean.getData().getReturnData()
                        .getComicLists().get(9).getTitleIconUrl()).into(allNineRyHolder.titleIconUrl);
                break;
        }
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return 0;
        } else if (position == 1) {
            return 1;

        } else if (position == 2) {
            return 2;

        } else if (position == 3) {
            return 3;

        } else if (position == 4) {
            return 4;
        } else if (position == 5) {
            return 5;
        } else if (position == 6) {
            return 6;
        } else if (position == 7) {
            return 7;

        } else if (position == 8) {
            return 8;
        } else if (position == 9) {
            return 9;
        } else {
            return 12;
        }

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    class AllRecyclerViewHolder extends ViewHolder {

        private RecyclerView myRecyclerView;
        private ImageView titleIconUrl;
        private TextView description, itemTitle;

        public AllRecyclerViewHolder(View itemView) {
            super(itemView);
            myRecyclerView = (RecyclerView) itemView.findViewById(R.id.home_all_recycler);
            titleIconUrl = (ImageView) itemView.findViewById(R.id.home_all_cover_image);
            itemTitle = (TextView) itemView.findViewById(R.id.home_itemTitle);
            description = (TextView) itemView.findViewById(R.id.home_title_description);
        }
    }

    class TwoPicHolder extends ViewHolder {
        private GridView mGridView;
        private ImageView titleIconUrlTow;
        private TextView titleItemGrid, descriptionGgrid;

        public TwoPicHolder(View itemView) {
            super(itemView);
            mGridView = (GridView) itemView.findViewById(R.id.item_grid_view);
            titleIconUrlTow = (ImageView) itemView.findViewById(R.id.home_grid_cover_image);
            titleItemGrid = (TextView) itemView.findViewById(R.id.home_itemTitle_grid);
            descriptionGgrid = (TextView) itemView.findViewById(R.id.home_title_description_grid);

        }
    }

    class ThirdHolder extends ViewHolder {
        private GridView homeThirdGrid;
        private ImageView thirdImage;
        private TextView thirdHomeName;

        public ThirdHolder(View itemView) {
            super(itemView);
            thirdImage = (ImageView) itemView.findViewById(R.id.home_third_image);
            homeThirdGrid = (GridView) itemView.findViewById(R.id.home_third_grid);
            thirdHomeName = (TextView) itemView.findViewById(R.id.third_home_name);
        }
    }
}
