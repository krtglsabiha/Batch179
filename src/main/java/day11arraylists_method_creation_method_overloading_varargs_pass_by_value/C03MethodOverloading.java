package day11arraylists_method_creation_method_overloading_varargs_pass_by_value;

public class C03MethodOverloading {

    public static void main(String[] args) {

       add(3,5 );

       String s="java";
       s.substring(2);



    }

    //create a method adds two integers
    public static int  add (int a, int b ){
        return a+b;

    }

    // create a method adds three integers
     static int add (int a,int b,int c){
        return a+b+c;

    }
    // create a method adds one integer add one double

    protected static double add(int a,double b){
        return a+b;
    }

    //create a method adds one double add one integer

    private static double add (double a ,int b){
        return a+b;

    }
    //note1: you can create "many methods with the same name"in a calls, but method parameters must be different
    //note2: if you create many methods with the same name and the different parameters" in a class , it is called "Method Overloading"

    //note3:you need to make the parameters different in "method overloading"
    //to make them different you have 3 ways:
    //1)Change the number of parameters
    //2)change the data types of the parameters
    //3)change the places of the parameters, if the data type of the parameters are different

    // note4): you can use any access modifier in "method Overloading"
    //note5): "static" or "non-static" methods can be overloaded. being static or non-static doesn't affect "Method Overloading"
    //note6) "methods names" and "method parameters" are essentials in methods
    //note7) "methods names" and "method parameters" are called "Method Signature"
    // if you want to check two methods are same or not look at just "Method Names"and "method Parameters"
    //"Access Modifiers", "Return Types", "static keyword" cannot make methods different from each other.
    // note 7) java is an object-oriented programing language"(oop)
    //oop has 4 principals;1)inheritance
    // 2)polymorphism=method overloading + method overriding
    // 3)encapsulation   4) abstraction



}
