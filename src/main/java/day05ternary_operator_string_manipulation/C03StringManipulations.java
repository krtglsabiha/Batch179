package day05ternary_operator_string_manipulation;

public class C03StringManipulations {

    public static void main(String[] args) {


        //Example 1: Count the alphabetical characters in a given String
     // Tom12 Hanks!... ==> 8
        // 1:remove non-alphabetical characters 2:count the remaining characters

        //  non-alphabetical characters are a group of data
        // to work with a group of data we use " regular expressions"(regex)

        /*
        1: upper case letters: [A-Z]
        2: Lower case letters : [a-z ]
        3: all letters : [A-Za-z]
        4: All digits : [0-9]
        5:letters from m to v : [m-v ]
        6: regex for a,b,e,d,g,z: [abedgz]

        a)All characters different from uppercase letters : [^A-Z]
        b)All characters different from lowercase letters : [^a-z]
        c)All characters different from all letters : [^A-Za-z]
        d)All characters different from digits : [^0-9 ]
        e)all symbols (different from letters and digits) : [^A-Za-z0-9]

        f)All punctuation marks : \\p{Punct}
         */

        String s1 = "Tom12? Hanks!...";
        int numOfChar = s1.replaceAll("[^A-Za-z]", "").length();
        System.out.println(numOfChar);
        //replaceAll() ==> It changes a group of characters to another character
        //length() ==> Counts the number of characters in String

        // example: type  code to change all digits to "*" in a giving password
        //  password (pwd) : a12b32c! ==> a**b**c

        String pwd = " a12b32c";
        String hiddenPwd =pwd.replaceAll("[0-9]", "*");

        System.out.println("hiddenPwd = " + hiddenPwd);


        //Example 3: Get the initials from full name. (Middle name is out of scope)
        //   Tom Hanks ==> TH   -  tom hanks ==> TH  -  "   tOM HankS   " ==> TH

        String name = " tOM HankS ";

        // tree methods ==> removes the extra spaces from the beginning and from the end of a String value

        System.out.println("name= " +name);

       String firstInitial= name.trim().substring(0, 1).toUpperCase();        //tOM HankS
        System.out.println("newName = " + firstInitial);

        String lastInitial= name.trim().split(" ") [1].substring(0,1).toUpperCase();     //tOM HankS
        System.out.println("lastInitial = " + lastInitial);

        //substring (starting index, ending index) ==> it gets a part of string
        // starting index is inclusive
        //ending index is exclusive

        //toUpperCase ( ) ==> changes all alphabetical characters to upper case
        //split () ==> splits a String from the given  character and indexes every string as a separate part.










    }
}
