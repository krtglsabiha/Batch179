package day03_scanner_concatenation;

import java.util.Scanner;

public class C03ScannerClass03 {
    public static void main(String[] args) {


        //ex. ask user to enter i) full name ii)age iii)height iv) marital status
        //then print them on the consele in differernt lines with a label

        // scanner ob olustur
        Scanner input = new Scanner(System.in);

        System.out.println("enter full name ...  ");

        //propper meth

        String fullName = input.nextLine();

        System.out.println("enter age" );

        byte age = input.nextByte();

        System.out.println("enter your height");

        float height= input.nextFloat();

        System.out.println("are you married?");

        boolean isMarried = input.nextBoolean();

        System.out.println("your full name is : " + fullName);
        System.out.println("your age is :" +  age );
        System.out.println("your height is : " + height);
        System.out.println("is married? : " + isMarried);









    }
}
