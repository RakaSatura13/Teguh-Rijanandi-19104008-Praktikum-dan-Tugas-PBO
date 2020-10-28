package com.teguh.nomer1;
import java.util.Scanner;

/**
 * Coded By Teguh Rijanandi
 * NIM 19104008
 * Institut Teknologi Telkom Purwokerto
 * All Rights Reserved
 *
 * Program ini berfungsi sebagai konversi suhu
 * dengan aturan sebagai berikut
 * C → F; F → K; K → R; R → C
 *
 * Maap mungkin rumusnya sedikit salah,
 * bingung rumusnya hehe
 */

public class hitungSuhu {

    /**
     * Class Main pada program ini
     * @param args
     */
    public static void main(String[] args) {
        // untuk membaca inputan nantinya
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan suhu dalam Celcius : ");
        Float suhu = input.nextFloat();

        // call all method here
        Float Fahrenheit = celciusToFahrenheit(suhu);
        Float FahrenheitToKelvin = FahrenheittoKelvin(Fahrenheit);
        Float KelvinToReamur = KelvintoReamur(FahrenheitToKelvin);
        Float ReamurToCelcius = ReamurtoCelcius(KelvinToReamur);

        // print all message
        System.out.println(suhu + " Celcius jika di konversi ke Fahrenheit maka hasilnya " + Fahrenheit);
        System.out.println(Fahrenheit + " Fahrenheit jika di konversi ke Kelvin maka hasilnya " + FahrenheitToKelvin);
        System.out.println(FahrenheitToKelvin + " Kelvin jika di konversi ke Reamur maka hasilnya " + KelvinToReamur);
        System.out.println(KelvinToReamur + " Reamur jika di konversi ke celcius maka hasilnya " + ReamurToCelcius);
    }

    /* Convert Celsius to Fahrenheit */
    public static float celciusToFahrenheit(Float C) {
        /* Convert Celsius to Fahrenheit with these process */
        float F = C * (9f / 5) + 32;

        /* Print result */
        return F;
    }

    // Function to convert temperature from degree
    // Fahrenheit to Kelvin
    public static float FahrenheittoKelvin( float F )
    {
        return (float) (273.5 + ((F - 32.0) * (5.0/9.0)));
    }

    // Rumus untuk mengubah
    // suhu dari Kelvin (K)  ke Reaumur (°R)
    public static float KelvintoReamur(float K) {
        return (float) 4/5 * (K + 273);
    }

    // Rumus reamur ke celcius
    public static float ReamurtoCelcius(float R) {
        return (float) (5/4) * R;
    }

}
