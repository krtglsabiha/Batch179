package day04logical_operators_if_switch_statements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C08SwitchStatement {
    public static void main(String[] args) {

        //example: type code gives you the name of the day after giving number of the day
        //     1==>sunday  2==>monday    7==>saturday

        //1.way
        Scanner input=new Scanner(System.in);
        System.out.println("enter day  number to see day name");

        byte dayNum= input.nextByte();

        if(dayNum==1){
            System.out.println("sunday");

        } else if (dayNum==2) {
            System.out.println("monday");

        }else if (dayNum==3) {
            System.out.println("tuesday");

        }else if (dayNum==4) {
            System.out.println("wednesday");

        }else if (dayNum==5) {
            System.out.println("thursday");

        }else if (dayNum==6) {
            System.out.println("friday");

        }else if (dayNum==7) {
            System.out.println("saturday");

        }else {
            System.out.println("invalid day number");
        }


        // 2. way

        switch (dayNum) {

            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("tuesday");
                break;
            case 4:
                System.out.println("wednesday");
                break;
            case 5:
                System.out.println("thursday");
                break;
            case 6:
                System.out.println("friday");
                break;
            case 7:
                System.out.println("saturday");
                break;
            default:
                System.out.println("invalid day number");
                break; // default is last part in switch statement ,that is why using "break" after default is optional
        }

        // note: you can use int,byte,char,string,short in switch statement
        // float , double,boolean,long cannot be used in switch statement
    }
}
