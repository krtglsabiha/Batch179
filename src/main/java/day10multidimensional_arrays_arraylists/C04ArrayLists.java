package day10multidimensional_arrays_arraylists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class C04ArrayLists {
    public static void main(String[] args) {

        //Example: Created a character list which has repeated elements then remove the duplicates
        //[j,a,v,a,c]===> [j,a,v,c]
        List<Character>a=new ArrayList<>();
        a.add('J');
        a.add('a');
        a.add('v');
        a.add('a');
        a.add('v');

        List<Character>b=new ArrayList<>(); // [     ]

        for (Character w : a){
            if (!b.contains(w)){
                b.add(w);
            }

        }
        System.out.println(b); //[J, a, v]



        //Example:Find the closet 2  integers in the given list.
        // [20, 15, 14, 11, 19] ==> 14-15, 1-20


        List<Integer>p=new ArrayList<>();
        p.add(20);
        p.add(15);
        p.add(14);
        p.add(11);
        p.add(19);
        System.out.println(p);// [20, 15, 14, 11, 19]
        //sort the list element in ascending order
        Collections.sort(p);
        System.out.println(p);//[11, 14, 15, 19, 20]

        //find the minimum difference
        int minimum =p.get(1) - p.get(0);

        for (int i=1;i<p.size();i++){
            minimum=Math.min(minimum, p.get(i)-p.get(i-1));
        }
        System.out.println(minimum);

        //find the elements give minimum difference
        for (int i=1;i<p.size();i++){
            if (p.get(i)-p.get(i-1)==minimum){
                System.out.println(p.get(i-1)+" and " + p.get(i));

            }
        }












    }
}
