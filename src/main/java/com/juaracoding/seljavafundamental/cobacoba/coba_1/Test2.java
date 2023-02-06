package com.juaracoding.seljavafundamental.cobacoba.coba_1;

import java.util.Random;
import java.util.Scanner;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author User a.k.a. Safril Efendi Lubis
Java Developer
Created on 2/1/2023 4:44 PM
@Last Modified 2/1/2023 4:44 PM
Version 1.1
*/
public class Test2 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan tinggi segitiga: ");
        int tinggi = input.nextInt();

        for (int baris = 1; baris <= tinggi; baris++) {
            for (int spasi = 1; spasi <= tinggi - baris; spasi++) {
                    System.out.print(" ");
            }
            for (int angka = baris; angka >= 1; angka--) {
                System.out.print(angka);
            }
            System.out.println();
        }
    }
}


