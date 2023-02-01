package com.juaracoding.seljavafundamental.cobacoba.coba_1;

import java.util.Random;
import java.util.Scanner;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author User a.k.a. Safril Efendi Lubis
Java Developer
Created on 1/24/2023 7:09 PM
@Last Modified 1/24/2023 7:09 PM
Version 1.1
*/
public class Praktikum {
    public static void main(String[] args) {
        /*
        praktikum 2 soal 1
         */

        //deklarasi dan inisialisasi
//        Scanner sc = new Scanner(System.in);
//        int intNumber = 0, intTotal = 0;
//        boolean isAgain = true;
//        String strNilaiInput = "";
//        int intLoop = 0;
//        String [] strArr ;
//        String strPrint = "";
//        try {
//            System.out.println("Masukkan angka sepuasnya: ");
//            do {
//                intNumber = sc.nextInt();//input
//                intTotal += intNumber;//proses penjumlahan input
//                strNilaiInput = strNilaiInput+intNumber+",";
//                intLoop++;
//            } while (isAgain);
//        } catch (Exception e) {
//
//            if(strNilaiInput.length()>2){
//                strNilaiInput = strNilaiInput.substring(0,strNilaiInput.length()-1);
//                strArr = strNilaiInput.split(",");
//                for(int i=0;i<strArr.length;i++){
//                    if(i!=strArr.length-1){
//                        strPrint = strPrint+strArr[i]+",";
//                    }else{
//                        strPrint = strPrint.substring(0,strPrint.length()-1);
//                        strPrint = strPrint+" dan "+strArr[i];
//                    }
//                }
//                System.out.println("Rata-rata dari penjumlahan angka "+strPrint+" adalah " + (((double)intTotal)/intLoop));//output
//            }else{
//                System.out.println("Untuk Rata-Rata minimal harus menginput 2 angka");
//            }
//        }finally {
//            sc.close();
//        }


        /*
        soal 2
         */


//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Masukkan Nama Depan : ");
//        String strFirstName = scanner.nextLine();
//        System.out.print("Masukkan Nama Belakang : ");
//        String strLastName = scanner.nextLine();
//        String [] arrFirstName = strFirstName.split(" ");
//        String [] arrLastName  = strLastName.split(" ");
//        String strInisial = "";
//        String strFullName = "";
//
//        if(!strFirstName.equals("")){
//            for (int i=0;i<arrFirstName.length;i++)
//            {
//                strInisial = strInisial+arrFirstName[i].charAt(0);
//                strFullName = strFullName+arrFirstName[i]+" ";
//            }
//        }
//        if(!strLastName.equals("")){
//            for (int i=0;i< arrLastName.length;i++)
//            {
//                strInisial = strInisial+arrLastName[i].charAt(0);
//                strFullName = strFullName+arrLastName[i]+" ";
//            }
//        }
//        System.out.println("Inisial "+strFullName+" adalah "+strInisial.toUpperCase());
//
//
//
//        /*
//        praktikum 3 soal 2
//         */
//
        String strVokal = "aiueo";
        String strKonso = "bcdfghjklmnpqrstvwxyz";
        String strAlphabet ="abcdefghijklmnopqrstuvwxyz";
        int intVokal = strVokal.length()-1;
        int intKonso = strKonso.length()-1;
        int intAlphabet = strAlphabet.length()-1;
        String strOutput ="";
        Random rand = new Random();
        int intPenampung = rand.nextInt(2);// output dari sini adalah 1 dan 2, 1 adalah konsonan dan 2 adalah vokal
        int intTotalLoop = rand.nextInt(12,26);

        for(int i=0;i<intTotalLoop;i++){//anggap ini 15 berarti dari 0 s.d 14 disitu ada kondisi 0 s.d 6 harus selang seling
            //fohikalwohgyre
            if(i<7){
                if(intPenampung==1){
                    intPenampung=2;
                    strOutput += strKonso.charAt(rand.nextInt(intKonso));
                }else{
                    intPenampung=1;
                    strOutput += strVokal.charAt(rand.nextInt(intVokal));
                }
            }else{
                strOutput += strAlphabet.charAt(rand.nextInt(intAlphabet));
            }

        }
        System.out.println(strOutput.substring(0,1).toUpperCase()+strOutput.substring(1));//Fohikalwohgyre
    }

}





