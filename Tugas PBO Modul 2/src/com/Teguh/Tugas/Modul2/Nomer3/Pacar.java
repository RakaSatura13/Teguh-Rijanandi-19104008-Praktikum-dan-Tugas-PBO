package com.Teguh.Tugas.Modul2.Nomer3;

/** Code By Teguh Rijanandi
 */

// Class Pacar yang mewariskan Class Mahasiswa
public class Pacar extends Mahasiswa {
    // Inisiasi variabel (namaPacar, lamaHubungan)
    public String namaPacar = "Tak Ada :)";
    public int lamaHubungan = 0;

    // Method getStatus
    public void getStatus(){
        System.out.println("Nama Pacar\t\t: " + namaPacar);
        System.out.println("Lama Hubungan\t: " + lamaHubungan);
    }
}
