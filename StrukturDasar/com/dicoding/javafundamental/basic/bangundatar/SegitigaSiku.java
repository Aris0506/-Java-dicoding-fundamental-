package StrukturDasar.com.dicoding.javafundamental.basic.bangundatar;

public class SegitigaSiku implements BangunDatar {
    
    SegitigaSiku(){
        
    }

    @Override
    public double luas(int s1, int s2) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'luas'");
        return (0.5 * s1 * s2);
    }

    @Override
    public double keliling(int s1, int s2) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'keliling'");
        return (s1 + s2 + Math.sqrt((s1 * s1) + (s2 * s2)));
    }
}
