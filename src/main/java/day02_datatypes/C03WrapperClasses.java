package day02_datatypes;

public class C03WrapperClasses {

    public static void main(String[] args) {

        //wrapper classes: java  yeni bir data structer olusturdugu zaman primitive data type dan yararli methods ekliyor
        //java her primitive data type cin wrapper class  olusturur

        /*  primitive     wrapper class
             byte    ==> Byte
             short   ==> Short
             int     ==> Integer
             long    ==> Long
             float   ==> Float
             double  ==> Double
             boolean ==> Boolean
             char    ==> Character
         */

        //wrapper class has many useful methods
        Integer age=35;

        //primitive it does not have any method
        int weight =25;


        // eger wrapper class name kullanirsan daha cok methods kullanabilirsin

        System.out.println(Integer.MIN_VALUE); //-2147483648

        System.out.println(Integer.MAX_VALUE ); //2147483647

        // find the min and max value of short data type
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

        // How to convert primitive to wrapper  ==> Autoboxing

        char ch = '?';

        Character chWrapper = ch; // Autoboxing


        // how to convert wrapper to primitive ==> unboxing

        Boolean b1 = true;

        boolean b2 = b1; //unboxing










    }

}
