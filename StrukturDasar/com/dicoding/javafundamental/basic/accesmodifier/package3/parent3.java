package StrukturDasar.com.dicoding.javafundamental.basic.accesmodifier.package3;

public class parent3 {
    public static void main(String[] args) {
        System.out.println("Nilainya adalah " + Perhitungan.nilai);

        for (int x = 0 ; x < 5; x++){
            new Perhitungan();
        }
        System.out.println("Sampai "+Perhitungan.nilai);

        System.out.println("getNilai memiliki nilai " + Perhitungan.getNilai());
    }
}
