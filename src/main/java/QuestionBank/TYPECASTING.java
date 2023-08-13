package QuestionBank;

public class TYPECASTING {

    public static void main(String[] args) {

       // Create a short variable and convert it to an int variable.
        short u=45;
        int newu=u;

        //Create a long variable and convert it to an int variable.
        long a= 45631789l;
        int newa= (int) a;

        //Create a double variable and convert it to a float variable
        double e=78.3;
        float newe= (float) e;

        //Create a double variable and convert it to a short variable,
        // then print the value of the short variable on the console.
        // Be careful about the output, it will not be a decimal value.

        double s=78.1;
        short news=(short) s;
        System.out.println(news);

        //Create a byte variable and convert it to a double variable,
        // then print the value of the double variable on the console.
        // Be careful about the output, it will be a decimal number.

        byte z=45;
        double newz= z;
        System.out.println(newz);










    }
}
