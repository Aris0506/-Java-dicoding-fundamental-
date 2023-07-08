package StrukturDasar.com.dicoding.javafundamental.basic.accesmodifier.package2;

import StrukturDasar.com.dicoding.javafundamental.basic.accesmodifier.package1.KelasA;

public class KelasB extends KelasA  {

    @Override
    protected void methodC() {
        // TODO Auto-generated method stub
        super.methodC();

        System.out.println("Contoh pemanggilan protected dari package luar");
    }
 
    
   
}