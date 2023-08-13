package day03_scanner_concatenation;

import java.util.Scanner;

public class C04ScannerClass04 {
    public static void main(String[] args) {

        //ex:kullaniciya sor 5 basamakli sayi like 45678
        //print the sum of first two and last two digits
        //45678--> 45+78 = 123


        Scanner input = new Scanner(System.in);

        System.out.println("enter 5 digit number");

        int num = input.nextInt();

        int firstTwo= num/1000;

        System.out.println(firstTwo);

        //% -->modules operators:returns the remainder of division operation

        int lastTwo = num % 100;// the remainder will return

        System.out.println(lastTwo);

        System.out.println(" sum is: " + (firstTwo + lastTwo));











    }
}
