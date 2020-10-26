package com.Teguh.Tugas.Modul2.Nomer3;

/** Code By Teguh Rijanandi
 */

// Class DemoPacar
public class DemoPacar {
    public static void main(String[] args) {
        // Inisiasi objek dari kelas Mahasiswa dan Pacar
        Mahasiswa mahasiswa = new Mahasiswa();
        Pacar pacar = new Pacar();

        // Memanggil Method getStatus
        mahasiswa.getStatus();
        pacar.getStatus();
    }
}
