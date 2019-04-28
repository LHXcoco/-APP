package com.example.lhx.recovery;

import android.content.Context;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class LJ_Adapter extends RecyclerView.Adapter<LJ_Adapter.LinearViewHolder> {
    @NonNull

    private Context mContext;

    public LJ_Adapter(Context context){
        this.mContext = context;
    }

    @Override
    public LJ_Adapter.LinearViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        return new LinearViewHolder(LayoutInflater.from(mContext).inflate(R.layout.lj_liner_item,viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull LinearViewHolder viewHolder, int i) {
        viewHolder.textView.setText("此处显示价格(测试用)");
        viewHolder.imageView.setImageResource(R.drawable.test_image);
       // viewHolder.imageView.setImageDrawable();
    }

    @Override
    public int getItemCount() {
        return 30;
    }

    class LinearViewHolder extends RecyclerView.ViewHolder{

        private TextView textView;
        private ImageView imageView;

        public LinearViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.lj_item_text_1);
            imageView = itemView.findViewById(R.id.lj_item_image_1);
        }
    }
}
