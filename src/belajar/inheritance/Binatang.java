package belajar.inheritance;

/**
 * Created by ramdani on 11/24/16.
 */
public class Binatang {

    String jenis;
    String pemakan;
    int jmlKaki;

    public void makan(){
        System.out.println("sedang makan");
    }

    public void bersuara(){
        System.out.println("sssttttttt");
    }

    public int getJmlKaki() {
        return jmlKaki;
    }
}
