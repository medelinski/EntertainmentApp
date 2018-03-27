package com.example.medelinski8813.entertainmentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnLogin;
    private Button btnRegister;
    private Button btnGoHome;
    private EditText etUsername;
    private EditText etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnRegister = (Button) findViewById(R.id.btnRegister);
        btnGoHome = (Button) findViewById(R.id.btnGoHome);

        btnLogin.setOnClickListener(this);
        btnRegister.setOnClickListener(this);
        btnGoHome.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnLogin:
//                Intent homepageIntent = new Intent(MainActivity.this, Homepage.class);
//                MainActivity.this.startActivity(homepageIntent);
             break;
            case R.id.btnRegister:
                Intent registerIntent = new Intent(MainActivity.this, Register.class);
                MainActivity.this.startActivity(registerIntent);
                break;
            case R.id.btnGoHome:
                Intent homepageIntent = new Intent(MainActivity.this, Homepage.class);
                MainActivity.this.startActivity(homepageIntent);
                break;


        }
    }
}
