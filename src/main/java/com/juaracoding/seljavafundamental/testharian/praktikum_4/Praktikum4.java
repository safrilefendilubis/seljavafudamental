package com.juaracoding.seljavafundamental.testharian.praktikum_4;

import java.util.Arrays;
import java.util.Random;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author User a.k.a. Safril Efendi Lubis
Java Developer
Created on 1/31/2023 2:36 PM
@Last Modified 1/31/2023 2:36 PM
Version 1.1
*/
public class Praktikum4 {
    public static void main(String[] args) {
        String strKonsonan = "bcdfghjklmnpqrstvwxyz";
        String strAlphabet ="abcdefghijklmnopqrstuvwxyz";
        String strVokal = "aiueo";
        String strTandaSambung = "_.";
        String strAgka = "0123456789";
        String[] strProvider = {"@gmail", "@hotmail", "@yahoo", "@ymail"};
        String strDot = ".";
        int intKonsonan = strKonsonan.length()-1;
        int intAlphabet = strAlphabet.length()-1;
        int intVokal = strVokal.length()-1;
        int intTandaSambung = strTandaSambung.length()-1;
        int intAngka = strAgka.length()-1;
        int intDot = strDot.length()-1;
        int intProvider = strProvider.length-1;
        String strOutput ="";
        Random rand = new Random();
        int intPenampung = rand.nextInt(2);
        int intTotalLoop = rand.nextInt(25,40);

        for (int i=0;i<intTotalLoop;i++){
            if(i<7){
                if(intPenampung==1){
                    intPenampung=2;
                    strOutput += strKonsonan.charAt(rand.nextInt(intKonsonan));
                }else {
                    intPenampung = 1;
                    strOutput += strVokal.charAt(rand.nextInt(intVokal));
                }
            }else{
                strOutput += strTandaSambung.charAt(rand.nextInt(intTandaSambung));
                strOutput += strAlphabet.charAt(rand.nextInt(intAlphabet));
                strOutput += strDot.charAt(rand.nextInt(intDot));
                strOutput += strProvider[rand.nextInt(intProvider)];
            }
        }
    }
}
