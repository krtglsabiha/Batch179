package day22collections_maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

public class C04Maps {
    /*
    HashMap:1)It doesn't put the entries in any order,that is why it is so fast.
            2)HashMap allows you to use null in Keys and in Values
            3)HashMap is not "thread-safe " and not "synchronized ".
   HashTable:1)It doesn't put the entries in any order,that is why it is fast, but it is slower than hashmap.
             2)HashTable is "thread-safe " and not "synchronized ".
             3)HashTable doesn't  allow you to use "null" in Keys and in Values
    TreeMap:1)It put the entries in natural order, that is why it is so slow.
            2)TreeMap doesn't  allow you to use "null" in Keys but  is allowed  in Values
            3)TreeMap is not "thread-safe " and not "synchronized ".
     */

    public static void main(String[] args) {


        Hashtable<Integer,String>define =new Hashtable<>();
        define.put(1,"Baby");
        define.put(15,"Teenage");
        define.put(67,"Senior");
       // define.put(67,null); NullPointerException
       //  define.put(null,"Adult"); NullPointerException
        System.out.println(define);//{15=Teenage, 67=Senior, 1=Baby}


        TreeMap<String,Integer>countries =new TreeMap<>();
        countries.put("Albania",3);
        countries.put("Germany",83);
        countries.put("USA",400);
        countries.put("Belgium",12);
        countries.put("null",120);//NullPointerException
        countries.put("UK",null);

        System.out.println(countries);//{Albania=3, Belgium=12, Germany=83, USA=400}


    }
}
