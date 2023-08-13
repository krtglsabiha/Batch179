package day03_scanner_concatenation;
import java.util.Scanner;
public class C02ScannerClass02 {
    public static void main(String[] args) {


        //exp. kullaniciya sor lenght of a rectangle then calculate primeter and area
        // 1 scanner class object olustur

        Scanner input = new Scanner(System.in);

        //2.kullaniciya mesaj ver

        System.out.println("enter the width and lenght of a rectangle ...");


        //3. proper contaner olustur

       double width= input.nextDouble();

      double length=  input.nextDouble();

        System.out.println( "the primeter is : " + (2 *  width + 2 * length));

        System.out.println("the area is :" + (width*length));



    }
}
