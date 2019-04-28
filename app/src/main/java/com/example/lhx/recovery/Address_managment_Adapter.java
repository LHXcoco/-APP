package com.example.lhx.recovery;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class Address_managment_Adapter extends RecyclerView.Adapter<Address_managment_Adapter.LinearViewHolder> {
    @NonNull

    private Context mContext;

    public Address_managment_Adapter(Context context){
        this.mContext = context;
    }

    @Override
    public Address_managment_Adapter.LinearViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        return new LinearViewHolder(LayoutInflater.from(mContext).inflate(R.layout.address_managment_item,viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull LinearViewHolder viewHolder, int i) {
       viewHolder.textView.setText("已有地址(测试用):XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }

    @Override
    public int getItemCount() {
        return 30;
    }

    class LinearViewHolder extends RecyclerView.ViewHolder{

        private TextView textView;

        public LinearViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.address_item_tv_1);
        }
    }
}
