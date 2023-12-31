package day20exceptions;

import java.util.ArrayList;
import java.util.List;

public class GradeRunner {

    public static void main(String[] args) {
        System.out.println(addGrades(67));
        System.out.println(addGrades(-67));
        System.out.println(891);


    }

    //Create a method that adds grades into a list

    public static List<Integer>addGrades(int grade){
        List<Integer>gradeList =new ArrayList<>(); //empty grade list to store the grades

        if (grade>=0 && grade <=100){
            gradeList.add(grade);
        }else {
            throw new IllegalArgumentsException("Grade cannot be less than 0 or more than 100");
        }


        return  gradeList;
    }
}
