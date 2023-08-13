package day07loops;

public class C06ForLoops {
    public static void main(String[] args) {

        //example: Find the sum of the digits of decimal part in a double number
        //         28.587==>5+8+7=20

        double n =28.587;
        //change the double data type to string data type because i need split method and i can use it just String
        String s=String.valueOf(n);

        //use split() method to get the decimal part
       String ds= s.split("\\.") [1];
        System.out.println(ds);

        // convert  data type of "ds" to integer
        int ids=Integer.valueOf(ds);
        System.out.println(ids);

        int sumOfDigits=0;

        for(int i=ids; i>0; i=i/10) {
            sumOfDigits = sumOfDigits + i % 10;
        }
        System.out.println(sumOfDigits);
    }
}
