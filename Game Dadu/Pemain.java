package com.company;


public class Pemain {
    // definisi atribut
    String nama;
    int nilai;

    Pemain(String nama){
        this.nama = nama;
    }
    // definisi setter Nama
    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return this.nama;
    }


    public void setNilai(int nilai){
        this.nilai = nilai;
    }
    public int getNilai(){
        return this.nilai;
    }
}