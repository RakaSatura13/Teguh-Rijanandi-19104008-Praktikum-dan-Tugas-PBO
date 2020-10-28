package com.teguh.Pertemuan4.Praktikum.Abstrak;

//Class abstract
public abstract class Binatang {
    private String jenis;

    public Binatang(String jenis) {
        this.jenis = jenis;
    }

    //method abstrak
    protected abstract void suara();

    public String toString() {
        return "Seekor " + jenis;
    }
}