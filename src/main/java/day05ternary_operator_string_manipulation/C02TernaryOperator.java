package day05ternary_operator_string_manipulation;

public class C02TernaryOperator {

    public static void main(String[] args) {

        //Example 5: Type code to check if an integer is odd and if it is even it should be divisible 3.
         // 7 ==> Odd    12 ==> Even ==> divisible by 3    14 ==> Even ==> Not divisible by 3

        int a= 12;
        String result= a%2!=0 ? "odd"  :  (a%3==0) ? " even and divisible by 3" : "even but not divisible by 3";
        System.out.println(result);

        //(INTERVIEW QUESTION) Example 6: Type java code by using nested ternary.
        //Write a program to check if a year is leap year or not.
        //If the year is divisible by 100 then it must be divisible by 400. (2000+, 1800-)
        //If a year is not divisible by 100 then it must be divisible by 4. (1996+, 2001-)

       int year = 2001;
      String result1=  (year%100==0)   ?  (year%400==0 ) ? "leap " : " not leap"  :  (year%4==0 ) ? "leap" : "not leap";
        System.out.println(result1);










    }
}
