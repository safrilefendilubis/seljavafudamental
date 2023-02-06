package com.juaracoding.seljavafundamental.cobacoba.coba_1;

import java.util.ArrayList;
import java.util.List;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author User a.k.a. Safril Efendi Lubis
Java Developer
Created on 2/1/2023 10:26 PM
@Last Modified 2/1/2023 10:26 PM
Version 1.1
*/
public class ArrayListSample {
    public static void main(String[] args) {
//		ArrayList <String> eList = new ArrayList<String>();
//		List<ModelEncaps> me = new ArrayList<ModelEncaps>();
//		me.add(new ModelEncaps("Adith","Adithya","Pria"));
//		me.add(new ModelEncaps("Manda","Alamanda","Wanita"));
//		me.add(new ModelEncaps("Andhika Bagaskara","dikabagas","Pria"));
//		me.add(new ModelEncaps("Ahyar Ibrahim","boimkeren","Pria"));
//		me.add(new ModelEncaps("Nisa","annisa","Wanita"));
//		System.out.println(me.size());
////		me.clear();
////		eList.add(new ModelEncaps("Adith","Adithya","Pria"));
//		for(int i=0;i<me.size();i++)
//		{
//			System.out.println(me.get(i).getUserN()+"===="+me.get(i).getPassword()+"===="+me.get(i).getJenisKelamin());
//		}
//
////		me = new ArrayList<ModelEncaps>();
//		me.clear();
//		me.add(new ModelEncaps("Adith","Adithya","Pria"));
//		me.add(new ModelEncaps("Manda","Alamanda","Wanita"));
//		me.add(new ModelEncaps("Andhika Bagaskara","dikabagas","Pria"));
//		me.add(new ModelEncaps("Ahyar Ibrahim","boimkeren","Pria"));
//		me.add(new ModelEncaps("Nisa","annisa","Wanita"));
//		me.add(new ModelEncaps("Deby","Utari","Wanita"));
//		me.add(new ModelEncaps("Syafril","Efendy","Pria"));
//		System.out.println(me.size());
////		me.clear();
////		eList.add(new ModelEncaps("Adith","Adithya","Pria"));
//		for(int i=0;i<me.size();i++)
//		{
//			System.out.println(me.get(i).getUserN()+"===="+me.get(i).getPassword()+"===="+me.get(i).getJenisKelamin());
//		}

        List<ModelEncaps> me = new ArrayList<ModelEncaps>();
        ModelEncaps modelEncaps = new ModelEncaps();//x1

        modelEncaps = new ModelEncaps();//x2
        modelEncaps.setUserN("Syafril");//A
        modelEncaps.setPassword("Efendi");
        modelEncaps.setJenisKelamin("Pria");
//        me.add(modelEncaps);

        modelEncaps = new ModelEncaps();//x3
        modelEncaps.setUserN("Deby");//A
        modelEncaps.setPassword("Utari");
        modelEncaps.setJenisKelamin("Wanita");
//        me.add(modelEncaps);

        modelEncaps = new ModelEncaps();//x4
        modelEncaps.setUserN("Fitri");
        modelEncaps.setPassword("Yani");
        modelEncaps.setJenisKelamin("Wanita");
//        me.add(modelEncaps);


//        me.remove(1);

//        for (int i = 0; i < me.size(); i++) {
//            System.out.println(me.get(i).getUserN() + "====" + me.get(i).getPassword() + "====" + me.get(i).getJenisKelamin());
//        }

    }
}
