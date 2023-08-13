package day08Whileloop_dowhileloop;

public class C03DoWhileLoop {
    public static void main(String[] args) {

        // while loop

        int i=1;

        while (i<1){
            System.out.println("while loop");

            i++; // zero execution is possible
        }

        //do while loop
        int k=1;

        do {
            System.out.println("do while loop");
            k++; // zero execution is impossible
        }while (k<1);

        /*
        note1: zero execution is possible for while loop , but it is not possible for do-while loop
        note2: do-while loop body is executed at least for once
        note3: do-while loop is good to start game applications.
         */

        //example:reverse a string by using do-while loop

        String s ="Alex"; // last index should be started to type

        int t= s.length()-1; //last index value

        String reversed= " ";
        do {
            reversed= reversed+ s.charAt(t);

            t--;

        }while (t>=0);

        System.out.println(reversed);

        //example: type code to find the sum of digits from 7 to 10
        // 78910-->7+8+9+10=34

        int sum=0;
        //1.way -->for loop

        for (int n=7;n<11; n++){
            sum=sum+n;
        }
        System.out.println(sum);

        //2.way -->while loop
        int n=7;
        int sum2=0;
        while (n<11){
            sum2=sum2+n;
            n++;
        } System.out.println(sum2);

        //3.way--> do-while loop

        int r=7;
        int sum3=0;
        do {
            sum3=sum3+r;
            r++;
        }while (r<11);
        System.out.println(sum3);







    }
}
