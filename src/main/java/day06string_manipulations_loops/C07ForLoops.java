package day06string_manipulations_loops;

public class C07ForLoops {
    public static void main(String[] args) {

        // example 1: type "hi" 5 times on the console...

        //1.yol  ==>  not recommend cunku yazmasi,degistirmesi, hata duzenlemesi ve cok tekrar var
        System.out.println("hi");
        System.out.println("hi");
        System.out.println("hi");
        System.out.println("hi");
        System.out.println("hi");

        //2.yol java created "Loops" to make "repeated actions " easy
        // there are loops in java:1) for loop 2)while-loop 3)do-while-loop 4)for-each-loop

        //1) FOR LOOP
        //   starting value      ending value          increment/ decrement
        for(  int i = 1       ;  i<6                 ;  i++                     ){

            System.out.println("hi");
        }

        //example: type code to print integer from to 10 to 3 in same line and a space between them
       // 10 9 8 7 6 5 4 3
        
        for( int i =10; i >2 ; i-- ){
            System.out.print(i + " ");

        }

    }


}