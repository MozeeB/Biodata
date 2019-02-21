package com.mozeeb.biodata.model;

public class ItemBio {

    private String nama;
    private String alamat;
    private String umur;
    private String email;

    public ItemBio(String nama, String alamat, String umur, String email) {
        this.nama = nama;
        this.alamat = alamat;
        this.umur = umur;
        this.email = email;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getUmur() {
        return umur;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
