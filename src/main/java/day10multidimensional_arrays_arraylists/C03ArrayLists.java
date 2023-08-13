package day10multidimensional_arrays_arraylists;

import java.util.ArrayList;

public class C03ArrayLists {
    public static void main(String[] args) {

        /*
    1)it is impossible to create an Array without declaring the number of elements in it.
    This is not good because it is impossible to decide number of elements ou will put into an array at the beginning.

     Arrays are fixed in length, is created issues in implementation, that is why Java created another structure which is
        flexible in length. Its name is  " ArrayList"

        Arrays use "primitive" nad references in data types but ArrayLists use just non-primitives


        why didn't Java remove arrays after creating array lists?
        Because 1)Arrays are so fast 2)arrays use memory so less

        what the array list?
           ArrayLists      are for storing multiple daa in the same data type with flexible length
         */



     //How to create an ArrayList  // array list primitive datatype kabul etmez. non-primitive data type kullanmak gerek

        ArrayList<Integer >m=new ArrayList<>();

        // How to print ArrayLists
        System.out.println(m); //[ ]

        // how to add element int a ArrayList(List)
        m.add(12);
        m.add(5);
        m.add(9); //add method adds the elements to the end

        m.add(1,3);//add(given index,element) method adds the elements to the index
        m.add(3,10);

        System.out.println(m); //[12,3,5,10,9]



        ArrayList<Integer>n=new ArrayList<>();
        n.add(99);
        n.add(88);
        n.add(77);
        System.out.println(n);

        m.addAll(n);
        m.addAll(2,n);
        System.out.println(m);//[12, 3, 99, 88, 77, 5, 10, 9, 99, 88, 77]



        //example:Create an integer arraylist and change the odd ones to 11

        ArrayList<Integer> p=new ArrayList<>();
        p.add(23);
        p.add(24);
        p.add(12);
        p.add(9);
        p.add(3);
        System.out.println(p);//[23, 24, 12, 9, 3]

        for (Integer w: p){

            if (w%2!=0){
                p.set(p.indexOf(w),11); //Returns the index of the first occurrence of the specified element in this list,
                // or -1 if this list does not contain the element. More formally, returns the lowest index i such that Objects.equals(o, get(i)), or -1 if there is no such index.
            }

        }
        System.out.println(p);//[11, 24, 12, 11, 11]



        //Example:create a string arraylist and remove the element contain a

        ArrayList<String> r =new ArrayList<>();
        r.add("Miami");
        r.add("new york");
        r.add("tampa");
        r.add("virginia");
        System.out.println(r); // [Miami, new york, tampa, virginia]

        for (int i=0; i<r.size();i++){ // Returns:true if this list contained the specified element

            String city=r.get(i); //Returns:the element at the specified position in this list

           if (city.contains("a")){

               r.remove(city); //Removes the first occurrence of the specified element from this list, if it is present.
                               //. If the list does not contain the element, it is unchanged.
               //r.remove(i);//Removes the element at the specified position in this list.

               i--;// bunu yazmazsak virginia yi da yazdirir
           }
        }
        System.out.println(r); //[new york]

    }
}
