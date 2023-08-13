package day16oop;

public class C06StudentRunner {

    public static void main(String[] args) {

        C05Student std = new C05Student();

        System.out.println(std.getStdId());// TH001
        System.out.println(std.getIllness());// Headache
        System.out.println(std.getGpa());//3.98
        System.out.println(std.isDisability());//false

        std.setStdId("SB001");
        System.out.println(std.getStdId());//SB001

        std.setIllness("Anxiety");
        System.out.println(std.getIllness());//Anxiety

    }
}
