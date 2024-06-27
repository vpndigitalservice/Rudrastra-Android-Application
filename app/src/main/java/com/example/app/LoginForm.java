package com.example.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class LoginForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_form);

        Button loginButton = findViewById(R.id.button_login_submit);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle login logic here (validate username and password)

                // Assuming login is successful, navigate to MainActivity
                Intent intent = new Intent(LoginForm.this, MainActivity.class);
                startActivity(intent);
                finish(); // Optional: Call finish() to close LoginActivity from back stack
            }
        });
    }
}
