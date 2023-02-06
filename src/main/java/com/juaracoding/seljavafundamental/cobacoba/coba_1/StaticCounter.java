package com.juaracoding.seljavafundamental.cobacoba.coba_1;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author User a.k.a. Safril Efendi Lubis
Java Developer
Created on 1/17/2023 8:18 PM
@Last Modified 1/17/2023 8:18 PM
Version 1.1
*/
public class StaticCounter {
    public int count = 0;

    StaticCounter()
    {
        count ++;
    }
    public void getCount()
    {
        System.out.print(count+",");
    }

    public static void main( String args[] ) throws InterruptedException
    {
        StaticCounter c1 = new StaticCounter(); //count incremented to 1
        c1.getCount();
        StaticCounter c2 = new StaticCounter(); //count incremented to 1
        c2.getCount();
        StaticCounter c3 = new StaticCounter(); //count incremented to 1
        c3.getCount();
    }

    //1,1,1,

}

