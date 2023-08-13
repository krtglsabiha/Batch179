package day23iterators_lambda;

import java.util.Arrays;
import java.util.HashMap;

public class C01MapExample {

    public static void main(String[] args) {

        //Homework: Create a method to display the number of occurrences of letters in a sentence
        //          Java, Java, I love Java. ==> J=3, a=6, v=4, I=1, l=1, o=1, e=1


        String s= "Java, Java, I love Java.";
        s= s.replaceAll("[^a-zA-Z]", "");


        String[] letters= s.split("");
        System.out.println(Arrays.toString(letters));//[J, a, v, a, J, a, v, a, I, l, o, v, e, J, a, v, a]

        HashMap<String,Integer> occ=new HashMap<>();
        for (String w:letters) {
            Integer numOfOcc=occ.get(w);
            if (numOfOcc==null){
                occ.put(w,1);
            }else {
                occ.replace(w,numOfOcc+1);
            }
        }
        System.out.println(occ);//{a=6, e=1, v=4, I=1, J=3, l=1, o=1}








    }
}
