package com.example.lhx.recovery;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class main_interface extends AppCompatActivity {

    private Button t_btn;
    private Button ddan_btn;
    private Button txan_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_interface);

        //测试按钮点击事件
        t_btn = (Button)findViewById(R.id.testbtn);
        t_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(main_interface.this,LJ_Activity.class);
                startActivity(intent);
            }
        });

        ddan_btn = findViewById(R.id.ddan);
        ddan_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //转到订单界面
                Intent intent = new Intent(main_interface.this,DD_Activity.class);
                startActivity(intent);
            }
        });

        txan_btn = findViewById(R.id.txan);
        txan_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //暂时把提现按钮跳转到个人界面
                Intent intent = new Intent(main_interface.this,Address_managment_Activity.class);
                startActivity(intent);
            }
        });
    }
}
