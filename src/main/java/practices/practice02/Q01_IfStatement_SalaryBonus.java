package practices.practice02;

import java.util.Scanner;

public class Q01_IfStatement_SalaryBonus {

    /*
    A company decided to give bonus of 5% of salary to the employee if his/her year of
    service is 5 and more than 5 years.
    Ask user for their salary and year of service and print the net bonus amount.
    If employee can not get bonus, print how many years he/she should work more.
    EXAMPLE:
    INPUT  :   Year     => 4 years service
               Salary   => 4000
    OUTPUT:   You need to work 1 more year(s) to get bonus
     */

    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number of years of your job");
        int year= scan.nextInt();

        System.out.println("enter your salary");
        double salary= scan.nextDouble();

        if (year>=5){
            //calculate the bonus
           double bonus= salary*5/100;
            System.out.println("bonus = " + bonus);
           double newSalary= salary+bonus;
            System.out.println("your new salary is = "+ newSalary);

        }else{
            System.out.println("you need to work  "+ (5-year)+ "  year(s) more to qualify for a bonus");
        }







    }



}
