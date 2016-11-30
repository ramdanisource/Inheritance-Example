package belajar.keywordsuper.withsuper;

/**
 * Created by ramdani on 11/24/16.
 */
public class Kendaraan {
    int speed = 50;
}

class Sepeda extends Kendaraan{

    int speed = 100;

    public Sepeda() {

        System.out.println("== SEPEDA ==");
    }

    public int getSpeed() {

        /**
         * akan mengambil value dari variable speed yang berada di constructor class
         * dengan menggunakan keywordsuper constructor
         */

        return super.speed;

    }

    public static void main(String[] args){

        Sepeda sepeda = new Sepeda();
        System.out.println("Kecepatan : "+sepeda.getSpeed());

    }

}
