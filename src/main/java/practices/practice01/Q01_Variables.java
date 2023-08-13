package practices.practice01;

public class Q01_Variables {

    public static void main(String[] args) {

        /*
        Task: Write a Java programme to break an integer into a sequence of individual digits.
              Hint: use / and %
              x: input: 12345
      output: 1
              2
              3
              4
              5
         */



        int x=12345; //12345%10 => 1234.5
        int ones =x%10;
        int tens=(x/10)%10;// 12345/10=>1234.5
        int hundreds=(x/100)%10; //12345/100 => 123.45
        int thousands=(x/1000)%10; //12345/1000 => 12.345
        int thenThousands=(x/10000)%10; //12345/10000 => 1.2345

        //camelCase, snake_case, PASCAL_CASE, kebab_case ==> naming convention
        System.out.println(thenThousands +"\n" +thousands +"\n"+hundreds +"\n"+ tens +"\n" +ones);






    }
}
