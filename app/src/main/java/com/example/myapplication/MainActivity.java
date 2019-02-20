package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button);
        final EditText usernameText = findViewById(R.id.edit_username);
        final EditText emailText = findViewById(R.id.edit_email);
        final EditText addressText = findViewById(R.id.edit_address);





      btn.setOnClickListener(new View.OnClickListener() {




          @Override
          public void onClick(View v) {

                  String username = usernameText.getText().toString();
                  String email = emailText.getText().toString();
                  String address = addressText.getText().toString();

                Intent intent = new Intent(MainActivity.this, Second.class);

                intent.putExtra("username", username);
                intent.putExtra("email", email);
                intent.putExtra("address", address);

                startActivity(intent);


          }
      });


    }
}
