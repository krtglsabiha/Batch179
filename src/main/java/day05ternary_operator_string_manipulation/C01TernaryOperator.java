package day05ternary_operator_string_manipulation;

import java.util.Scanner;

public class C01TernaryOperator {
    public static void main(String[] args) {

        //Example 1: Type code to check if an integer is even or odd

        // condition ? code1 :  code2

        int a= -23;
        String result1= a%2==0   ? "even"  : "odd";
        System.out.println(result1);

        // example 2: Type code to check if an integer has 3 digits or not

        int b = 435;

         String result2 = b>99 && b<1000 ? b+ " has 3 digits" : b+ " does not 3 digit";

        System.out.println(result2);

        //Example 3: Type code to calculate absolute value of a number
        //  5 ==> 5     0 ==> 0     -3 ==> -3*-1=3

        Scanner input = new Scanner(System.in);
        System.out.println("please enter number");
        double num= input.nextDouble();

        double result3= num<0 ? -1*num : num;
        System.out.println(result3);


        //Example 4: Type code to find the multiplication of two integers if the signs are same.
        // Give a message like "I do not know how to multiply" if the signs are different.
        //5 and 4 ==> 5*4     -3 and -2 ==>-3*-2    -4 and 3==>"I do not know how to multiply"

        int d=-5;
        int e=4;
      Object result4= ( d<0 && e<0) || (d>0 && e>0) ? d*e : "I do not know how to multiply";

        System.out.println(result4);












    }
}
