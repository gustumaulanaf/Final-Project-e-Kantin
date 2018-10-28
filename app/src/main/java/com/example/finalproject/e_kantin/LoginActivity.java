package com.example.finalproject.e_kantin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Spinner;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

     private Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_login);
        spinner = findViewById(R.id.spinner);
    }

    public void login(View view) {
        String spText = spinner.getSelectedItem().toString();
        if (spText.contains("Admin"))
        {
            Toast.makeText(LoginActivity.this, "Login Sucess", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(LoginActivity.this , AdminActivity.class);
            startActivity(intent);
        }
        else if (spText.contains("Penjual")){
            Toast.makeText(LoginActivity.this, "Login Sucess", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(LoginActivity.this , PenjualActivity.class);
            startActivity(intent);
        }
        else if (spText.contains("Pembeli")){
            Toast.makeText(LoginActivity.this, "Login Sucess", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(LoginActivity.this , MainActivity.class);
            startActivity(intent);
        }
    }
}
