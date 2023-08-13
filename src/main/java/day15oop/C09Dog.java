package day15oop;

public class C09Dog extends C08Mammal{

    @Override // @ override annotation checks "Override" rules in our code
    public void eat() {
        System.out.println("Dogs eat...");
    }

    @Override
    public int getWeight() {
        return 6;
    }

    @Override
    public C09Dog create() {
        return new C09Dog();
    }
}
