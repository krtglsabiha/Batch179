package day17oop;

public class CarRunner {
    public static void main(String[] args) {

        Honda myHonda=new Honda();
        myHonda.brake();
        myHonda.price(); //price() method can be accessed through object (myHonda) because of the keyword "default"

        Engine.accelerate(); //accelerate() method can be accessed directly through the interface because of the keyword 'static'
                             //'static' means it is like moon to the earth ...so we dont need to create any object to
                             // reach out to moon in this case, accelerate() method.

        System.out.println(Engine.ENGINE_NAME);


    }
}
