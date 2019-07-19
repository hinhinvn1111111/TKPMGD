package com.ute.dn.speaknow.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.ute.dn.speaknow.MainActivity;
import com.ute.dn.speaknow.R;
import com.ute.dn.speaknow.ViewVideoOnlineActivity;
import com.ute.dn.speaknow.WelcomeActivity;
import com.ute.dn.speaknow.common.YouTubeHelper;

import java.util.ArrayList;

public class ListVideo extends RecyclerView.Adapter<ListVideo.Viewhodel> {
    ArrayList<ItemDemo> arrItem;
    Context context;
    private static String VideoId = "";
    Intent intent;
//    String id = "xianU0IrxEk";

    String id = "";

    public ListVideo(ArrayList<ItemDemo> arrItem, Context applicationContext) {
        this.arrItem=arrItem;
        this.context=applicationContext;
    }

    public ArrayList<ItemDemo> getArrItem() {
        return arrItem;
    }

    public void setArrItem(ArrayList<ItemDemo> arrItem) {
        this.arrItem = arrItem;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    @Override
    public Viewhodel onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemview = layoutInflater.inflate(R.layout.t2,parent,false);
        return new Viewhodel(itemview);
    }

    @Override
    public void onBindViewHolder(Viewhodel holder, int position) {
        holder.tv.setText(arrItem.get(position).getmName());
        holder.img.setImageResource(arrItem.get(position).getmImage());
        id = arrItem.get(position).getmID();
    }

    @Override
    public int getItemCount() {
        return arrItem.size();
    }


    public class Viewhodel extends RecyclerView.ViewHolder{
        TextView tv;
        ImageView img;

        public Viewhodel(final View itemView) {
            super(itemView);
//            Toast.makeText(getContext(), itemView.getId()+"", Toast.LENGTH_SHORT).show();
            tv = itemView.findViewById(R.id.tv);
            img = itemView.findViewById(R.id.img);
            itemView.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View v) {
                        int t = getLayoutPosition();
//                    Toast.makeText(getContext(), t+"", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, ViewVideoOnlineActivity.class);
                    intent.putExtra("VideoId", arrItem.get(t).getmID());
                    intent.putExtra("TranscriptPath", "");
                    context.startActivity(intent);
                }
            });


        }
    }
}
