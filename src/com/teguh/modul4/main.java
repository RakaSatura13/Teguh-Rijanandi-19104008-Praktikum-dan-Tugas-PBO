package com.teguh.modul4;
import Employee.*;

import java.util.Random;

public class main {

    /**
     * @param args
     * Disini semua deklarasi variabel itu menjadi satu
     * jadi employee yang tidak memiliki total_penjualan pada pendeklarasiannya
     * maka di tuliskan 0
     */

    public static void main(String[] args) {
        Employee_Init[] employee = {
                new Commision(
                        "Agus Subekti",
                        "12345678",
                        100000,
                        20000,
                        2,
                        (float) 0
                ),

                new Salaired(
                        "Rifqi Alfinnur",
                        "1910000",
                        200000,
                        0,
                        0,
                        0
                ),

                new Project_planner(
                        "Narantyo Maulana",
                        "18123456",
                        300000,
                        50000,
                        5,
                        4
                )
        };

        /**
         * Generate random index array
         * untuk mencetaknya
         */

        Random pilihan = new Random();
        Employee_Init karyawan = employee[pilihan.nextInt(employee.length)];

        // Get gaji
        System.out.println("Semua gaji karyawan");
        karyawan.getGaji();
    }
}
