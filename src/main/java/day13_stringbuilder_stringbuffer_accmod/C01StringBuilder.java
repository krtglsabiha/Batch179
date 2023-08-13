package day13_stringbuilder_stringbuffer_accmod;

public class C01StringBuilder {

    public static void main(String[] args) {

        /*
        there are 3 classes to store strings.
        String,StringBuilder,StringBuffer

        why did java create 3 classes to create Strings?
        1)String class is " immutable" , StringBuilder is "mutable ".
        when you update a String class object, Java creates a new container for it and puts the updated value it.
        when you update a String , Java does not update the original value
        when we do any update in String class objects, Java doesnt change original value(unless you reassign the update to the same container).
         This is called "immutability".
        when we do any update in StringBuilder class object Java updates original value. this is called "mutability".

        2)StringBuilder and StringBuffer are both "mutable" so what is the difference between StringBuilder and StringBuffer?
        a)StringBuilder is faster than StringBuffer
        b)StringBuffer is "threadsafe" and "synchronized" ,but StringBuilder is not.
          Being "threadsafe" means to be able to multiple tasks(threads ) at a time.
          Being "synchronized" means to be able to put the threads  at a time.



         */


        String s="Java";
        String t= "Java";
        String u="Apex";

        s=s.concat("!");//Java!
        //concat() method is used in String class to add some characters to the String

        System.out.println(s);
        System.out.println(t);

        String y=new String("Apex");//by this way I am telling to Java to create a "new container for the "y"container.
        // If I don't want Java to check String Pool,I want Java to create new container every time.


        //StringBuilder Methods


       // String x=new String("Java");

        StringBuilder v=new StringBuilder("Python");
        System.out.println(v);//Python

        v.append("!");//append concat gibi  concat()==>append adds characters to the end of the StringBuilder object
        System.out.println(v);//Python!

        StringBuilder x=new StringBuilder("Ruby");
        System.out.println(x);

        StringBuilder sb=new StringBuilder();
        System.out.println(sb);

        sb.append("Hi! ").append("Java!...");

        System.out.println(sb);
        System.out.println(sb.capacity());//16
        System.out.println(sb.length());//12

        StringBuilder stateAbbr=new StringBuilder(2); //if we define some more characters to be added that is haveing greter number
                                                             //new Capacity--> Existing /Idenified Cap Num *2+2
        stateAbbr.append("FL").append("How").append("Jack");
        System.out.println(stateAbbr);
        System.out.println(stateAbbr.capacity());//14
        System.out.println(stateAbbr.length());//9

        sb.reverse();
        System.out.println(sb); //...!avaJ !iH

        sb.replace(0,4,"*");
        System.out.println(sb);//*avaJ !iH

        sb.insert(5,"123");
        System.out.println(sb);//*avaJ123 !iH

        sb.delete(5,8);
        System.out.println(sb);//*avaJ !iH

        sb.deleteCharAt(6);
        System.out.println(sb); //*avaJ iH

        StringBuilder a=new StringBuilder("Nava");
        StringBuilder b=new StringBuilder("Lava");

       int r= a.compareTo(b); // compareTo() compares the first characters of the given container values
                             // if the compared container's first char is before the second given container's first
                            // characters in alphabetical order you will receive negative value.
                            // This method compares  the SB object lexicographically.(according to the order of alphabetical order)

        System.out.println(r);//+2

        a.setCharAt(2,'n');
        System.out.println(a);

        //Methods in StringBuffer

        StringBuffer sbf=new StringBuffer("Python");

        System.out.println(sbf.subSequence(2,4));//th

        System.out.println(sbf);














    }
}
