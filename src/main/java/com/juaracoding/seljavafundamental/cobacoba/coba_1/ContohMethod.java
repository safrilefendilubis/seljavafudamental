package com.juaracoding.seljavafundamental.cobacoba.coba_1;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author User a.k.a. Safril Efendi Lubis
Java Developer
Created on 1/16/2023 9:22 PM
@Last Modified 1/16/2023 9:22 PM
Version 1.1
*/
public class ContohMethod {
        public int intZ;
        private int intX ;
        protected  int intY;

        int intA;

        public static void main(String[] args) {
            int intAngka;
        }

        //    public boolean sampleMethod(int intX){
        public void sampleMethod(int intX){// nama method nya sampleMethodINT
            System.out.println("Hello");
//        int intX = 4;
            boolean isGood = true;
            if(intX == 4)
            {
                isGood = false;
            }
//        return isGood;

        }

        public void sampleMethod(){// nama method nya sampleMethod

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
//        return new ArrayList();
        }

        public void ambilMethod(){
            sampleMethod();
        }

        public double luasPersegi(double sisi){

//        System.out.println("Nilai persegi dari sisi yang berjumlah "+sisi+" adalah "+(sisi*sisi));

            double douSisi = sisi*sisi;

            return douSisi;
        }

        public boolean cekBilanganIsTen(int intBilangan){

            boolean isCek = (intBilangan>=10);
            System.out.println(isCek);

//        return (intBilangan>=10);
            return isCek;
        }

//        public void sampleMethod(String strK) throws ArithmeticException,IOException{// nama method nya sampleMethodSTR



        protected void sampleMethodTwo(){

        }

        private void sampleMethodThree(){

        }

        void sampleMethodFour(){




        }

    }

