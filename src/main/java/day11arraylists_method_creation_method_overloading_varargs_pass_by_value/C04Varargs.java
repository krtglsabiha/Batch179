package day11arraylists_method_creation_method_overloading_varargs_pass_by_value;

public class C04Varargs {
    public static void main(String[] args) {

        //note: Varargs stands for "Variable Argument"
        //By using "Varargs", we made method work with different number of arguments
        //"Varargs" uses "Arrays" behind, that is why when you work with "varargs", think you are working with "arrays"
        //you cannot use any parameter after "Varargs" must be the last parameter in a method
        // you can use parameter before "varargs", because the parameter you used can be make full, then "Varargs" will be reachable
        // you can use just a single "varargs in a method parenthesis



        System.out.println(add());

        System.out.println(add(5));

        System.out.println(add(5,3));

        System.out.println(add(5,3,2,1,34,12,23,9,5,11));

    }


    //create a method able to do addition with any number of parameters

    public static int add(int... a){
        int sum=0;
        for (int w:a){
            sum=sum+w;

        }

        return sum;
    }

}
