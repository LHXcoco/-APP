package com.example.lhx.recovery;

import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class LJ_Activity extends AppCompatActivity {

    private RecyclerView mLjRv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lj_);
        mLjRv = findViewById(R.id.lj_rv_1);
        mLjRv.setLayoutManager(new GridLayoutManager(LJ_Activity.this,2));
        mLjRv.addItemDecoration(new MyDecoration());
        mLjRv.setAdapter(new LJ_Adapter(LJ_Activity.this));
    }
    // 实现分割线
    class  MyDecoration extends  RecyclerView.ItemDecoration{
        public void getItemOffsets(Rect outRect, View view , RecyclerView parent, RecyclerView.State state){
            super.getItemOffsets(outRect,view,parent,state);
            outRect.set(0,0,getResources().getDimensionPixelOffset(R.dimen.dividerHeight),getResources().getDimensionPixelOffset(R.dimen.dividerHeight));
        }
    }
}
