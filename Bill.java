package com.example.admin.cafe20;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class Bill extends AppCompatActivity {
    TextView t1, t2, t3, t4, t5, t6, t7, t8, t9, t10;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill);
        t1 = findViewById(R.id.billname);
        t2 = findViewById(R.id.bill_name);
        t3 = findViewById(R.id.billemail);
        t4 = findViewById(R.id.bill_email);
        t5 = findViewById(R.id.billphone);
        t6 = findViewById(R.id.bill_phone);
        t7 = findViewById(R.id.billorder);
        t8 = findViewById(R.id.bill_order);
        t9 = findViewById(R.id.ratecard);
        t10 = findViewById(R.id.total_bill);
        b = findViewById(R.id.finish);
        t2.setText(MainActivity.s1);
        t4.setText(MainActivity.s2);
        t6.setText(MainActivity.s3);
        String final_selection = "";
        for (String sel : Menu.selection) {
            final_selection = final_selection + sel + "\n";
        }
        t8.setText(final_selection);
        String payment = "";
        for (String pa : Menu.pay) {
            payment = payment + pa + "\n";
        }
        t9.setText(payment);
        Integer final_amount = 0;
        for (Integer amt : Menu.rate) {
            final_amount = final_amount + amt;
        }
        t10.setText("Total Payable :  ₹ " + final_amount);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Pleasure to serve you \nHope to see you soon",Toast.LENGTH_SHORT).show();
                new android.os.Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(Bill.this, MainActivity.class);
                        startActivity(intent);
                    }
                },5000);
            }
        });
    }
}