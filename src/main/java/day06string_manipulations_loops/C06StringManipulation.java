package day06string_manipulations_loops;

public class C06StringManipulation {
    public static void main(String[] args) {

        String s= "java is java";

        //others Methods
        boolean r1= s.contains("v");
        System.out.println(r1); // true

        boolean r2= s.contains("x");
        System.out.println(r2); // false

       boolean r3= s.startsWith("j");
        System.out.println(r3); // true

        boolean r4= s.startsWith("J");
        System.out.println(r4); // false

        boolean r5=s.endsWith("a");
        System.out.println(r5); // true

        char r6=s.charAt(2); // eger char data type da SINGLE karakter almak istiyorsak  charAt kullanmak lazim
        System.out.println(r6); // v

      String r7=  s.repeat(3); //uc kez tekrar eder
        System.out.println(r7); // java is javajava is javajava is java

    }
}
