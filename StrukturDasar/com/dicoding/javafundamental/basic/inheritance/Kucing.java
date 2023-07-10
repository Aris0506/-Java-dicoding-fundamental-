package StrukturDasar.com.dicoding.javafundamental.basic.inheritance;

public class  Kucing extends Hewan {
    

        private String ras;
        private String habitat;

        public Kucing(String ras, String habitat) {
            this.ras = ras;
            this.habitat = habitat;
        }
    
     
    @Override
        public boolean equals(Object obj) {
            // TODO Auto-generated method stub
            return super.equals(obj);
        }


        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return super.toString();
        }


    public Kucing() {
        //super(); // akan tetap memanggil constructor dari parent Class
        System.out.println("construct Kucing");
    }

    public void makan() { // overriding
        System.out.println("Kucing sedang makan..");
    }
    public void makan(String food) { // overloading
        System.out.println("Kucing makan " + food);
    }
}
