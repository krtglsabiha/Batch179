package day06string_manipulations_loops;

public class C05StringManipulations {
    public static void main(String[] args) {

        //Example 6: Type a code to find the number of punctuation marks used in a String.
        //         "Woooow!... Toms is 13, and he is in university...."

        String s= "Woooow!... Toms is 13, and he is in university....";

       int numOfPuncts= s.replaceAll("[^\\p{Punct}]", "").length();
        System.out.println(numOfPuncts);


        //Example : Type a code to find the number of words used in a String
        //           "Learn Java,earn huge amount of money." ==>7

        String t= "Learn Java, earn huge amount of money.";

        //1.yol kelime sayisi bosluk sayisindan bir fazladir.
       int numOfSpaceChars= t.replaceAll("[^ ]", "").length();
        System.out.println("Total number of words:" + (numOfSpaceChars + 1));

        //2. yol split() metodunu kullan boslukla birlikte
       int numOfWords= t.split(" ").length;

        System.out.println(numOfWords);

        //Example : Type a code to find the number of letters used in a String
        //           "Learn Java,earn huge amount of money." ==>30

      int  numOfLetters=  t.replaceAll("[^A-Za-z]", " ").length();
        System.out.println(numOfLetters);

    }
}
