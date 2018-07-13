package com.example.admin.cafe20;

import android.app.Dialog;
import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public static String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16,s17,s18,s19,s20,s21;
    public static String p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15,p16,p17;
    public static Integer r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11,r12,r13,r14,r15,r16,r17;
    TextView t1,t2;
    EditText e1,e2;
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = findViewById(R.id.username);
        t2 = findViewById(R.id.password);
        e1 = findViewById(R.id.editUsername);
        e2 = findViewById(R.id.editPassword);
        b1 = findViewById(R.id.signin);
        b2 = findViewById(R.id.signup);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (e1.getText().toString().equals(s1)&&e2.getText().toString().equals(s4))
                {
                    Toast.makeText(getApplicationContext(),"Welcome "+s1,Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, Menu.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(getApplicationContext(),"User ID or Password invalid",Toast.LENGTH_SHORT).show();
                    e1.setText("");
                    e2.setText("");
                }
            }
        });
        b2.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, signup.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(),"Fill up your details",Toast.LENGTH_SHORT).show();
            }
        }));
    }
}
