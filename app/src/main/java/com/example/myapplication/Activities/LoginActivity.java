package com.example.myapplication.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplication.R;

public class LoginActivity extends AppCompatActivity {

    private EditText userEdt, passEdt;
    private Button loginBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        
        initView();
    }

    private void initView() {

        userEdt = findViewById(R.id.editTextText);
        passEdt = findViewById(R.id.editTextPassword);
        loginBtn = findViewById(R.id.loginBtn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (userEdt.getText().toString().isEmpty() || passEdt.getText().toString().isEmpty()){

                    Toast.makeText(LoginActivity.this, "Something is missing in your details 😒!", Toast.LENGTH_SHORT).show();
                } else if (userEdt.getText().toString().equals("test") && passEdt.getText().toString().equals("test")) {
                    startActivity(new Intent(LoginActivity.this,MainActivity.class));
                }
                else {
                    Toast.makeText(LoginActivity.this, "your username or password is incorrect", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}