package com.example.hannahxian.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class HuankuanActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huankuan);

        LinearLayout layout = (LinearLayout)findViewById(R.id.change_card);
        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HuankuanActivity.this, "xxx", Toast.LENGTH_SHORT).show();
            }
        });

//        findViewById(R.id.crg)
    }
}
