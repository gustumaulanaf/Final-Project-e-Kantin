package com.example.finalproject.e_kantin_pemnjual;

/**
 * Created by Rizki Faiq on 01/12/2018.
 */


public class Barang {

    private long id;
    private String nama_menu;
    private String harga_menu;

    public Barang()
    {

    }

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the nama_menu
     */
    public String getNama_menu() {
        return nama_menu;
    }

    /**
     * @param nama_menu the nama_menu to set
     */
    public void setNama_menu(String nama_menu) {
        this.nama_menu = nama_menu;
    }

    /**
     * @return the harga_menu
     */
    public String getHarga_menu() {
        return harga_menu;
    }

    /**
     * @param harga_menu the harga_menu to set
     */
    public void setHarga_menu(String harga_menu) {
        this.harga_menu = harga_menu;
    }

    @Override
    public String toString()
    {
        return  nama_menu +" "+"("+"Rp."+ harga_menu+")";
    }
}
