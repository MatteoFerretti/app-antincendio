package com.example.miaprimaapplicazione;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //credenziali
        String username = "admin";
        String password = "admin";
        //testo
        EditText textUsername = findViewById(R.id.textUsername);
        EditText textPassword = findViewById(R.id.textPassword);
        //bottoni
        Button buttonLogin = findViewById(R.id.buttonLogin);
        Button buttonSign = findViewById(R.id.buttonSign);

        //visualizzazione errori
        TextView textError = findViewById(R.id.textError);


        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String insertUsername = textUsername.getText().toString();
                String insertPassword = textPassword.getText().toString();
                if(insertUsername.equals(username) && insertPassword.equals(password))
                {
                    Intent intent = new Intent( MainActivity.this, SecondActivity.class);
                    startActivity(intent);
                }
                else
                {
                    textError.setText("Username o password errati");
                }
            }
        });

    }
}