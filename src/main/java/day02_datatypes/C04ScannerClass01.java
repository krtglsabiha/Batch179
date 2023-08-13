package day02_datatypes;

 import java.util.Scanner;


public class C04ScannerClass01 {
    public static void main(String[] args) {


        //scanner class: kullandigi datayi kullanicidan alir

        //datayi kullanicidan aldiktan sonra 3 adimi yapar
        //1. adim: scanner class objeyi olusturmak
        Scanner input = new Scanner(System.in);


        //2.adim: kullaniciya mesaj vermek
        System.out.println("Enter your age ...");


        //3.adim: kullanicinin yazdigi mesaji kullanmak
        int userAge = input.nextInt();


        System.out.println(userAge);



    }
}
