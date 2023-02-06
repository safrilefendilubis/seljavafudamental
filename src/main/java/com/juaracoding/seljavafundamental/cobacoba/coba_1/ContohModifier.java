package com.juaracoding.seljavafundamental.cobacoba.coba_1;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author User a.k.a. Safril Efendi Lubis
Java Developer
Created on 1/16/2023 9:23 PM
@Last Modified 1/16/2023 9:23 PM
Version 1.1
*/
public class ContohModifier {

        public static void main(String[] args) {
            int  intInput = 11;
//        System.out.println(intInput);
            ContohMethod contohMethod = new ContohMethod();
//        System.out.println("Nilai Balikan dari Method adalah : "+contohMethod.cekBilanganIsTen(intInput));
//        boolean isTen = contohMethod.cekBilanganIsTen(intInput);
//        if(isTen){
//            System.out.printf("Angka "+intInput+" Lebih dari 10");
//        }else{
//            System.out.printf("Angka "+intInput+" Kurang dari 10");
//        }
            double douInput = 2.0;
            double douTampung = contohMethod.luasPersegi(douInput);

            System.out.println("Nilai persegi dari sisi yang berjumlah "+douInput+" adalah "+douTampung);
            System.out.println("Coba lihat yang ini");


        }
    }

