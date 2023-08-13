package day04logical_operators_if_switch_statements;

import java.util.Scanner;

public class C03IfStatement01 {

    public static void main(String[] args) {

        // if it rains ,I will cancel the picnic    === it rains condition   == cancel picnic  action

        // eger condition yanlissa herhangi birsey yazdirmaz


        int a=5;
        int b=2;
        // "if statement"  execute yaparken bazi condition kullanir
        //eger condition true ise code execute olur degilse birsey yazdirmaz

        if (a%b==2) {
            System.out.println("activated");

        }

        //example 1: type code to print " even" for even integers an "odd" for odd integers
        // get the numbers from user

        Scanner input = new Scanner(System.in);
        System.out.println(" enter a number to check  if it is even or odd");

        //way1
        int x = input.nextInt();
        if( x%2==0) {
            System.out.println("even");  // cift sayi
        }


        if (x%2!=0) {
            System.out.println("odd"); // tek sayi

        }

        //way2:

        // else daha kullanisli
        if( x%2==0) {
            System.out.println("even");
        }else{
            System.out.println("odd");
        }


        //ex2: type code to check if a number negative, positive or neutral

        System.out.println("enter a number to check if it is positive or neutral");

        double y = input.nextDouble();
        //1. yol

        if (y>0){
            System.out.println("positive");
        }
        if (y==0){
            System.out.println("neutral");

        }
        if (y<0){
            System.out.println("negative");

        }
        //2.way
        if(y>0){
            System.out.println("positive");

        } else if (y==0) {
            System.out.println("neutral");

        } else {
            System.out.println("negative");

        }


    }
}
