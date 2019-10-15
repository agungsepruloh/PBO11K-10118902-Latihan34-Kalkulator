package com.pbo;

import java.util.Scanner;

/*
 * #Author
 * Nama  : Agung Sepruloh
 * NIM   : 10118902
 * Kelas : IF-11K
 * Deskripsi Program : program ini berguna untuk melakukan operasi aritmatika
 *
 */

public class Kalkulator {

    public static double value1;
    public static double value2;

    public static double tambahBilangan() {
        return value1 + value2;
    }

    public static double kurangBilangan() {
        return value1 - value2;
    }

    public static double kaliBilangan() {
        return value1 * value2;
    }

    public static double bagiBilangan() {
        return value1 / value2;
    }

    public static double sisaBilangan() {
        return value1 % value2;
    }

    public static void main(String[] args) {
        System.out.println("===== Aplikasi Kalkulator Bilangan =====");
        System.out.print("Masukkan angka ke-1\t: ");
        Scanner scanner = new Scanner(System.in);
        value1 = scanner.nextInt();
        System.out.print("Masukkan angka ke-2\t: ");
        Scanner scanner1 = new Scanner(System.in);
        value2 = scanner1.nextInt();
        System.out.println("\nHasil Pertambahan\t: " + tambahBilangan());
        System.out.println("Hasil Pengurangan\t: " + kurangBilangan());
        System.out.println("Hasil Perkalian\t\t: " + kaliBilangan());
        System.out.println("Hasil Pembagian\t\t: " + bagiBilangan());
        System.out.println("Hasil Sisa\t\t\t: " + sisaBilangan());
    }
}
