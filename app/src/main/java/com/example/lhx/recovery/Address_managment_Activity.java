package com.example.lhx.recovery;

import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class Address_managment_Activity extends AppCompatActivity {

    private RecyclerView mAddress_managment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address_managment_);
        mAddress_managment = findViewById(R.id.address_rv_1);
        mAddress_managment.setLayoutManager(new LinearLayoutManager(Address_managment_Activity.this));
        mAddress_managment.addItemDecoration(new MyDecoration());
        mAddress_managment.setAdapter(new Address_managment_Adapter(Address_managment_Activity.this));
    }
    // 实现分割线
    class  MyDecoration extends  RecyclerView.ItemDecoration{
        public void getItemOffsets(Rect outRect, View view , RecyclerView parent, RecyclerView.State state){
            super.getItemOffsets(outRect,view,parent,state);
            outRect.set(getResources().getDimensionPixelOffset(R.dimen.dividerHeight),getResources().getDimensionPixelOffset(R.dimen.dividerHeight),
                    getResources().getDimensionPixelOffset(R.dimen.dividerHeight),getResources().getDimensionPixelOffset(R.dimen.dividerHeight));
        }
    }
}
