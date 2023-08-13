package day04logical_operators_if_switch_statements;

public class C02LogicalOperators {

    public static void main(String[] args) {

        //"AND" Logical operators: &&

        // T && F = F
        // F && T = F                 // " AND" DE BIR TANE FALSE VARSA SONUC FALSE
        // F && F = F
        // T && T = T

        //SADECE 1 tane false olmasi yeterli sonucun false olmasi icin

        // eger sonucun true olacaksa ikisi de true olacak

        int k = 5;
        int i = 10;

        System.out.println((i>k) && (i==2*k) && (i/k==2) && (i%k==2));
                            // t &&      t   &&      t    &&  f    ====> false

       // bu ornekte sadece birisi yanlis oldugu icin digerlerine bakmaya gerek yok cunku birtane false sonucu false yapar

        System.out.println((i<k) && (i==2*k) && (i/k==2) && (i%k==2));
                         //  false                             ======> false

        //not:  eger && kullaniyorsan and operation da  java da ilk false buldugu zaman digerlerini kontrol etmez

        // ama java & bunda hepsini kontrol eder


        System.out.println((i<k) & (i==2*k) & (i/k==2) & (i%k==2));

        // "OR" logical operators : ||

        // T || F = T
        // F || T = T                 // " AND" DE BIR TANE true VARSA SONUC true
        // F || F = F                  //  sonucun false olmasi icin ikisinin de false olmasi gerekiyor
        // T || T = T

        int a = 6;
        int b= 2;

        System.out.println((a>=b) || (a%b!=0) || (a<=3*b));
                           //   t    ||    f    ||  t      ===> true

        System.out.println((a==b) || (a%b!=0) || (a>=3*b));
                         //  f ||         f    ||   f    ===> false


        //note:   tek or yoktur " | "  ,  sadece "||" kullanilir


        System.out.println(((a>=b) || (a%b!=0)) && (a<=3*b));
                           //  t  ||  t      && t          ====>true


        System.out.println((a>=b) || ((a%b!=0) && (a<=3*b)));   // true









    }
}
