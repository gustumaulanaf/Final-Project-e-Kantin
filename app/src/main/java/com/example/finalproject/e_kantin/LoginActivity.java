package com.example.finalproject.e_kantin;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.lang.reflect.Array;

public class LoginActivity extends AppCompatActivity {
    private EditText nama , password;
     private Spinner spinner;
     String[] list = {"Penjual" , "Pembeli" ,"Admin"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_login);

        nama    = findViewById(R.id.nama);
        password= findViewById(R.id.password);
        spinner = findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.spinner_layout,R.id.spinner1,list);
        spinner.setAdapter(adapter);
    }

    public void login(View view) {
        String spText = spinner.getSelectedItem().toString();
        String n=nama.getText().toString();
        String p = password.getText().toString();
        if (spText.contains("Admin"))
        {
            if (n.isEmpty())
            {
                nama.setError("Wajib Diisi");
            }
            else if (p.isEmpty()){
                password.setError("Wajib Diisi");
            }
            else{
            Toast.makeText(LoginActivity.this, "Login Sucess", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(LoginActivity.this , AdminActivity.class);
            startActivity(intent);}
        }
        else if (spText.contains("Penjual")){
            if (n.isEmpty())
            {
                nama.setError("Wajib Diisi");
            }
            else if (p.isEmpty()){
                password.setError("Wajib Diisi");
            }
            else{
            Toast.makeText(LoginActivity.this, "Login Sucess", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(LoginActivity.this , PenjualActivity.class);
            startActivity(intent);}
        }
        else if (spText.contains("Pembeli")){
            if (n.isEmpty())
            {
                nama.setError("Wajib Diisi");
            }
            else if (p.isEmpty()){
                password.setError("Wajib Diisi");
            }
            else{
            Toast.makeText(LoginActivity.this, "Login Sucess", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(LoginActivity.this , MainActivity.class);
            startActivity(intent);}
        }

    }
    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setMessage("Apakah Anda ingin Keluar?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        finish();
                        moveTaskToBack(true);

                    }
                })
                .setNegativeButton("No", null)
                .show();
    }

}
