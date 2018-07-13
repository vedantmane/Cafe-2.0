package com.example.admin.cafe20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Menu extends AppCompatActivity {
    TextView t1,t2,t3,t4,t5;
    CheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16;
    RadioButton rb1,rb2;
    Button b;
    public static ArrayList<String> selection = new ArrayList<String>();
    public static ArrayList<String> pay = new ArrayList<String>();
    public static ArrayList<Integer> rate = new ArrayList<Integer>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        t1 = findViewById(R.id.burger);
        t2 = findViewById(R.id.pizza);
        t3 = findViewById(R.id.cheese);
        t4 = findViewById(R.id.sides);
        t5 = findViewById(R.id.desserts);
        c1 = findViewById(R.id.veggieburger);
        c2 = findViewById(R.id.paneerburger);
        c3 = findViewById(R.id.chickenburger);
        c4 = findViewById(R.id.muttonburger);
        c5 = findViewById(R.id.margherita);
        c6 = findViewById(R.id.paneeroverloaded);
        c7 = findViewById(R.id.chickenbarbeque);
        c8 = findViewById(R.id.chickensalami);
        c9 = findViewById(R.id.bread);
        c10 = findViewById(R.id.cheesebread);
        c11 = findViewById(R.id.nachos);
        c12 = findViewById(R.id.dip);
        c13 = findViewById(R.id.coke);
        c14 = findViewById(R.id.sprite);
        c15 = findViewById(R.id.cake);
        c16 = findViewById(R.id.brownie);
        rb1 = findViewById(R.id.yes);
        rb2 = findViewById(R.id.no);
        b = findViewById(R.id.order);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MainActivity.s5 = "Veggie Burger";
                MainActivity.p1 = "120";
                MainActivity.r1 = 120;
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.s6 = "Paneer Burger";
                MainActivity.p2 = "140";
                MainActivity.r2 = 140;
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.s7 = "Chicken Burger";
                MainActivity.p3 = "160";
                MainActivity.r3 = 160;
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.s8 = "Mutton Burger";
                MainActivity.p4 = "180";
                MainActivity.r4 = 180;
            }
        });
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.s9 = "Margherita";
                MainActivity.p5 = "200";
                MainActivity.r5 = 200;
            }
        });
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.s10 = "Paneer Overloaded";
                MainActivity.p6 = "240";
                MainActivity.r6 = 240;
            }
        });
        c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.s11 = "Chicken Barbeque";
                MainActivity.p7 = "250";
                MainActivity.r7 = 250;
            }
        });
        c8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.s12 = "Chicken Salami";
                MainActivity.p8 = "250";
                MainActivity.r8 = 250;
            }
        });
        c9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.s13 = "Garlic Bread";
                MainActivity.p9 = "80";
                MainActivity.r9 = 80;
            }
        });
        c10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.s14 = "Cheese Garlic Bread";
                MainActivity.p10 = "120";
                MainActivity.r10 = 120;
            }
        });
        c11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.s15 = "Nachos";
                MainActivity.p11 = "100";
                MainActivity.r11 = 100;
            }
        });
        c12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.s16 = "Cheese Dip";
                MainActivity.p12 = "40";
                MainActivity.r12 = 40;
            }
        });
        c13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.s17 = "Coke";
                MainActivity.p13 = "60";
                MainActivity.r13 = 60;
            }
        });
        c14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.s18 = "Sprite";
                MainActivity.p14 = "60";
                MainActivity.r14 = 60;
            }
        });
        c15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.s19 = "Cheese cake";
                MainActivity.p15 = "150";
                MainActivity.r15 = 150;
            }
        });
        c16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.s20 = "Brownie";
                MainActivity.p16 = "150";
                MainActivity.r16 = 150;
            }
        });
        rb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.s21 = "Extra Cheese : Yes";
                MainActivity.p17 = "50";
                MainActivity.r17 = 50;
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selection.removeAll(selection);
                pay.removeAll(pay);
                rate.removeAll(rate);
                Intent intent = new Intent(Menu.this, Confirm.class);
                startActivity(intent);
                if (c1.isChecked())
                {
                    selection.add(MainActivity.s5);
                    pay.add(MainActivity.p1);
                    rate.add(MainActivity.r1);
                }
                if (c2.isChecked())
                {
                    selection.add(MainActivity.s6);
                    pay.add(MainActivity.p2);
                    rate.add(MainActivity.r2);
                }
                if (c3.isChecked())
                {
                    selection.add(MainActivity.s7);
                    pay.add(MainActivity.p3);
                    rate.add(MainActivity.r3);
                }
                if (c4.isChecked())
                {
                    selection.add(MainActivity.s8);
                    pay.add(MainActivity.p4);
                    rate.add(MainActivity.r4);
                }
                if (c5.isChecked())
                {
                    selection.add(MainActivity.s9);
                    pay.add(MainActivity.p5);
                    rate.add(MainActivity.r5);
                }
                if (c6.isChecked())
                {
                    selection.add(MainActivity.s10);
                    pay.add(MainActivity.p6);
                    rate.add(MainActivity.r6);
                }
                if (c7.isChecked())
                {
                    selection.add(MainActivity.s11);
                    pay.add(MainActivity.p7);
                    rate.add(MainActivity.r7);
                }
                if (c8.isChecked())
                {
                    selection.add(MainActivity.s12);
                    pay.add(MainActivity.p8);
                    rate.add(MainActivity.r8);
                }
                if (rb1.isSelected())
                {
                    selection.add(MainActivity.s21);
                    pay.add(MainActivity.p17);
                    rate.add(MainActivity.r17);
                }
                if (c9.isChecked())
                {
                    selection.add(MainActivity.s13);
                    pay.add(MainActivity.p9);
                    rate.add(MainActivity.r9);
                }
                if (c10.isChecked())
                {
                    selection.add(MainActivity.s14);
                    pay.add(MainActivity.p10);
                    rate.add(MainActivity.r10);
                }
                if (c11.isChecked())
                {
                    selection.add(MainActivity.s15);
                    pay.add(MainActivity.p11);
                    rate.add(MainActivity.r11);
                }
                if (c12.isChecked())
                {
                    selection.add(MainActivity.s16);
                    pay.add(MainActivity.p12);
                    rate.add(MainActivity.r12);
                }
                if (c13.isChecked())
                {
                    selection.add(MainActivity.s17);
                    pay.add(MainActivity.p13);
                    rate.add(MainActivity.r13);
                }
                if (c14.isChecked())
                {
                    selection.add(MainActivity.s18);
                    pay.add(MainActivity.p14);
                    rate.add(MainActivity.r14);
                }
                if (c15.isChecked())
                {
                    selection.add(MainActivity.s19);
                    pay.add(MainActivity.p15);
                    rate.add(MainActivity.r15);
                }
                if (c16.isChecked())
                {
                    selection.add(MainActivity.s20);
                    pay.add(MainActivity.p16);
                    rate.add(MainActivity.r16);
                }
                Toast.makeText(getApplicationContext(),"Added to your basket!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
