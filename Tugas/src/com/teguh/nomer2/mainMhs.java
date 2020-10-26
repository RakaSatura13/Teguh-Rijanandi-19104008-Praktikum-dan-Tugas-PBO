package com.teguh.nomer2;

//import class pendaftaramMhs
import com.teguh.nomer2.pendaftaramMhs;
import java.util.Scanner;

/**
 * Class Utama
 * Teguh Rijanandi 19104008
 */

public class mainMhs {
    public static void main (String[] args) {
        // panggil class pendaftaramMhs
        pendaftaramMhs mahasiswa = new pendaftaramMhs();

        // untuk membaca inputan
        Scanner input = new Scanner(System.in);

        System.out.print("Program Pendaftaran Mahasiswa \n");
        System.out.print("Masukan nama : ");
        String nama = input.nextLine();

        System.out.print("Masukan NIM : ");
        String nim = input.nextLine();

        System.out.print("Masukan alamat : ");
        String alamat = input.nextLine();

        // set menggunakan method yang ada di class pendaftaramMhs
        mahasiswa.setNama(nama);
        mahasiswa.setNim(nim);
        mahasiswa.setAlamat(alamat);

        // print semua hasilnya menggunakan
        // bantuan printAll yang ada di class
        // pendaftaramMhs
        mahasiswa.printAll();
    }
}
