package day03_scanner_concatenation;

public class C06Concatenation06 {
    public static void main(String[] args) {

        /*
        concatenation means string with each other or other data type

        to do concatenation we have 2 option
        1= use "+" sign -->it can be used with all data types
        2= we use cancat () method to join data just for string values.

        java follows math op.priority rules when we deal with addition,multiplication, division,subtraction
        for java when we are required to do math op. with a string label, we have to put the addition operation part
        inside paran.
        1 . once parantez ici
        2. carpma bolme
        3. toplama cikarma

        /*

         */


        String name = "Sabiha";
        String lastName = "Cuvoglu";

        int i = 12;
        int k = 5;
        char c = 'A';

        System.out.println(name + "  " + lastName);

        System.out.println(name.concat(" ").concat(lastName));

        System.out.println(name + i + k);

        System.out.println(name + (i + k));

        System.out.println(i + k + name);

        System.out.println(name + i * k);

    }
}