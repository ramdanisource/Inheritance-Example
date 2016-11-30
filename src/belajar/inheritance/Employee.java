package belajar.inheritance;

/**
 * Created by ramdani on 11/24/16.
 */
public class Employee {
    int salary = 5000;
}

class Programmer extends Employee{

    int bonus = 2000;

    public int totalSalary() {
        return bonus+salary;
    }

    public static void main(String[] arg){

        //instance subclass : Programmer
        Programmer programmer = new Programmer();

        //mengambil value dari variable salary yang berada di superclass : Employee
        System.out.println("Salary of programmer :"+programmer.salary);

        //mengambil total salary + bonus dari method totalSalary
        System.out.println("Salary with bonus :"+programmer.totalSalary());

    }
}

