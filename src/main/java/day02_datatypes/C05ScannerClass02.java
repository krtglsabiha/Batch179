package day02_datatypes;

import java.util.Scanner;

public class C05ScannerClass02 {
    public static void main(String[] args) {

        //kullanicidan ismini almak

        //1. adim: class object olustur

        Scanner input = new Scanner(System.in);

        //2. adim: kullaniciya mesaj ver

        System.out.println("enter your name please ...");

        //3.adim: datayi al kullanicidan

        String userName = input.nextLine();
        System.out.println(userName);

        System.out.println("enter your parent`s name ..... ");

        String parentsFirstName= input.next();

        System.out.println(parentsFirstName);
    }
}
