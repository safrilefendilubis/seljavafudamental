package com.juaracoding.seljavafundamental.testharian.praktikum_6;

import java.util.ArrayList;
import java.util.Scanner;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author User a.k.a. Safril Efendi Lubis
Java Developer
Created on 2/7/2023 12:25 PM
@Last Modified 2/7/2023 12:25 PM
Version 1.1
*/
public class Praktikum6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sn = new Scanner(System.in);
        int intNumber = 0;
        int intNilaiDiminta = 0;
        boolean isGood = true;
        ArrayList<Integer> arrTampung = new ArrayList<>();
        try {
            System.out.println("Masukkan Angka : ");
        do {
            intNumber = sc.nextInt();
            arrTampung.add(intNumber);

        }while (isGood);
        }catch (Exception e){
            System.out.println("Angka Yang Dimasukkan : "+arrTampung);
        }
        System.out.println("Masukkan Angka Yang dicari : ");
        intNilaiDiminta = sn.nextInt();
        boolean isFound = true;
        for (int i=0;arrTampung.contains(intNilaiDiminta);i++){
            if(arrTampung.contains(intNilaiDiminta)){
                System.out.println("Angka "+intNilaiDiminta+ " Ditemukan di index ke "+arrTampung.indexOf(intNilaiDiminta)+ " Urutan ke "+arrTampung.indexOf(intNilaiDiminta+1));
                isFound = false;
                break;
            }
        }
        if (isFound){
            System.out.println("Angka "+intNilaiDiminta+ "tidak ditemukan pada data hasil inputan sebelumnya");
        }



    }
}
