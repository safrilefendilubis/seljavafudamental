package com.juaracoding.seljavafundamental.cobacoba.coba_1;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author User a.k.a. Safril Efendi Lubis
Java Developer
Created on 1/17/2023 6:54 PM
@Last Modified 1/17/2023 6:54 PM
Version 1.1
*/
public class LoopContinue {
    public static void main(String []args) {
        for(int j=0;j<5;j++)
        {
            if(j==3)
            {
                System.out.println(" Ini yang terlompati "+j);
                continue;
            }
            System.out.println(" 1 kali loop ke "+j);
        }
		/*
		0
		1
		2
		4
		 */

//		int sum  =0;
//		int item =0;
//		while(item<5)
//		{
//			item++;
//			sum += item;
//			if(sum>=6) {
//				System.out.println("Ini yang terlompati "+item);
//				continue;
//			}
//
//
//
//			String strSub=  "";
//			strSub=  "abcujashjdiuahsdiuahsdiuashdiuashdaiudshausidhasd".substring(10);
//
//			System.out.println("1 kali loop ke "+item);
//		}


//		String strX = new String("INI NISA!!");
//		String [] strY = new String[5];
////		System.out.println(strX);
////		System.out.println(strY);
////		System.out.println(strY[1]);
//		int intB = 0;
//		int [] intC = new int[3];
//		intC[1]=2;
//		intC[10]=2;
//
//		System.out.print(intC[0]);
    }
}
//1 kali loop ke item 1 -> SUM
//1 kali loop ke item 2 -> SUM
//Ini yang terlompati 3 -> SUM 6
//1 kali loop ke  4 -> SUM 10




//1 kali loop ke 0
//1 kali loop ke 1
//1 kali loop ke 2
//Ini yang terlompati 3
//1 kali loop ke 4

