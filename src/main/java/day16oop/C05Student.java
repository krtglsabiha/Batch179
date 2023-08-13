package day16oop;

public class C05Student {

     /*
        Encapsulation: It means "data hiding"
        Why do you need to hide data?
        i) Because some data should not be public like "ID"
           "Credit Card Number", "Social Security Number",gpa etc.
        ii) Because we do not want some data to be accessible from the other classes/packages.
        How do you do encapsulation?
        To hide data I use "private" access modifiers

        Note: set and get methods are called "Java Beans"

     */
    private String stdId = "TH001";
    private String illness = "Headache";
    private double gpa = 3.98;
    private boolean disability = false;

    //How to read encapsulated data even we do not see them
    //get() methods are called getter
    public String getStdId(){
        return stdId;
    }
    public String getIllness(){
        return illness;
    }
    public double getGpa() {
        return gpa;
    }
    public boolean isDisability() { //get method for booleans starts with "is", all the others start with "get"
        return disability;
    }

    //How to update encapsulated data even we do not see them
    //set() methods are called setters
    public void setStdId(String stdId){
        this.stdId = stdId;
    }
    public void setIllness(String illness) {
        this.illness = illness;
    }
    public void setGpa(String setGpa){
        this.gpa=gpa;
    }
    public void setDisability(String Disability){
        this.disability=disability;
    }

}
