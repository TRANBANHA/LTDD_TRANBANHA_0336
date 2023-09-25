package com.example.login_bt;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Signup extends AppCompatActivity {
    private Button btnSignup_Login;
    private Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        btnSignup_Login = (Button) findViewById(R.id.btn_Signup_Login);
        btnLogin = (Button) findViewById(R.id.btn_Login);

        btnSignup_Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Signup.this, MainActivity.class);
                startActivity(intent);
            }
        });
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Signup.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
