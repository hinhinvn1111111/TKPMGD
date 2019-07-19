package com.ute.dn.speaknow;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.ute.dn.speaknow.adapters.ItemDemo;
import com.ute.dn.speaknow.adapters.ListVideo;

import java.util.ArrayList;

public class Demo extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.t1);
         initview();
    }
    public void initview(){
        RecyclerView  recyclerView = findViewById(R.id.rcv);
        ImageView imv = findViewById(R.id.img1);
        imv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager  =  new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        ArrayList<ItemDemo> arrItem = new ArrayList<>();
//        arrItem.add(new ItemDemo(R.drawable.ut,"Make or Do?","xianU0IrxEk"));
        arrItem.add(new ItemDemo(R.drawable.ut," Learn English for FREE with Lucy!","JTHSFxja2zY"));
        arrItem.add(new ItemDemo(R.drawable.ut,"LEARN ENGLISH | MARK ZUCKG","ksZpu1s1LV0"));

        ListVideo listVideo = new ListVideo(arrItem,this.getApplicationContext());
        recyclerView.setAdapter(listVideo);
    }
}
