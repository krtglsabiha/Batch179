package day03_scanner_concatenation;

public class C07Operators07 {
    public static void main(String[] args) {

        // "=" --> assignment operator===> sagdaki degeri alip sola gonderiyor
        // "==" --> equality operator==> soldaki degeri kontrol et sagdaki ile ayni mi
        //  2+3 == 5 --> true       2+4==3-->false  bu yuzden "== " ikitane esittir jaa da booleana doner

        //'A' == 65 --> true cevap dogru  => char da herhangi bir matematik islemi kullanirsan java ascii value kullanir

        System.out.println('A'==65);

        //example: find ascii value of "!" by typing code

        System.out.println('!' + 0 ); //33
        System.out.println('!' * 1); //33

        //" !" ==> not operator --> !true =false  /         !false=true    /           !!true=true

        //"!=" ==>not equals operator
        //     2+3 ! = 7 ==> true
        //      3+4 != 7 ==> false

        //"<" , "<" , "<=" ,">="     ====> return boolean

        /*

        "==" with Strings
        every String has two main things 1) value 2)address

        " == "check both  1) value 2)address , eger ikisi de ayniysa cevap dogru olur
        ama  bir developerin adresi kontrol etmeye ihtiyaci yok cunku iki stringi karsilastirirken "==" kullanilmaz

        equals () sadece value kontrol eder ,eger valueler ayniysa cevap true.
        Stringi karsilastiriken equals() metod kullanilir


         */
        String s1 ="Tom";
        String s2 = "Hanks";
        String s3 = "Tom";
        String s4 = new String ("Tom");

        System.out.println(s1==s2); // false

        System.out.println(s1==s3); // true

        System.out.println(s1==s4); //false

        System.out.println(s1.equals(s4)); //true   //sadece value sordugu icin value ayni oyuzden dogru












    }
}
