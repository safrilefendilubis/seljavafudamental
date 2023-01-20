package com.juaracoding.seljavafundamental.testharian.praktikum_3;

import java.util.Scanner;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author User a.k.a. Safril Efendi Lubis
Java Developer
Created on 1/19/2023 10:38 PM
@Last Modified 1/19/2023 10:38 PM
Version 1.1
*/
public class Praktikum3 {
    /*
	Soal Nomor 1 Praktikum 3 Java Fundamental
*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int intJam = 0;
        int intMenit = 0;
        int intDetik = 0;
        int intkonversi = 0;

        System.out.print("Berapa detik yang ingin anda konversikan : ");
        intkonversi = input.nextInt();

        intJam     = intkonversi/3600;
        intMenit   = (intkonversi%3600)/60;
        intDetik   = (intkonversi%3600)%60;

        System.out.println("Konversi dari : "+intkonversi+" detik, Adalah : ");
        System.out.println(intJam+" jam, "+intMenit+" menit, "+intDetik+" detik");
    }

}

