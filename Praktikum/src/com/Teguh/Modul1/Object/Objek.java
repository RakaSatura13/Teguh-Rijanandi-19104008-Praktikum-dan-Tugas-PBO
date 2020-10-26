package com.Teguh.Modul1.Object;

// Class main atau demo class
public class Objek {
    public static void main(String[] args) {

        // Deklarasi object tanpa parameter
        Mahasiswa mahasiswaTanpa = new Mahasiswa();

        mahasiswaTanpa.setNama("Bambank");
        mahasiswaTanpa.setNim(19104022);

        System.out.println("Mahasiswa 1");
        System.out.println("Nama\t: " + mahasiswaTanpa.getNama());
        System.out.println("Nim\t\t: " + mahasiswaTanpa.getNim());

        // Deklarasi objek dengan parameter
        Mahasiswa mahasiswa = new Mahasiswa("Bambank", 19104022);

        System.out.println("Mahasiswa 2");
        System.out.println("Nama\t: " + mahasiswa.getNama());
        System.out.println("Nim\t\t: " + mahasiswa.getNim());
    }
}
