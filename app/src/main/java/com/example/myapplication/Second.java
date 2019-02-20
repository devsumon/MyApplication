package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        String username = getIntent().getStringExtra("username");
        String email = getIntent().getStringExtra("email");
        String address = getIntent().getStringExtra("address");


        TextView usernameText = findViewById(R.id.username_view);
        TextView emailText = findViewById(R.id.email_view);
        TextView addressText = findViewById(R.id.address_view);

        usernameText.setText(username);
        emailText.setText(email);
        addressText.setText(address);


    }
}
