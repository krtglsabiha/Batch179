package QuestionBank;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateClass {

    public static void main(String[] args) {

        //1) Type the code that finds out how many days Ali lived.
        //Date of birth of Sabiha is 30th of september 1993

        LocalDate birthDateOfSabiha=LocalDate.of(1993,9,24);
        LocalDate currentDate=LocalDate.now();
        long numberOfDaysSabihaLived= ChronoUnit.DAYS.between(birthDateOfSabiha,currentDate);
        System.out.println("numberOfDaysSabihaLived = " + numberOfDaysSabihaLived);


        //2) Type the code that finds out how many months Sabiha lived.
        //Date of birth of Sabiha is 24th of september 1993

        LocalDate brthDateOfSabiha=LocalDate.of(1993,9,24);
        LocalDate currentDate1=LocalDate.now();
        long numberOfMonthsSabihaLived=ChronoUnit.MONTHS.between(brthDateOfSabiha,currentDate1);
        System.out.println("numberOfMonthsSabihaLived = " + numberOfMonthsSabihaLived);


        //3)Date of birth of Sabiha is 24th of september 1993.
        // Type code to find the exact date 2 years, 3 months, and 12 days after Sabiha's birthdate.

        LocalDate brthDateOfSabiha1=LocalDate.of(1993,9,24);
        LocalDate exactDate=brthDateOfSabiha1.plusYears(2).plusMonths(3).plusDays(12);
        System.out.println("exactDate = " + exactDate);


        //4) Ali was born 45 years, 8 months and 5 days after 29 October 1923.
        //Veli was born 24 years, 2 months and 11 days before 15 September 1993.
        //Type code to calculate the exact date of birth of Ali and Veli
        // Type code to check if the date of birth of Ali and Veli is the same or not.

        LocalDate dobAli=LocalDate.of(45,8,5).plusYears(45).plusMonths(8).plusDays(5);
        LocalDate dobVeli=LocalDate.of(9,9,15).minusYears(24).minusMonths(2).minusDays(11);
        System.out.println("dobVeli = " +dobAli.equals(dobVeli));

        //5) Veli was born 3 years and 11 days after Ali.
        //Ali gave you his date of birth as 24th of November 2012 Type code to calculate Veli’s date of birth.

        LocalDate bdateOfAli= LocalDate.of(2012,11,24);
        LocalDate bdateofVeli=bdateOfAli.plusYears(3).plusDays(11);
        System.out.println(bdateofVeli);

        //6) Create a Date Value for your birthdate and create
        // Date Value for your kid's birthdate then calculate the difference in days.

























    }
}
