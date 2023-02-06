package com.juaracoding.seljavafundamental.cobacoba.coba_1;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author User a.k.a. Safril Efendi Lubis
Java Developer
Created on 1/17/2023 6:53 PM
@Last Modified 1/17/2023 6:53 PM
Version 1.1
*/
public class LoopCase {
    public static void main(String[] args) {
        int intCaseOne = 10;
        int intBoundary=0;

        System.out.println("==========CASE 1==========");
        for(int i=intCaseOne;i>0;i--)
        {
            if(i%2!=0)
            {
                for(int j=i;j>0;j--)
                {
                    if(j%2!=0)
                    {
                        System.out.print(j+" ,");
                        intBoundary++;
                    }
                }
                System.out.println();
            }

        }
        System.out.println();
        System.out.println("==========CASE 2==========");
        intCaseOne = 5;
        intBoundary=0;

        for(int i=intCaseOne;i>0;i--)
        {
            if(i%2!=0 && intBoundary!=0)
            {
                for(int j=i;j>0;j--)
                {
                    if(j%2!=0)
                    {
                        System.out.print(j+" ,");
                        intBoundary++;
                    }
                }
                System.out.println();
            }else
            {
                intBoundary++;
            }

        }
    }
}
