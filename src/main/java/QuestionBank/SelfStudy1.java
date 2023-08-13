package QuestionBank;

public class SelfStudy1 {
    public static void main(String[] args) {

        //Find the sum of integers from 1 to 10

        int top=0;
        for (int p=1; p<=11;p++){
            top=top+p;
        }
        System.out.println(top);


        //Find how many integers greater than 1 and less than 112 divide 112 evenly

        int count=0;
        for (int a=2; a<112;a++){
            if (112%a==0){
                count=count+1;
            }
        }
        System.out.println(count);

        //Find how many vowels are in the string S.
        String str="sabihaa";
        int count2 = 0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)=='a' || str.charAt(i)=='e' ||str.charAt(i)=='i' || str.charAt(i)=='o'|| str.charAt(i)=='u'){
                count2++;
            }

        }
        System.out.println(count2);




























    }
}
