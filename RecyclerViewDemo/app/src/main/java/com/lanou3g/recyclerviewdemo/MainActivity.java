package com.lanou3g.recyclerviewdemo;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerView;
    private List<String> data;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        recyclerView= (RecyclerView) findViewById (R.id.recyclerView);
        LinearLayoutManager manager=new LinearLayoutManager (this);
        recyclerView.setLayoutManager (manager);
        data=new ArrayList<> ();
        for (int i = 0; i < 200; i++) {
            data.add ("132");
        }

        BaseAdapter<String> adapter=new BaseAdapter<String> (this, data,R.layout.item){

            @Override
            public void convert (ViewHolder holder, String s) {
                holder.setText (R.id.item_tv,s);
            }
        };


        adapter.setListener (new OnMyListener () {
            @Override
            public void onMyClick (View view, int pos) {
                Toast.makeText (MainActivity.this, ""+pos, Toast.LENGTH_SHORT).show ();
            }
        });
        recyclerView.setAdapter (adapter);
    }
}
