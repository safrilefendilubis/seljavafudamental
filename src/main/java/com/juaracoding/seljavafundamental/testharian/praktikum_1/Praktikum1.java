package com.juaracoding.seljavafundamental.testharian.praktikum_1;

import java.util.Scanner;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author User a.k.a. Safril Efendi Lubis
Java Developer
Created on 1/13/2023 7:17 PM
@Last Modified 1/13/2023 7:17 PM
Version 1.1
*/
public class Praktikum1 {
    public static void main(String[] args) {
        char chX ='S';
        int intX = chX;
        System.out.println(intX);
        Scanner scanner = new Scanner(System.in);
        String dopkalis = scanner.nextLine();
        System.out.println("NILAI DOPKALIS ADALAH : "+dopkalis);
        int intTampung = 0;
        for (int i=0;i<dopkalis.length();i++){
            chX = dopkalis.charAt(i);
            intX = chX;
            if (intX>=32 && intX<=90){
                intTampung = intTampung + intX;
                System.out.println(" INDEX KE "+i+" HURUF "+chX+" KODE ASCII "+intX);
            }
        }
        System.out.println("NILAI INT TAMPUNG ADALAH :"+intTampung);
    }
}
