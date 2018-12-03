package com.example.finalproject.e_kantin_pemnjual;

/**
 * Created by Rizki Faiq on 01/12/2018.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EditData extends Activity implements OnClickListener{

    private DBDataSource dataSource;

    private long id;
    private String harga;
    private String nama;

    private EditText edNama;
    private EditText edHarga;

    private TextView txId;

    private Button btnSave;
    private Button btnCancel;

    private Barang barang;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_data);
        //inisialisasi variabel
        edNama = (EditText) findViewById(R.id.editText_nama);
        edHarga = (EditText) findViewById(R.id.editText_harga);
        txId = (TextView) findViewById(R.id.text_id_barang);
        //buat sambungan baru ke database
        dataSource = new DBDataSource(this);
        dataSource.open();
        // ambil data barang dari extras
        Bundle bun = this.getIntent().getExtras();
        id = bun.getLong("id");
        harga = bun.getString("harga");
        nama = bun.getString("nama");
        //masukkan data-data barang tersebut ke field editor
        txId.append(String.valueOf(id));
        edNama.setText(nama);
        edHarga.setText(harga);

        //set listener pada tombol
        btnSave = (Button) findViewById(R.id.button_save_update);
        btnSave.setOnClickListener(this);
        btnCancel = (Button) findViewById(R.id.button_cancel_update);
        btnCancel.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        switch(v.getId())
        {
            // apabila tombol save diklik (update barang)
            case R.id.button_save_update :
                barang = new Barang();
                barang.setHarga_menu(edHarga.getText().toString());
                barang.setNama_menu(edNama.getText().toString());
                barang.setId(id);
                dataSource.updateBarang(barang);
                Intent i = new Intent(this, ViewData.class);
                startActivity(i);
                EditData.this.finish();
                dataSource.close();
                break;
            // apabila tombol cancel diklik, finish activity
            case R.id.button_cancel_update :
                finish();
                dataSource.close();
                break;
        }
    }
}
