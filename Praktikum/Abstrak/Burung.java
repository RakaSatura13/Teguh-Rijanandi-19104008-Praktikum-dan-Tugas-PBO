package com.teguh.Pertemuan4.Praktikum.Abstrak;

public class Burung extends Binatang {
    private String nama;

    public Burung(String nama) {
        super("Burung");
        this.nama = nama;
    }

    @Override
    protected void suara() {
        System.out.print("Cuittt cuitttt");
    }

    @Override
    public String toString() {
        return super.toString() + " " + nama;
    }
}
