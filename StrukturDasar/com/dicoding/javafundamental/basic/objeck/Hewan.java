package StrukturDasar.com.dicoding.javafundamental.basic.objeck;

public class Hewan {

    String nama;
        int berat;
        int jumlahKaki;

        // ini merupakan konstrukur dari kelas hewan.
        // konstruktor adalah method yang pertama kali dijalankan ketika object diciptakan
    public Hewan(String namaHewan) {
        nama = namaHewan;
    }
    
    public void beratHewan(int beratHewan){
        berat = beratHewan;
    }

    public void jumlahKakiHewan(int jumlahKakiHewan){
        jumlahKaki = jumlahKakiHewan;
    }
    
    public void cetakHewan() {
        System.out.println("Nama Hewan ini: " + nama);

        System.out.println("Berat hewan ini: " + berat + " kg");

        System.out.println("Jumlah Kaki: " + jumlahKaki + " kaki");
    }


    
}
