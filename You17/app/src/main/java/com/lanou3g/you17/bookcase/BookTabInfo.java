package com.lanou3g.you17.bookcase;

import android.support.v4.app.Fragment;

import com.lanou3g.you17.bookcase.fragment.CollectionFragment;
import com.lanou3g.you17.bookcase.fragment.DownloadFragment;
import com.lanou3g.you17.bookcase.fragment.HistoryFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dllo on 16/8/26.
 */
public class BookTabInfo {
    private String title;
    private Fragment f;

    public BookTabInfo(String title, Fragment f) {
        this.title = title;
        this.f = f;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public Fragment getF() {
        return f;
    }

    public void setF(Fragment f) {
        this.f = f;
    }

    public static List<BookTabInfo> getBookTabInfo() {
        List<BookTabInfo> infos = new ArrayList<>();
        infos.add(new BookTabInfo("收藏", new CollectionFragment()));
        infos.add(new BookTabInfo("历史", new HistoryFragment()));
        infos.add(new BookTabInfo("下载", new DownloadFragment()));

        return infos;
    }
}
