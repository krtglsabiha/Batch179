package day04logical_operators_if_switch_statements;

public class C01PostPreIncrement {

    public static void main(String[] args) {


        //PostIncrement
        int a= 12;
        int b=a++;

        System.out.println(a); //13
        System.out.println(b); //12

        double x= 11.5;
        double y= x++;

        System.out.println(x); //12.5

        System.out.println(y); // 11.5

        //pre increment

        int t = 10;
        int u =++t;
        System.out.println(t); //11
        System.out.println(u); //11

        //Post Decrement

        int c = 15;
        int d = c--; // c 15 oldugu icin d 15 oldu daha sonra cden 1 cikaracagimiz icin c 14 oldu

        System.out.println(c);
        System.out.println(d);

        //Pre decrement

        int e=20;
        int f=--e; // e nin onunde eksi oldugu icin once o yapilir e den 1 cikinca 19 olur yani e 19 oldu f de 19

        System.out.println(e); //19
        System.out.println(f); //19






    }
}
