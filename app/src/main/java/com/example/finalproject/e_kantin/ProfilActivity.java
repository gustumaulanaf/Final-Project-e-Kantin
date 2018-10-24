package com.example.finalproject.e_kantin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ProfilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);
      /*  Bundle kirim = getIntent().getExtras();
        TextView emailes = (TextView)findViewById(R.id.t1);
        emailes.setText(kirim.getCharSequence("email"));*/
    }
}
