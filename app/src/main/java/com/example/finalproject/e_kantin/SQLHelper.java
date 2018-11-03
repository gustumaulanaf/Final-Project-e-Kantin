package com.example.finalproject.e_kantin;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class SQLHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "menu.db";
    private  static  final  int DATABASE_VERSION = 1;
    public SQLHelper(Context context) {
        super(context, DATABASE_NAME,null,DATABASE_VERSION);
    }
    @Override
    public void  onCreate(SQLiteDatabase db) {
        String sql = "create table biodata(no integer primary key, nama text null, jenis text null, harga int null);";
        Log.d("Data","onCreate:"+sql);
        db.execSQL(sql);
    }
    @Override
    public void onUpgrade (SQLiteDatabase arg0, int arg1, int arg2) {

    }
}
