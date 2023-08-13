package day03_scanner_concatenation;

public class C08IncrementDecrement08 {

    public static void main(String[] args) {

        // increment means increase value of a variable

        int age = 13;

        //1.way:

        age = age+2;
        System.out.println(age); //15

        //2.way:

        age += 2;
        System.out.println(age); //17

        //increment can be done by multiplication as well

        //1.way:
        age= age*2;
        System.out.println(age); //34

        //2.way:

         age *=2;

        System.out.println(age);//68

        //syntax used just increment by 1

        age++;
        System.out.println(age);//69

        //Decrement means to decrease value of a variable

       age= age-2;
        System.out.println(age);//67

        age-=2;
        System.out.println(age); //65

        //decrement can be done by division as well
        age= age/5;
        System.out.println(age);//13

        age/=13;
        System.out.println(age);//1

        //syntax used just to decrease by 1

        age--;
        System.out.println(age); //0
























    }
}
