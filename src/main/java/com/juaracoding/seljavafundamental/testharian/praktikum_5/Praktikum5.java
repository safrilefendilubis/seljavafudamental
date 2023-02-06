package com.juaracoding.seljavafundamental.testharian.praktikum_5;

import java.util.Scanner;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author User a.k.a. Safril Efendi Lubis
Java Developer
Created on 2/4/2023 10:48 PM
@Last Modified 2/4/2023 10:48 PM
Version 1.1
*/
public class Praktikum5 {
    /*
	Soal Nomor 2 Praktikum 5 Java Fundamental
*/
    public static void main(String[] args) {
        int i;
        int j;
        int n;
        System.out.print("Masukkan jumlah baris : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("======================");
        for (i = 1; i <= n; i++)
        {
            for (j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
