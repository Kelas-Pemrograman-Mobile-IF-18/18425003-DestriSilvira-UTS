package com.destri.myapplication.users;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.destri.myapplication.R;
import com.destri.myapplication.admin.HomeAdminActivity;
import com.ornach.nobobutton.NoboButton;

public class LoginActivity extends AppCompatActivity {

    Button btnRegis;
    NoboButton btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().hide();

        btnRegis = (Button) findViewById(R.id.LoginBtn);
        btnLogin = (NoboButton) findViewById(R.id.RegisBtn);

        btnRegis.setOnClickListener((v) -> {
            Intent i = new Intent(LoginActivity.this, RegisActivity.class);
            startActivity(i);
            finish();
        });
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this, HomeAdminActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}