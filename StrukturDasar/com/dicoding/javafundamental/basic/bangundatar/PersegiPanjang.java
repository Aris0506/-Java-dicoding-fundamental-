package StrukturDasar.com.dicoding.javafundamental.basic.bangundatar;

public class PersegiPanjang implements BangunDatar {
    
    PersegiPanjang() {
        
    }

    @Override
    public double luas(int s1, int s2) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'luas'");
        return (s1 * s2);
    }

    @Override
    public double keliling(int s1, int s2) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'keliling'");
        return (2 * (s1 + s2));
    }
}
