package com.example.lhx.recovery;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class person_Activity extends AppCompatActivity {

    private Button maddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person_);
        maddress  = findViewById(R.id.ddgl);
        maddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //转到地址管理页面
                Intent intent = new Intent(person_Activity.this,Address_managment_Activity.class);
                startActivity(intent);
            }
        });
    }
}
