package day18oop_static_keyword;


       /*
      1) Child  -  Parent
       Class   -    Interface  ----->implements
       Class   -    Class      ----->extends
       Interface -  Interface  ---->extends
       Interface   - Class   ----->This is not possible because a class cannot be the "parent" of interface


       2)What is the difference between "abstract class" and "interface"?

       a)Methods: Abstract class can have "abstract" and "concrete" methods.
                 Interfaces can have just "abstract" methods.
                 Note: By using "static" or "default" keywords we can create "concrete" methods in an interface

                 What is the different between "static methods" or "default methods"?
                 "static methods" are static that is why we can access them by using interface name.
                 "default methods" need object to be accessed.

                 All methods in an interface are public, but methods in an abstract class can use any access modifier

        b)Variables: All variables in an interface are public, static and final, but an abstract class can have any type of variable

        c)Interface:Java doesn't support multiple inheritance through classes, but Java supports multiple inheritance through interface

        d)Usage: When we need multiple parents contains the mandatory functionalities we use interfaces.
                 If a single parent is enough with mandatory and optional functionalities we use abstract classes.

                 for example , you need browser to use in your application.Every browser  has common  mandatory functionalities  like get() method.
                 We put functionalities into a "Browser" then make "Chrome" ,"Safari", etc. classes child of Browser
                 interface so get() method will be mandatory for the "Chrome" ,"Safari", etc. classes



        */

public interface C01Animal extends C00Creature {

   int eat(String foodName);

   char NAME ='A';//public, static, final

}
