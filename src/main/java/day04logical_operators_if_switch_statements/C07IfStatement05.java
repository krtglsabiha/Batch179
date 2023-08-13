package day04logical_operators_if_switch_statements;

import java.util.Scanner;

public class C07IfStatement05 {
    public static void main(String[] args) {

        // nested if statement
        //Example 6: If a number is even then check if it is divisible by 3 or not. If it is divisible by 3 the output will be
//"Perfect even number" otherwise, the output will be "Good even number."
//If the number is odd then check if it is divisible by 3 or not. If it is divisible by 3 the output will be
//"Perfect odd number" otherwise, the output will be "Good odd number."

        Scanner input =new Scanner(System.in);
        System.out.println("enter an integer");

        int num=input.nextInt();

        if (num%2==0){
            if(num%3==0){
                System.out.println("perfect even number");

        }else {
                System.out.println("good even number");
            }
        }else{
            if (num%3==0){
                System.out.println("perfect odd number");

            }else {
                System.out.println("good odd number");
            }

        }

        //note : nested structures need more time to be executed
        //we don't prefer to use nested structures in java
        // if sth needs more time to be executed, it is called "it has time complexity"



    }
}
