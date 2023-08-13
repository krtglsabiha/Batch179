package day04logical_operators_if_switch_statements;

import java.util.Scanner;

public class C09SwitchStatement {
    public static void main(String[] args) {

        //example: ask user to enter month name then print the mont names from the given month name to the last month name
        //      october ==> october, november,december

        Scanner input=new Scanner(System.in);
        System.out.println("enter month name");

        String monthName=input.next().toLowerCase();
        switch (monthName){
            case "january":
                System.out.println("January");
            case "february":
                System.out.println("February");
            case "march":
                System.out.println("March");
            case "april":
                System.out.println("April");
            case "may":
                System.out.println("May");
            case "june":
                System.out.println("June");
            case "july":
                System.out.println("July");
            case "august":
                System.out.println("August");
            case "september":
                System.out.println("September");
            case "october":
                System.out.println("October");
            case "november":
                System.out.println("November");
            case "december":
                System.out.println("December");
                 break;
            default:
                System.out.println("invalid month name");
        }


    }
}
