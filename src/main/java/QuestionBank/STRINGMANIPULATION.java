package QuestionBank;

public class STRINGMANIPULATION {
    public static void main(String[] args) {

        //Create a String variable for city names which have just a single word.
        //Print the city name with the initial is in uppercase and all the other
        // characters are in lower cases on the console.

        String cityName=" stOCKholM ";
        String newCityName=cityName.trim().toLowerCase();
       newCityName =newCityName.substring(0,1).toUpperCase()+newCityName.substring(1);
        System.out.println(newCityName);

        //Create 3 String variables for people's names.
        // Print the sum of the number of characters in all the 3 names except space characters.
        //Example: If the names are Ali Can, Merve Star, Mark Tom you should see 22 on the console.

        String a="Eva";
        String b="Sabiha";
        String c="Ibrahim";
        int d=a.length();
        int e=b.length();
        int f=c.length();
        System.out.println(d+e+f);

        //Create a String variable,
        // print the total number of alphabetical and numeric characters in the String on the console.
        //Example: If the String is ‘   Miami 33018!!!   ’ you need to print 10 on the console.

        String az="Hatice 8789!!";
        int t=az.replaceAll("\\s","").replaceAll("[^A-Za-z0-9]","").length();
        System.out.println(t);

        //Create a String variable, print the number of non-digit characters in the String on the console.
        //Example: If the String is ‘1a3Bcf4!...’ you need to print 8 on the console.

        String m="ABC123!!?...";
        int q=m.replaceAll("[0-9]", "").length();
        System.out.println(q);

        //Create a String variable and print just the last non-space character on the console for any String.
        //Example: For ‘Ali Can’ you should print n
        // For ‘Miami      ’ you should print i etc.

        String x="eva hatice";
        int np=x.trim().length()-1;
        String hj=x.substring(np,np+1);
        System.out.println(hj);

        //Create a String variable and find the sum of the ASCII values
        // of the first and the last characters of the String.

        String pl="Hatice";
        int j=pl.length()-1;
        int asciiForFirst=pl.charAt(0);
        int asciiForLast=pl.charAt(j);
        System.out.println(asciiForLast+asciiForLast);


        //Create a String variable and print all characters except the first character on the console.
        //Example:If the String is ‘Java’ you should print ‘ava’ on the console.

        String kl="hello";
        String firstCh=kl.substring(1);
        System.out.println(firstCh);

         //8)Create a String variable and print all characters except the last character on the console in uppercases.
         //Example:If the String is ‘Java’ you should print ‘JAV’ on the console.

       String hi="Sweden";
       Integer lastCh=hi.length()-1;
       String lm=hi.substring(0,lastCh).toUpperCase();
       System.out.println(lm);

       //9)Create a String variable and print all characters except the first character and the last character on the console in uppercases.
     // Example:If the String is ‘Java’ you should print ‘AV’ on the console.

       String is="meow";
       Integer lstCh=is.length()-1;
       String si=is.substring(1,lstCh).toUpperCase();
       System.out.println(si);

       //10)Type code to check if a String has just a single space character any position in the middle
     // Example: For  ‘Ali          Can’ your code should print false on the console
     // For  ‘     Ali Can      ’ your code should print false on the console
     // For  ‘     Ali             Can      ’ your code should print false on the console
     // For  ‘Ali Can’ your code should print true on the console

        String name="Eva Hatice";
        String in=name.trim();
        String remove=in.replaceAll("\\s","");
        Boolean ik=in.length()-remove.length()==1;
        System.out.println(ik);

        //11)Type code to check if a String does not have any space character at the beginning and at the end?
        //Example: For  ‘   Ali  ’ your code should print false on the console
        // For  ‘Ali’ your code should print true on the console

        String lk=" ibrahim ";
        String lp=lk.trim();
        Boolean sl=lk.equals(lp);
        System.out.println(!sl);

        //12) Type code to check if a String has an uppercase initial and dot at the end.
        //Example: For  ‘Ali’ your code should print false on the console
        // For  ‘ali.’ your code should print false on the console
        // For  ‘       Ali.       ’ your code should print false on the console
        // For  ‘Ali.’ your code should print true on the console
        // For  ‘ALI.’ your code should print true on the console

        String nam="ali veli.";
        char fch= nam.charAt(0);
        char lsch=nam.charAt(nam.length()-1);
        Boolean up=fch>='A' && lsch<='Z';
        Boolean dot=lsch=='.';
        Boolean fandl=up&&dot;
        System.out.println(fandl);









































    }

}
