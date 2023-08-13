package day09arrays_foreach_loop;

import java.util.Arrays;

public class C01Arrays {
    public static void main(String[] args) {

        //to learn a new topic: 1) what is it? 2)why do we need it? 3)how do we use it?
        // 4)Mid-level implementation should be practice 5) Advanced-level implementations should be applicable
        //

        /*
        1)arrays is a data structure, used to store multiple data in the same data type.
        2) when you create an Array , you have to declare the number of elements(lenght) in the array.
         */

        //How to create an Array
        String [] stdNames = new String[5];
        System.out.println(stdNames);//reference of the array is given  ([Ljava.lang.String;@58372a00)

        System.out.println(Arrays.toString(stdNames)); // [null, null, null, null, null]

        //how to add elements into an array

        stdNames[0]="Tom";
        stdNames[3]="mary";
        stdNames[1]="mark";
        stdNames[4]="hanks";
        stdNames[2]="jim";

        System.out.println(Arrays.toString(stdNames)); //[Tom, mark, jim, mary, hanks]

        //how to get a specific element from an Array

       String fourth= stdNames[3];
        System.out.println(fourth);

        //example:Create an integer array, find the multiplication of all elements

        int [] ages=new int[4];
        ages[0]=12;
        ages[1]=5;
        ages[2]=7;
        ages[3]=1;

        System.out.println(Arrays.toString(ages)); //[12, 5, 7, 1]

        //1.yol
        int result=1;

        for (int i=0; i< ages.length; i++){

            result=result*ages[i];

        }
        System.out.println(result);


        //2.yol for-each loop (enhanced loop)
        //for-each loop is so easy to use, that is why if it is possible we prefer to use for each-loop
        // sometimes we need to work  with indexes, if you need to use indexes, using for-each loop is not possible
        //for-each loop can be used  just with "Array" and "Collections"
        int result2=1;

        for (int w: ages){
           result2=result2*w;

        }
        System.out.println(result2);


        //example: Find the different between the maximum and the minimum value of array elements
        //[8,12,34,10,78,19]==> 78-8 ==> 70

        int []nums = {8,12,34,10,78,19}; // second way to declare an array

 //    1.yol by using sort method
        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums)); //[8, 10, 12, 19, 34, 78]

        int min=nums[0];

        int max=nums[nums.length-1];

        System.out.println(max-min); //70

        // 2.yol : for each loop

        //Math.min()
        //Math.max()

        int []numbers = {8,12,34,10,78,19};

        int minimum=numbers[0];
        int maximum=numbers[0];

        for (int w:numbers){

            minimum=Math.min(minimum,w);

            maximum=Math.max(maximum,w);


        }
        System.out.println(maximum-minimum);










    }
}
