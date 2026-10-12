package day17;

public class Java11 {
    public static void main(String[] args) {
        String str = " Hello world java";
        String text = "Java Programming";
        String empty = "";
        String blank = "   ";

        // length();
        System.out.println("length " + text.length());

        //isEmpty()
        System.out.println("isEmpty " + empty.isEmpty());

        //isBlank()
        System.out.println("isBlank " + blank.isBlank());

        //charAt(n)
        System.out.println("charAt() " + text.charAt(2));

        // codePointAt
        System.out.println("codePointAt " + text.codePointAt(5));

        //subString
        System.out.println("subString() " + text.substring(5)); // starts from 6
        System.out.println("subString() " + text.substring(1,4));

        //equals()
        System.out.println("equals " + blank.equals(empty));


        //equalsIgnoreCase()
        System.out.println("equalsIgnoreCase " + text.equalsIgnoreCase("JAVA PROGRAMMING"));
    
        //compareTo()
        System.out.println("compareTo: " + "Apple".compareTo("Banana"));
        
        //compareToIgnoreCase()
        System.out.println("compareToIgnoreCase: " + "Apple".compareToIgnoreCase("Banana"));

        //contains()
        System.out.println("contains: " + text.contains("Programming"));

        //startsWith()
        System.out.println("startsWith: " + text.startsWith("Java"));

        //endsWith()
        System.out.println("endsWith: " + text.endsWith("ing"));

        //indexOf()
        System.out.println("indexOf(): " + text.indexOf('a')); // return the first index where it finds 'a'
        
        //lastIndexOf()
        System.out.println("lastIndexOf(): " + text.lastIndexOf('a'));        
    }
}
