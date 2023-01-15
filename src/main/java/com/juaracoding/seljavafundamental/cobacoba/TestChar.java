package com.juaracoding.seljavafundamental.cobacoba;

import java.util.Scanner;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author User a.k.a. Safril Efendi Lubis
Java Developer
Created on 1/15/2023 7:29 PM
@Last Modified 1/15/2023 7:29 PM
Version 1.1
*/
public class TestChar {
    public static void main(String[] args) {
        char chX = 'U';
        int intX = chX;
        System.out.println(intX);
        Scanner scanner = new Scanner(System.in);
        String strx = scanner.nextLine();
        System.out.println("NILAI STRX ADALAH : "+strx);

        int intTampung = 0;

        for (int i=0;i<strx.length();i++){
            chX = strx.charAt(i);
            intX = chX;
            if (intX>=32 && intX<=90){
//            if ((intX>=48 && intX<=57) || (intX>=65 && intX<=90) || (intX>=97 && intX<=122)){
//            if ((intX>=97 && intX<=122)){
                intTampung = intTampung + intX;
                System.out.println("INDEX KE "+i+" HURUF "+chX+" KODE ASCII "+intX);

            }


        }
        System.out.println("NILAI INT TAMPUNG ADALAH :"+intTampung);

//        System.out.println(64>=65);
//        System.out.println(64<=90);

    }
}
