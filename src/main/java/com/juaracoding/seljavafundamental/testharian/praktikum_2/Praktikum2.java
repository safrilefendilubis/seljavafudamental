package com.juaracoding.seljavafundamental.testharian.praktikum_2;

import java.util.Scanner;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author User a.k.a. Safril Efendi Lubis
Java Developer
Created on 1/18/2023 11:22 AM
@Last Modified 1/18/2023 11:22 AM
Version 1.1
*/
public class Praktikum2 {
   /*
	Soal Nomor 1 Praktikum 2 Java Fundamental
*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int intNumber = 0;
        double douTotal = 0;
        double douJumlahData = 0;

        boolean isAgain = true;
        try {
            System.out.println("Masukkan angka sepuasnya : ");
        do {

            douTotal+= intNumber;
           douJumlahData++;
        }while (isAgain);
        }catch (Exception e){
            System.out.println("Jumlah : "+douTotal+ " Rata-rata : "+douTotal/douJumlahData);
        }
    }
}
