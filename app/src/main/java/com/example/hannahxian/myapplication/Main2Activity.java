package com.example.hannahxian.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    Button mButton1,mButton2,mButton3,mButton4,mButton5
            ,mButton6,mButton7,mButton8,mButton9,mButton11
            ,mButton12,mButton13,mButton14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mButton1 = (Button) findViewById(R.id.myBorrow);
        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Main2Activity.this,MyBorrowActivity.class));
            }
        });

        mButton2 = (Button) findViewById(R.id.remit);
        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Main2Activity.this,RemitResultActivity.class));
            }
        });

        mButton3 = (Button) findViewById(R.id.remit2);
        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Main2Activity.this,RemitResultActivity2.class));
            }
        });

        mButton4 = (Button)findViewById(R.id.repay);
        mButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main2Activity.this,RepayPlanActivity.class));
            }
        });
        mButton5 = (Button)findViewById(R.id.repay2);
        mButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main2Activity.this,RepayPlan2Activity.class));
            }
        });

        mButton6 = (Button)findViewById(R.id.recevie);
        mButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main2Activity.this,ReceiveActivity.class));
            }
        });

        mButton7 = (Button)findViewById(R.id.inaudit);
        mButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main2Activity.this,InAuditActivity.class));
            }
        });

        mButton8 = (Button) findViewById(R.id.auditing);
        mButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main2Activity.this,AuditingActivity.class));
            }
        });

        mButton9 = (Button) findViewById(R.id.passed);
        mButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main2Activity.this,PassedActivity.class));
            }
        });

        mButton11 = (Button)findViewById(R.id.lease_info_btn);
        mButton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main2Activity.this,LeaseInfoActivity.class));
            }
        });

        mButton12 = (Button)findViewById(R.id.huank);
        mButton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main2Activity.this,HuankuanActivity.class));
            }
        });

        mButton13 = (Button) findViewById(R.id.pipeishenqing);
        mButton13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main2Activity.this,PiPeiShenqingActivity.class));
            }
        });

        mButton14 = (Button) findViewById(R.id.zhaiquan);
        mButton14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main2Activity.this,MyZhaiquanActivity.class));
            }
        });


    }
}
