package com.example.admin.cafe20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Confirm extends AppCompatActivity {
    TextView select,rate;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);
        select = findViewById(R.id.selections);
        select.setText("");
        rate = findViewById(R.id.ratecard);
        rate.setText("");
        b = findViewById(R.id.confirmorder);
        String final_selection = "";
        String payment = "";
        for (String sel : Menu.selection) {
            Integer i = 1;
            String pa = Menu.pay.get(i).toString();
            final_selection = final_selection + sel + "\n";
        }
        select.setText(final_selection);
        for (String pa : Menu.pay) {
            payment = payment + pa + "\n";
        }
        rate.setText(payment);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Order placed successfully",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Confirm.this, Bill.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(),"Here's your bill",Toast.LENGTH_LONG).show();
            }
        });
    }
}