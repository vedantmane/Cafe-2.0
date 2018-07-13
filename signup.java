package com.example.admin.cafe20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class signup extends AppCompatActivity {
    TextView t1,t2,t3,t4,t5;
    EditText e1,e2,e3,e4,e5;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        t1 = findViewById(R.id.name);
        t2 = findViewById(R.id.email);
        t3 = findViewById(R.id.phone);
        t4 = findViewById(R.id.pwd);
        t5 = findViewById(R.id.re_pwd);
        e1 = findViewById(R.id.editName);
        e2 = findViewById(R.id.editEmail);
        e3 = findViewById(R.id.editPhone);
        e4 = findViewById(R.id.editPwd);
        e5 = findViewById(R.id.editRe_pwd);
        b1 = findViewById(R.id.register);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (e4.getText().toString().equals(e5.getText().toString())) {
                    Toast.makeText(getApplicationContext(), "Login Now", Toast.LENGTH_SHORT).show();
                    MainActivity.s1 = e1.getText().toString();
                    MainActivity.s2 = e2.getText().toString();
                    MainActivity.s3 = e3.getText().toString();
                    MainActivity.s4 = e4.getText().toString();
                    Intent intent = new Intent(signup.this, MainActivity.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(getApplicationContext(),"Password Incorrect",Toast.LENGTH_SHORT).show();
                    e4.setText("");
                    e5.setText("");
                }
            }
        });
    }
}
