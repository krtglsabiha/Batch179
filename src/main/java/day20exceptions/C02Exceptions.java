package day20exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


     /*
        1)"throw" is used inside the method body, "throws" is used in the same line with the method name
        2)"throw" can be used multiple times in a method body, but "throws" can be used just once in a method
        3)"throw" is for throwing exceptions for some specific conditions.
          "throws" is for throwing exceptions, it is used for Compile Time Exceptions mostly...
        4)"throw" uses Exception Object, "throws" uses Exception Class Name
        ( "throw" is used after creating object from the Exception class, while "throws" can be used directly from the class)
        5)After "throw" you can use just a single Exception Object, after "throws" you can use many Exception Class Names.
     */



public class C02Exceptions {
    public static void main(String[] args) {
        printAge(35);
        printAge(-57);

    }

    //create a method that prints user's age

    public static void printAge(int age){
        if (age>=0){

        }else {
            throw new IllegalArgumentException("Age cannot be negative");
        }

    }

//Create a method to read the text from a file

    public static void readTheTextFromFile() throws IOException {

            //To access the file
            FileInputStream fis=new FileInputStream("src/main/java/day20exceptions/MyFile.txt");

            //To read the file
            int k=0;
            while ((k= fis.read())!=-1){
                System.out.println((char)k);
            }

    }
}
