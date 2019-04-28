package com.example.lhx.recovery;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class DD_Adapter extends RecyclerView.Adapter<DD_Adapter.LinearViewHolder> {
    @NonNull

    private Context mContext;

    public DD_Adapter(Context context){
        this.mContext = context;
    }

    @Override
    public DD_Adapter.LinearViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        return new LinearViewHolder(LayoutInflater.from(mContext).inflate(R.layout.dd_liner_item,viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull LinearViewHolder viewHolder, int i) {
        viewHolder.status.setText("状态"+"XXXXX");
        viewHolder.bh.setText("编号"+"XXXXX");
        viewHolder.time.setText("创建时间"+"XXXXX");
        viewHolder.money.setText("金额"+"XXXXX");
        viewHolder.outpreson.setText("卖家"+"XXXXX");
        viewHolder.inpreson.setText("买家"+"XXXXX");
    }

    @Override
    public int getItemCount() {
        return 30;
    }

    class LinearViewHolder extends RecyclerView.ViewHolder{

        private TextView bh;
        private TextView time;
        private TextView outpreson;
        private TextView inpreson;
        private TextView money;
        private TextView status;


        public LinearViewHolder(@NonNull View itemView) {
            super(itemView);
            bh = itemView.findViewById(R.id.dd_item_text_bh);
            time = itemView.findViewById(R.id.dd_item_text_time);
            outpreson = itemView.findViewById(R.id.dd_item_text_outpreson);
            inpreson = itemView.findViewById(R.id.dd_item_text_inperson);
            money = itemView.findViewById(R.id.dd_item_text_money);
            status = itemView.findViewById(R.id.dd_item_text_status);
        }
    }
}
