package StrukturDasar.com.dicoding.javafundamental.basic.accesmodifier.package1;

public class Parent {
    
    public static void main(String[] args) {
        
        KelasA kelasA = new KelasA();

        System.out.println(kelasA.functionB());

        System.out.println(kelasA.memberB);
        System.out.println(kelasA.memberC);
    
    }
}
