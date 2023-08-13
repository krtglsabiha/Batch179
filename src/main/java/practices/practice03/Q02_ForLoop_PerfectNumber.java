package practices.practice03;

import java.util.Scanner;

public class Q02_ForLoop_PerfectNumber {

    public static void main(String[] args) {

        /*
        Type code to ask user to enter an integer and check if it is 'Perfect Number' or not."
        A perfect number is a positive integer that is equal to the sum of all its proper divisors.
        6 = 1+2+3, 28 = 1 + 2 + 4 + 7 + 14, (496 and 8128)
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("please enter a number ");
        int number=scan.nextInt();

        int sum=0;

        for (int i = 1; i <number ; i++) {
            if (number%i ==0){
                sum += i;
            }


        }
        //System.out.println(sum);
        //to see wether its perfect number or not
        if (sum ==number){
            System.out.println(number + " is a perfect number");
        }
        System.out.println(number+ " is not a perfect number");


    }
}
