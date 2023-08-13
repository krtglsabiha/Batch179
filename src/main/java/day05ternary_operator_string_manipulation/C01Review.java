package day05ternary_operator_string_manipulation;

public class C01Review {
    public static void main(String[] args) {

        //Example 1: Type code to check if an integer is even or odd

        // condition ? code1 :  code2

        int num =12;
        String result = num%2==0 ? "even" :"odd";
        System.out.println(result);


        //Example 5: Type code to check if an integer is odd and if it is even it should be divisible 3.
        // 7 ==> Odd    12 ==> Even ==> divisible by 3    14 ==> Even ==> Not divisible by 3

      int a=9876;
       String result1= (a%2!=0) ? "odd" : (a%3==0) ?"even and divisible by 3" : "even but not divisible by 3";

        System.out.println(result1);


        // example 2: Type code to check if an integer has 3 digits or not

        int b=263;
        String result2= (b>99 && b<1000)?"has 3 digits" : "not 3 digits";
        System.out.println(result2);

        //Example 3: Type code to calculate absolute value of a number
        //  5 ==> 5     0 ==> 0     -3 ==> -3*-1=3

        double d=9;
       double result3= (d<0) ? (d*-1) : d;
        System.out.println(result3);

        //Example 4: Type code to find the multiplication of two integers if the signs are same.
        // Give a message like "I do not know how to multiply" if the signs are different.
        //5 and 4 ==> 5*4     -3 and -2 ==>-3*-2    -4 and 3==>"I do not know how to multiply"

       int x=-8;
       int s=3;
       Object result4= (x<0&&s<0) || (x>0 && s>0) ? x*s :"i don't know how to multiply";
        System.out.println(result4);














    }
}
