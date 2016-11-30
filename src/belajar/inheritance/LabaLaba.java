package belajar.inheritance;

/**
 * Created by ramdani on 11/24/16.
 */
public class LabaLaba extends Binatang {

    public LabaLaba() {
        jmlKaki = 4;
    }

    public void bersuara(){
        System.out.println("silent");

    }

    public void bernyanyi(){

    }


    public static void main (String[] args){
        Reptil b = new Reptil();

        LabaLaba labaLaba = new LabaLaba();
        labaLaba.makan();
        labaLaba.bersuara();

        System.out.println("jumlah kaki "+labaLaba.jmlKaki);
        System.out.println("cek turunan "+(labaLaba instanceof Binatang));
        System.out.println("cek turunan "+(b instanceof Binatang));

    }
}
