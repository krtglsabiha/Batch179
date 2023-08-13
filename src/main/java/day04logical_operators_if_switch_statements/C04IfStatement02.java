package day04logical_operators_if_switch_statements;

import java.util.Scanner;

public class C04IfStatement02 {
    public static void main(String[] args) {

        // example: ask user to enter initial of the day names ,then print all possible day names on the console
        // s===> sunday,saturday     t====> tuesday, thursday

        Scanner input = new Scanner(System.in);
        System.out.println("enter the initial of the day name ....");

        char dayNameInitial=input.next().charAt(0); //kullanicidan char isteyeceksek  input.next().charAt(0);

        if (dayNameInitial=='S' || dayNameInitial=='s'){
            System.out.println(" saturday,sunday");

        }else if(dayNameInitial=='T' || dayNameInitial=='t'){
            System.out.println("tuesday,thursday");

        } else if (dayNameInitial=='W' || dayNameInitial=='w') {
            System.out.println("wednesday");

        } else if (dayNameInitial=='F' || dayNameInitial=='f') {
            System.out.println("Friday");

        } else if (dayNameInitial=='M' || dayNameInitial=='m') {
            System.out.println("Monday");
            
        } else{
            System.out.println("invalid day name initial");
        }


    }
}
