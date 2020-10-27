package com.teguh.pertemuan3.Agregasi;

import java.util.ArrayList;
import java.util.List;

public class DemoJurusan {
    public static void main(String[] args) {
        Jurusan jurusan = new Jurusan("2110", "RPL");

        Mahasiswa mahasiswa1 = new Mahasiswa("Paimon", 12345);
        Mahasiswa mahasiswa2 = new Mahasiswa("Sun Go Kong", 54321);
        Mahasiswa mahasiswa3 = new Mahasiswa("Naruto", 67890);

        // List Mahasiswa
        List<Mahasiswa> mahasiswaList = new ArrayList<>();
        mahasiswaList.add(mahasiswa1);
        mahasiswaList.add(mahasiswa2);
        mahasiswaList.add(new Mahasiswa("Dilan", 1945));
        // Untuk copas data dari list mahasiswa class demo ke class Jurusan
        jurusan.setMahasiswaList(mahasiswaList);

        // untuk memasukkan data mahasiswa langsung ke class jurusan
        jurusan.addMahasiswa(mahasiswa3);
        jurusan.printDataJurusan();
    }
}