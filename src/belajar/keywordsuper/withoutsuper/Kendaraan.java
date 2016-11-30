package belajar.keywordsuper.withoutsuper;

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
        return speed;
    }

    public static void main(String[] args){

        Sepeda sepeda = new Sepeda();
        System.out.println("Kecepatan : "+sepeda.getSpeed());

    }
}