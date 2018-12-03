package com.example.finalproject.e_kantin_pemnjual;

/**
 * Created by Rizki Faiq on 01/12/2018.
 */

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CreateData extends Activity implements OnClickListener{

    //inisilisasi elemen-elemen pada layout
    private Button buttonSubmit;
    private EditText edNama;
    private EditText edHarga;
    //inisialisasi kontroller/Data Source
    private DBDataSource dataSource;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_data);

        buttonSubmit = (Button) findViewById(R.id.buttom_submit);
        buttonSubmit.setOnClickListener(this);
        edNama = (EditText) findViewById(R.id.nama_menu);
        edHarga = (EditText) findViewById(R.id.harga_menu);

        // instanstiasi kelas DBDataSource
        dataSource = new DBDataSource(this);

        //membuat sambungan baru ke database
        dataSource.open();
    }

    //KETIKA Tombol Submit Diklik
    @Override
    public void onClick(View v) {
        // Inisialisasi data barang
        String nama = null;
        String harga = null;
        @SuppressWarnings("unused")

        //inisialisasi barang baru (masih kosong)
                Barang barang = null;
        if(edNama.getText()!=null && edHarga.getText()!=null)
        {
            /* jika field nama, merk, dan harga tidak kosong
             * maka masukkan ke dalam data barang*/
            nama = edNama.getText().toString();
            harga = edHarga.getText().toString();
        }

        switch(v.getId())
        {
            case R.id.buttom_submit:
                // insert data barang baru
                barang = dataSource.createBarang(nama,harga);
                Intent intent = new Intent(CreateData.this, ViewData.class);
                Toast.makeText(this, "Menu Berhasil Ditambahkan\n" ,
                        Toast.LENGTH_LONG).show();
                startActivity(intent);
                //konfirmasi kesuksesan

                //break;


        }

    }
}