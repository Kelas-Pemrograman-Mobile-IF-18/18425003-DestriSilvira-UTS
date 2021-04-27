package com.destri.myapplication.users;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ornach.nobobutton.NoboButton;
import com.destri.myapplication.R;
import com.destri.myapplication.admin.HomeAdminActivity;

import java.time.Instant;

public class RegisActivity extends AppCompatActivity {

    Button btnLogin;
    NoboButton btnRegis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regis2);

        getSupportActionBar().hide();

        btnLogin = (Button) findViewById(R.id.RegisBtn);
        btnRegis = (NoboButton) findViewById(R.id.LoginBtn);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(RegisActivity.this,LoginActivity.class);
                startActivity(i);
                finish();

            }
        });

        btnRegis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(RegisActivity.this, HomeAdminActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}