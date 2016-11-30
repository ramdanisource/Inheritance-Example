package belajar.keywordsuper.constructor;

/**
 * Created by ramdani on 11/24/16.
 */
public class Kendaraan {

    int speed =50;

    public Kendaraan() {
        System.out.println("== KENDARAAN SAYA ==");
    }
}

class Sepeda extends Kendaraan {

    int speed = 100;

    public Sepeda(int speed) {

        /*
        * akan mengambil statement yang berada di konstruktor superclass : Kendaraan
        * secara default tanpa menggunakan keyword super() constructor yang berada diparent class
        * akan terpanggil
         */
        //super();

        this.speed = speed;

        System.out.println("== SEPEDA ==");
    }

    public int getSpeed() {

        /**
         * akan mengambil value dari variable speed yang berada di constructor class
         * dengan menggunakan keyword super constructor
         */

        return speed;

    }


    public static void main(String[] args){

        Sepeda sepeda = new Sepeda(300);
        System.out.println("Kecepatan : "+sepeda.getSpeed());

    }

}