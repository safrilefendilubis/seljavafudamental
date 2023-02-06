package com.juaracoding.seljavafundamental.cobacoba.coba_1;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author User a.k.a. Safril Efendi Lubis
Java Developer
Created on 1/17/2023 6:49 PM
@Last Modified 1/17/2023 6:49 PM
Version 1.1
*/
public class LoopBreak {
    public static void main(String[] args) {
        int sum  =0;
        int item =0;
//		while(item<5)
//		{
//			item++;
//			sum += item;
//			if(sum>=6) {
//				System.out.println("Berhenti disini proses ke - "+item);
//				break;
//			}
//			System.out.println("1 kali loop ke - "+item);
//		}

//		for(int i=0;i<5;i++)
//		{
//			if(i==3)
//			{
//				System.out.println("Berhenti disini proses ke - "+i);
//				break;
//			}
//			System.out.println("1 kali loop ke - "+i);
//		}

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {


                for(int k=0;k<5;k++)
                {
                    System.out.println("NILAI i ADALAH "+i+" NILAI J ADALAH "+j+" NILAI K ADALAH "+k);
                }
                if(j==2)
                {
                    break;
                }
            }
        }
    }
}
