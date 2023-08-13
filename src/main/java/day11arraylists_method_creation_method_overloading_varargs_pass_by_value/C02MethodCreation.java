package day11arraylists_method_creation_method_overloading_varargs_pass_by_value;

public class C02MethodCreation {

    public static void main(String[] args) {


        //method call: Using a method in "main" method is called "method call"
     int r1= add (3,5);//Non-static  method 'add (int,int)' cannot be referenced from a static context
        System.out.println(r1);//8

        double result2=multiplyThreeNumbers(1.2,4,5.31);
        System.out.println(result2); //25.487999999999996


       String result3= join (" ayse "," anna "); //ayse anna
        System.out.println(result3);







    }
    public static int  add(int a,int b){

        return a+b;
    }
    //create a method to multiply 3 numbers

    public static double multiplyThreeNumbers(double a, double b, double c){

        return a*b*c;
    }
    //create a method joins 2 strings

    public static String join(String a, String b) {
        return a.concat(b);
    }

    //Note: Variables used in "method creation" are called "Parameters"
    //      Actual values used in method call are called "Arguments"
}
