package com.juaracoding.seljavafundamental.cobacoba.coba_1;

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
//        char chX = 'U';
//        int intX = chX;
//        System.out.println(intX);
//        Scanner scanner = new Scanner(System.in);
//        String strx = scanner.nextLine();
//        System.out.println("NILAI STRX ADALAH : "+strx);
//
//        int intTampung = 0;
//
//        for (int i=0;i<strx.length();i++){
//            chX = strx.charAt(i);
//            intX = chX;
//            if (intX>=32 && intX<=90){
////            if ((intX>=48 && intX<=57) || (intX>=65 && intX<=90) || (intX>=97 && intX<=122)){
////            if ((intX>=97 && intX<=122)){
//                intTampung = intTampung + intX;
//                System.out.println("INDEX KE "+i+" HURUF "+chX+" KODE ASCII "+intX);
//
//            }
//
//
//        }
//        System.out.println("NILAI INT TAMPUNG ADALAH :"+intTampung);
//
////        System.out.println(64>=65);
////        System.out.println(64<=90);

        char chASCII = 'r';
//        System.out.println(chASCII);
//        int intASCII = chASCII;
//        System.out.println(intASCII);

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Kata : ");
        String strInput = sc.nextLine();
        System.out.println(strInput);

        System.out.println("Panjang Karakter Input adalah "+strInput.length());
//        System.out.println(strInput.charAt(11));
        char chInput = 'Y';
        int intInput = 0;
        int intTampung = 0;

        for (int i=0;i<strInput.length();i++)
        {
            chInput = strInput.charAt(i);
            intInput = chInput;
//            if(intInput>=32 && intInput<=90)
            if((intInput>=97 && intInput<=122) ||
                    (intInput>=48 && intInput<=57) ||
                    (intInput>=65 && intInput<=90))
            {
                intTampung = intTampung + intInput;
                System.out.println("Karakter ASCII index ke "+i+" ADALAH "+chInput+" Kode ASCII nya adalah "+intInput);
            }
        }

        System.out.println("Nilai INT TAMPUNG ADALAH "+intTampung);

    }
}
