package day07loops;

public class C01ForLoops {
    public static void main(String[] args) {

        // example: type code to print even integers from 5 to 16 on the console

      for(int i=5; i<17; i++){
            if(i%2==0){
                System.out.println(i + " ");
            }
        }
        // homework : type code to print integers from 15 to 6 on the console

        System.out.println();
        // example : type code to print integers from 5 to 16 expect 7 on the console

        //1.yol
        for (int i =5; i<17; i++){
            if (i!=7){
                System.out.print(i+ " ");

            }
        }
        System.out.println( );
        //2.yol
        for (int i =5; i<17; i++){
            if ( i==7) {
                continue; // continue keyword is used to skip same value in a loop
                          //"continue" keyword takes you to "increment/decrement" part in the loop directly
            }
            System.out.print(i + " ");
        }

        System.out.println(
        );
        //example: print String characters one by one on the console. If you see "x" stop printing
        // "i like extra effort" i like e

        String s= "I like extra effort";

        for ( int i=0 ; i<= s.length();i++  ){

            if (s.charAt(i)=='x'){
                break; // "break" keyword stops looping and takes us to the outside of the loop
            }
            System.out.print(s.charAt(i));
        }
        // note: the last index of String "s"  is " s.length()-1"




    }
}
