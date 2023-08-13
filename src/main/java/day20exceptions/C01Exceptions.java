package day20exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


       /*
         1)FileNotFoundException: Java throws FileNotFoundException, if the "path is wrong" ot the file "does not exist"
         2)IOException: Java throws IOException for all issues related with "Input and Output"
         3)IOException is the parent of FileNotFoundException
         4)IOException and FileNotFoundException are "Compile Time Exception" because Exceptions occur when we type the code,
            I mean before clicking on the run button.
         5)We may need some codes to be executed under every condition(like cutting connection with the database),
              to do this type the code in "finally block"
         6) "try block" cannot be used alone.
                    "try block" can be used like "try block + single catch" or "try block + multiple catch"
                    "try block + single catch + finally" or "try block + multiple catch + finally" or "try block + finally"
                    */


public class C01Exceptions {

    public static void main(String[] args) {
        readTheTextFromFile();

    }


   //Create a method to read the text from a file

    public static void readTheTextFromFile(){
        try {
            //To access the file
            FileInputStream fis=new FileInputStream("src/main/java/day20exceptions/MyFile.txt");

            //To read the file
            int k=0;
            while ((k= fis.read())!=-1){
                System.out.println((char)k);
            }




        } catch (FileNotFoundException e) {
            System.out.println("The path is wrong or the file is deleted");
        } catch (IOException e) {
            System.out.println("The text in the file cannot be read!");
        }finally {
            System.out.println("Cut the connection from DB");
        }


    }
}
