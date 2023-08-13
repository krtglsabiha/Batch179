package QuestionBank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SelfStudy {
    public static void main(String[] args) {



        /*System.out.println("Hello\nSabiha ") ;
------------------------
        int num1 =74;
        int num2 = 36;

        System.out.println(num1+num2);
----------------
        int num1=50;
        int num2=3;
        System.out.println(num1/num2);

        --------------

       int a=-5;
       int b=8;
       int c=6;
        System.out.println(a+b*c);
        System.out.println((55+9) %9);
        System.out.println(20+(-3)*5/8);
        System.out.println(5+15/3*2-8%3);

        ----------------------

        Scanner input=new Scanner(System.in);
        System.out.println("enter first number");
        int num=input.nextInt();

        System.out.println("enter second number");
        int num1=input.nextInt();

        System.out.println(num +"x" + num1+ " = " +num*num1);

        ------------------------

        Scanner input = new Scanner(System.in);
        System.out.println("enter first num");
        int num=input.nextInt();

        System.out.println("enter second num");
        int num1=input.nextInt();

        System.out.println(num+ "+" + num1 + " = " + (num+num1) );
        System.out.println(num+ " - " + num1 + " = " + (num-num1));
        System.out.println(num + " x " + num1 + " = " + (num*num1));
        System.out.println(num+ " / " + num1 + " = " + (num/num1));
        System.out.println(num + " mod " + num1 + " = " +(num % num1));

        ------------------

        Scanner input =new Scanner(System.in);
        System.out.println("enter number");

        int num=input.nextInt();
        for (int i=0;i<10;i++ ) {
            System.out.println(num+"x"+(i+1) + " = " + (num *(i+1)));
        }

        //example: type code to print even integers from 5 to 16 on the console

       for (int i=5; i<17;i++){
           if(i%2==0){
               System.out.println(i+ " ");
           }
       }


        // homework : type code to print integers from 15 to 6 on the console
        for(int i=15;i>5;i--) {
            System.out.println(i + " ");
        }



        // example : type code to print integers from 5 to 16 expect 7 on the console
        for (int i=5; i<17;i++){
            if(i!=7){
                System.out.println(i + " ");
            }
        }

        //example: print String characters one by one on the console. If you see "x" stop printing
        // "i like extra effort" i like e

        String s="i like extra effort";
       for(int i=0;i<=s.length();i++){
           if(s.charAt(i)=='x'){
               break;
           }
           System.out.print(s.charAt(i));
       }
       /*

        for (int i = 1; i <= 6; i++) {
            System.out.print(i + " ");
            i++;
        }


        for ( int j = 0; j <=10; j=j+3 ){
            System.out.print( j + " " );
        }


        for ( char i = 'f';  i>'a';  i--){
            System.out.print(i + " " );
            i--;
        }


        int y = 1;
        for (int i = 0; i<4; i++) {
            y += i;   //==> y=i+y

        }
        System.out.println(y);


        double shirtPrice = 12.99;
        double hatPrice = 23.99;
        double shoesPrice = 15.99;

        System.out.println("total price: " + (shirtPrice + hatPrice + shoesPrice));


        float x = 15.99F;
        long y = 13L;
        int z = 12; System.out.println("Multiplication: " + x*y*z);


        int principal = 10000, rate = 6, numberOfYear = 3;
        int simpleInterest = principal * rate * numberOfYear/100;
        System.out.println("The simple interest is " + simpleInterest);*/

   /*     //Collections
        //Write a Java program to create an array list, add some colors (strings) and print out the collection.

        List<String>list_Strings=new ArrayList<>();
        list_Strings.add("Blue");
        list_Strings.add("yellow");
        list_Strings.add("green");
        list_Strings.add("Black");
        System.out.println(list_Strings);

        // Write a Java program to iterate through all elements in an array list.
        List<String>list=new ArrayList<>();
        list.add("purple");
        list.add("brown");
        list.add("pink");

        for (String w:list ){
            System.out.println(w);
        }
        // Write a Java program to insert an element into the array list at the first position.
        list.add(0,"black");
        list.add(1,"white");
        System.out.println(list);

        // Write a Java program to retrieve an element (at a specified index) from a given array list.

       String element= list_Strings.get(3);
        System.out.println(element);

        //Write a Java program to update an array element by the given element.
        list.add("yellow");

        list.set(4,"white");
        System.out.println(list);

        //Write a Java program to remove the third element from an array list.
        list.remove(3);
        System.out.println(list);

        //Write a Java program to search for an element in an array list.
        if (list.contains("pink")){
            System.out.println("found element");
        }else {
            System.out.println("no such element");
        }

        //Write a Java program to sort a given array list.
        Collections.sort(list);
        System.out.println(list);

        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        String surname=input.nextLine();
        String ccn=input.nextLine();



        name= name.toUpperCase();
        surname=surname.toUpperCase();

        for (int i=1;i<name.length();i++){
            name=name.replace(name.charAt(i),'*');
        }
        for (int i=1;i<surname.length();i++){
            surname=surname.replace(surname.charAt(i),'*');
        }
        String ccnLastDigits = ccn.substring(12);
        ccn = ccn.replaceAll("[0-9]", "*");
        System.out.println("Name : " +name + " " +surname);
        System.out.println("CCN : "+ccn +  ccnLastDigits);



        //Write a Java program to compute and print sum of two given numbers (more than or equal to zero).
        //
        //If given integers or the sum have more than 10 digits, print "overflow".
        //
        //EXAMPLE:
        //
        //INPUT      :
        //Input two integers:
        //
        //25
        //
        //46
        //
        //OUTPUT :
        //
        //Sum of the numbers: 71

        Scanner scan = new Scanner(System.in);
        //System.out.println("Please enter two integer");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int sum = num1 + num2 ;
        if((sum) >= 1000000000 ) {
            System.out.println("Overflow");
        }else {
            System.out.println("Sum of the numbers: " + (num1+num2));
        }



        //Write a switch statement that tests the value of the char variable response and performs the following actions:
        //
        //if response is a, the message Your request is being processed is printed
        //
        //if response is b, the message Thank you anyway for your consideration is printed
        //
        //if response is c, the message Sorry, no help is currently available is printed for any other value of response, the message "Invalid entry, please try again!" is printed
        //
        //Create Scanner object.
        //
        //Use charAt() method, in order to get the char value at the specified index.
        //
        //Example:
        //
        //-Display prompt: "Enter command:"
        //
        //input: a
        //-Display prompt:
        // "Your request is being processed"

        Scanner scan = new Scanner(System.in);
        String input=scan.nextLine();
        switch (input){

            case "a":
                System.out.println("Your request is being processed is printed");
                break;
            case "b":
                System.out.println("Thank you anyway for your consideration is printed");
                break;
            case "c":
                System.out.println("Sorry, no help is currently available ");
                break;
            default:
                System.out.println("Invalid entry, please try again!");
        }

        //Write a Java program to find the number of days in a month.(Use Switch Case)

        Scanner input = new Scanner(System.in);

        int number_Of_DaysInMonth = 0;
        String MonthOfName = "Unknown";

        System.out.print("Input a month number: ");
        int month = input.nextInt();

        System.out.print("Input a year: ");
        int year = input.nextInt();

        switch (month) {
            case 1:
                MonthOfName = "January";
                number_Of_DaysInMonth = 31;
                break;
            case 2:
                MonthOfName = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    number_Of_DaysInMonth = 29;
                } else {
                    number_Of_DaysInMonth = 28;
                }
                break;
            case 3:
                MonthOfName = "March";
                number_Of_DaysInMonth = 31;
                break;
            case 4:
                MonthOfName = "April";
                number_Of_DaysInMonth = 30;
                break;
            case 5:
                MonthOfName = "May";
                number_Of_DaysInMonth = 31;
                break;
            case 6:
                MonthOfName = "June";
                number_Of_DaysInMonth = 30;
                break;
            case 7:
                MonthOfName = "July";
                number_Of_DaysInMonth = 31;
                break;
            case 8:
                MonthOfName = "August";
                number_Of_DaysInMonth = 31;
                break;
            case 9:
                MonthOfName = "September";
                number_Of_DaysInMonth = 30;
                break;
            case 10:
                MonthOfName = "October";
                number_Of_DaysInMonth = 31;
                break;
            case 11:
                MonthOfName = "November";
                number_Of_DaysInMonth = 30;
                break;
            case 12:
                MonthOfName = "December";
                number_Of_DaysInMonth = 31;
        }
        System.out.print(MonthOfName + " " + year + " has " + number_Of_DaysInMonth + " days\n");


        Scanner scan = new Scanner(System.in);
        String name=scan.nextLine();
        int  numOfLetters=  name.replaceAll("[^A-Za-z]", " ").length();
        System.out.println(numOfLetters);
        if(name.indexOf()){
            System.out.println("String has duplicate characters");

        }

*/

        Scanner input=new Scanner(System.in);

        double weight= input.nextDouble();

        double height= input.nextDouble();

        double mass=weight/(height*height);

        System.out.println("Your BMI is : "+mass);
        if (mass<18.5){
            System.out.println("You re weak");
        } else if (mass>=18.5&& mass <25) {
            System.out.println("Your weight is ideal");
        } else if (mass>=25&&mass<30) {
            System.out.println("You re fat");
        }else{
            System.out.println("obese");
        }
    }

}