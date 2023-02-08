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
//        String strVokal = "aiueo";
//        String strKonso = "bcdfghjklmnpqrstvwxyz";
//        String strAlphabet = "abcdefghijklmnopqrstuvwxyz";
//        int intVokal = strVokal.length() - 1;
//        int intKonso = strKonso.length() - 1;
//        int intAlphabet = strAlphabet.length() - 1;
//        String strOutput = "";
//        Random rand = new Random();
//        int intPenampung = rand.nextInt(2);// output dari sini adalah 1 dan 2, 1 adalah konsonan dan 2 adalah vokal
//        int intTotalLoop = rand.nextInt(12, 26);
//
//        for (int i = 0; i < intTotalLoop; i++) {//anggap ini 15 berarti dari 0 s.d 14 disitu ada kondisi 0 s.d 6 harus selang seling
//            //fohikalwohgyre
//            if (i < 7) {
//                if (intPenampung == 1) {
//                    intPenampung = 2;
//                    strOutput += strKonso.charAt(rand.nextInt(intKonso));
//                } else {
//                    intPenampung = 1;
//                    strOutput += strVokal.charAt(rand.nextInt(intVokal));
//                }
//            } else {
//                strOutput += strAlphabet.charAt(rand.nextInt(intAlphabet));
//            }
//
//        }
//        System.out.println(strOutput.substring(0, 1).toUpperCase() + strOutput.substring(1));//Fohikalwohgyre


        //Praktikum4
        /*
            Soal Nomor 1 Praktikum 4 Java Fundamental
          */

        /*
            Jumlah karakter yang konstan untuk format tersebut adalah
            1. Tanda Hubung (1 digit)
            2. Tanda @ (1 digit)
            3. Tanda . setelah provider sebelum domain (1 digit)
            4. Angka (2 digit)

            Jumlah karakter yang dinamis ada di
            1. format pemilihan provider
            2. format pemilihan domain
         */

//        for (int u = 0; u < 100; u++) {
//
//            int intMax = 40;//persyaratan maksimal 40 karakter
//            int intMin = 25;//persyaratan minimal 25 karakter
//            StringBuilder sBuild = new StringBuilder();
//            Random rand = new Random();
//            String strAlphabet = "abcdefghijklmnopqrstuvwxyz";
//            int intLengthAlphabet = strAlphabet.length();
//            String strNumeric = "0123456789";
//            int intLengthNumeric = strNumeric.length();
//            String[] strTandaHubung = {"_", "."};
//            int intRandTandaHubung = rand.nextInt(strTandaHubung.length - 1);//1 -> 1
//            String[] strProvider = {"yahoo", "gmail", "hotmail", "ymail"};
//            int intRandProvider = rand.nextInt(strProvider.length - 1);//3 -> 5
//            String[] strDomain = {"com", "co.id", "id", "edu", "ac.id", "sch", "xyz", "en"};
//            int intRandDomain = rand.nextInt(strDomain.length - 1);//6 -> 3
//            final int intJmlKarakterConstant = 5;
//            String strFormatEmail = "";
//
//            int intTotalAttributFormat = strDomain[intRandDomain].length() + strProvider[intRandProvider].length() + intJmlKarakterConstant;//13
//            int intLengthMinHuruf = (int) Math.ceil((intMin - intTotalAttributFormat) / 2.0);// 25 - 13 = 12 / 2 = 6
//            int intLengthMaxHuruf = (int) Math.floor((intMax - intTotalAttributFormat) / 2.0);// 40 - 13 = 27 / 2 = 13.5
//            int intLoopKataAwal = rand.nextInt(intLengthMinHuruf, intLengthMaxHuruf); // 9
//            int intLoopKataAkhir = rand.nextInt(intLengthMinHuruf, intLengthMaxHuruf + 1); // 14
//            String strTampungKataAwal = "";
//            String strTampungKataAkhir = "";
//            for (int i = 0; i < intLoopKataAwal; i++) {
//                sBuild.setLength(0);
//                strTampungKataAwal = sBuild.append(strTampungKataAwal).append(strAlphabet.charAt(rand.nextInt(intLengthAlphabet - 1))).toString();
//            }
//            for (int i = 0; i < intLoopKataAkhir; i++) {
//                sBuild.setLength(0);
//                strTampungKataAkhir = sBuild.append(strTampungKataAkhir).append(strAlphabet.charAt(rand.nextInt(intLengthAlphabet - 1))).toString();
//            }
//            sBuild.setLength(0);
//            String strTampungNumeric = sBuild.append(strNumeric.charAt(rand.nextInt(intLengthNumeric - 1))).append(strNumeric.charAt(rand.nextInt(intLengthNumeric - 1))).toString();
//
//            sBuild.setLength(0);
//            strFormatEmail = sBuild.append(strTampungKataAwal).
//                    append(strTandaHubung[intRandTandaHubung]).
//                    append(strTampungKataAkhir).append(strTampungNumeric).append("@").append(strProvider[intRandProvider]).append(".").append(strDomain[intRandDomain]).toString();
//
//            System.out.println("Hasil Generate Adalah : " + strFormatEmail + " ----------->" + strFormatEmail.length());
////            int checkLength = strFormatEmail.length();
////            System.out.println("Mulai Proses Pengecekan");
////            if(checkLength<25 || checkLength>40){
////                System.out.println("Hasil Generate Adalah : "+strFormatEmail+" ----------->"+strFormatEmail.length());
////            }
//        }


        //Praktikum 5
 /*
          Soal Nomor 2 Praktikum 5 Java Fundamental
          */
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Masukkan Nilai : ");
//        int intLoop = scanner.nextInt();
//
//        for (int i=0;i<intLoop;i++)
//        {
//            for (int j=0;j<intLoop;j++)
//            {
//                if(j<=i){
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//        }


        /*
          Soal Nomor 1 Praktikum 5 Java Fundamental
          */

//        localhost:8080/api/baru?xtest
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Nilai : ");//9
        int intLoop = scanner.nextInt();
        int intCursor = 0;//diset bernilai i atau jumlah baris yang akan print nilainya dan dikurangi terus
        String strConvert="";
        String strPrintSpace="";//print spasi
        StringBuilder sBuild = new StringBuilder();
        int intLengthSpace=0;
        int intBackward = 0;
        String strPrintRow = "";
        for (int i=1;i<=intLoop;i++)
        {
            intCursor=i;
            intBackward=intLoop;
            for (int j=1;j<=intLoop;j++)
            {
                if(j>intLoop-i)
                {
                    sBuild.setLength(0);
                    strPrintRow = sBuild.append(strPrintRow).append(intCursor).toString();
                    intCursor--;
                }else{
                    strPrintSpace="";
                    strConvert = String.valueOf(intBackward);
                    intLengthSpace =strConvert.length();
                    if(intLengthSpace!=1)
                    {
                        for (int k=0;k<intLengthSpace;k++){
                            sBuild.setLength(0);
                            strPrintSpace = sBuild.append(strPrintSpace).append(" ").toString();
                        }

                        sBuild.setLength(0);
                        strPrintRow = sBuild.append(strPrintRow).append(strPrintSpace).toString();
                    }else{
                        sBuild.setLength(0);
                        strPrintRow = sBuild.append(strPrintRow).append(" ").toString();
                    }
                }
                intBackward--;
            }
            sBuild.setLength(0);
            strPrintRow = sBuild.append(strPrintRow).append("\n").toString();
        }
        System.out.println(strPrintRow);



    }
}






