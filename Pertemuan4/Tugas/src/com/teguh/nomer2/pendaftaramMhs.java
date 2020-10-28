package com.teguh.nomer2;

public class pendaftaramMhs {

    private String nama;
    private String nim;
    private String alamat;

    public pendaftaramMhs() {}

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void printAll() {
        System.out.print("\n");
        System.out.println("Nama mahasiswa : " + getNama());
        System.out.println("NIM mahasiswa : " + getNim());
        System.out.println("Alamat mahasiswa : " + getAlamat());
    }
}
