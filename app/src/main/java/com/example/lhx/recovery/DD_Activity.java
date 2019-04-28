package com.example.lhx.recovery;

import android.graphics.Rect;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class DD_Activity extends AppCompatActivity {

    private RecyclerView mDDRv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dd_);
        mDDRv = findViewById(R.id.dd_rv_1);
        mDDRv.setLayoutManager(new LinearLayoutManager(DD_Activity.this));
        mDDRv.addItemDecoration(new MyDecoration());
        mDDRv.setAdapter(new DD_Adapter(DD_Activity.this));
    }
    // 实现分割线
    class  MyDecoration extends  RecyclerView.ItemDecoration{
        public void getItemOffsets(Rect outRect, View view , RecyclerView parent, RecyclerView.State state){
            super.getItemOffsets(outRect,view,parent,state);
            outRect.set(0,0,0,getResources().getDimensionPixelOffset(R.dimen.dividerHeight));
        }
    }
}
