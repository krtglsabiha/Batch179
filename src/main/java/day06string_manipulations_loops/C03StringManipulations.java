package day06string_manipulations_loops;

public class C03StringManipulations {
    public static void main(String[] args) {

        /*
         Example 4:Check if a password has the following conditions
        i)It should not be empty
        ii)It should not be just a single space
        iii)It should not have spaces at the beginning and at the end
        iv)'i' should be a character in the password and first occurrence of 'i' should be at index 4
        v)'K' should be a character in the password and last occurrence of 'K' should be at index 5
         */

        String pwd="A12?iKm";

        //i)It should not be empty
        boolean first=pwd.isEmpty();    // isEmpty eger stringde bosluk varsa cevap true bosluk yoksa false
        System.out.println(first);

        //ii)It should not be just a single space
        boolean second=pwd.isBlank();    // isBlank eger stringte hepsi bosluksa true olur ,bosluk olmazsa false
        System.out.println(second);      // isBlank  eger string bos olursa tine true olur

       // iii)It should not have spaces at the beginning and at the end

       boolean third= pwd.trim().equals(pwd);
        System.out.println(third);

        //iv)'i' should be a character in the password and first occurrence of 'i' should be at index 4

        boolean fourth= pwd.indexOf("i")==4;
        System.out.println(fourth);

        // v)'K' should be a character in the password and last occurrence of 'K' should be at index 5

        boolean fifth=pwd.lastIndexOf("K")==5;
        System.out.println(fifth);

        // 1.yol kullaniciya mesaj vermek
        if (!first && !second && third && fourth && fifth ){
            System.out.println("password is valid");

        }else{
            System.out.println("password is  invalid");
        }
        // 2.yol kullaniciya mesaj vermek  asagidaki sekilde
        if(first){
            System.out.println("Empty password is not accepted");
        }
        if(second){
            System.out.println("Password needs visible characters");
        }
        if(!third){
            System.out.println("Do not use space at the beginning and at the end");
        }
        if(!fourth){
            System.out.println("Fifth character should be i");
        }
        if(!fifth){
            System.out.println("Sixth character should be K");
        }

        if(!first && !second && third && fourth && fifth){
            System.out.println("The password is valid");
        }else{
            System.out.println("The password is invalid");
        }
    }
}