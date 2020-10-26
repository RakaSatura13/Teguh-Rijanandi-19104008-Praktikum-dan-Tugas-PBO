package com.teguh.nomer3;
import com.teguh.nomer3.detaiKaryawan;

public class mainKaryawan {

    public static void main(String[] args) {
        /**
         * Buat class baru
         */
        detaiKaryawan karyawan = new detaiKaryawan();

        /**
         * Cetak detail karyawan
         */

        System.out.println("Nama karyawan " + karyawan.getNamaKaryawan());
        System.out.println("Alamat karyawan = " + karyawan.getAlamatKaryawan());
        System.out.println("Nomor telepon karyawan = " + karyawan.getNoTelp());
        System.out.println("Gaji karyawan = " + karyawan.getGaji());
    }
}
