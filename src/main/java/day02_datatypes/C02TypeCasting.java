package day02_datatypes;

public class C02TypeCasting {


    public static void main (String[] args) {

        byte myAge = 34;
        int age = myAge;



        long value1 = 3400;
        short value2 = (short) value1;


        //not
        int numOfStd = 12;
        int amountOfMoney = 500;

        //eger tum valuelar int ise matematikte int olur
        //eger sonuc decimal ise matematikte java decimal parti inte ceviriyor
        System.out.println(amountOfMoney / numOfStd ); //41.6666....


        //not
        int numOfStudent = 12;
        float moneyAmount = 500.0F;

        //matematik islemlerinde farkli datatype kullanirsan sonuc data typtan daha buyuk olur
        //

        System.out.println(moneyAmount / numOfStudent ); //41.666668


    }




}
