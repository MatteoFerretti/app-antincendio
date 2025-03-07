package com.example.miaprimaapplicazione;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_registration);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        EditText nome = findViewById(R.id.textNome);
        EditText cognome = findViewById(R.id.textCognome);
        EditText dataNascita = findViewById(R.id.textData);
        EditText email = findViewById(R.id.textUser);
        EditText password = findViewById(R.id.textPw);

        Log.d("RegistrationActivity", "Nome:" + nome.getText().toString()) + ", Cognome:" + cognome.getText().toString() + ", Data:" + dataNascita.getText().toString() + ", Email:" + email.getText().toString() + ", Password:" + password.getText().toString());
    }
}