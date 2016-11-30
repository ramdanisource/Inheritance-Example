package belajar.keywordsuper.method;

/**
 * Created by ramdani on 11/24/16.
 */
public class Person {

    public void message(){
        System.out.println("selamat datang :)");
    }

}

class Student extends Person{


    public void message(){
        System.out.println("selamat datang :) di SMK AS");
    }

    public void display(){

        /*
        * memanggil method message() dari sub class : Student
        * jika method message tidak terdapat pada sub class : Student ,
        * maka akan mengacu/merujuk pada method yang berada pada super class : Person
        * tanpa harus menggunakan keyword super
         */
        message();

        /*
        * memanggil method message() dari super class : Person
        * menggunakan keyword super
         */
        super.message();
    }

    public static void main(String[] args){
        Student student = new Student();
        student.display();
    }

}
