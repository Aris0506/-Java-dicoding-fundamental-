package StrukturDasar.com.dicoding.javafundamental.basic.accesmodifier.package2;

import StrukturDasar.com.dicoding.javafundamental.basic.accesmodifier.package1.KelasA;

public class parent {
    
    public static void main(String[] args) {
        // Kode ini pasti akan mengalami kompiler error
        KelasA kelasA = new KelasA();
        // System.out.println(kelasA.functionB());
        // System.out.println(kelasA.memberB);
        // System.out.println(kelasA.memberC);


        KelasB kelasB = new KelasB();
        kelasB.methodC();
    }
}
