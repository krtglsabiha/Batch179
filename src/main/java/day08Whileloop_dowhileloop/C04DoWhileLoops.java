package day08Whileloop_dowhileloop;

import java.util.Scanner;

public class C04DoWhileLoops {
    public static void main(String[] args) {

        /*
        Ask user to enter an integer.
              If the integer is less than 100, tell user "Won!"
              Otherwise, tell user "Lost!"
         */
        Scanner input = new Scanner(System.in);
        int i = 0;


        do {
            System.out.println("please enter an integer");
            i=input.nextInt();

            if (i<100){
                System.out.println("won");
            }
        }while (i<100);
        System.out.println("lost");

        //2.way:
        int k=0;
        do {
            System.out.println("enter an integer");
            k = input.nextInt();
            if (k > 99) {
                System.out.println("lost");
            } else {
                System.out.println("won");
            }
        }while (true);










    }
}
