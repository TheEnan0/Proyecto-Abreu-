package com.example.abreu.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.abreu.MainActivity;
import com.example.abreu.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        Button botonIngresar = findViewById(R.id.button);

        Button botonCancelar2 = findViewById(R.id.button2);

        botonIngresar.setOnClickListener(v -> {
           // Toast.makeText(this,"Ingreso Correctamente",Toast.LENGTH_SHORT).show();

            Intent VentanaPrincipal = new Intent(this, MainActivity.class);

            startActivity(VentanaPrincipal);

        });

        botonCancelar2.setOnClickListener(v -> {
            finish();
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

    }
}