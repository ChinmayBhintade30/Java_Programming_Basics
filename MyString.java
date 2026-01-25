/*
String - 
*/
class Demo{
    public static void main(String args[]){
        //String s = new String("Navin");

        //we can write directly String s = "";

        // String s = "navin"; 
        // s = s + "Reddy";

        //String buffer

        // StringBuffer s1 = new StringBuffer("navin");
        // s1.append("Reddy");
    
        // System.out.println(s1);
        // System.out.println(s.length());
        // System.out.println(s.index('n'));
          
        // string functions in built 

        //length() - returns the length of the string
        String s = "java Programming";

        System.out.println(s.length()); //16

        //toUpperCase() --> converts to uppercase
        System.out.println(s.toUpperCase());

        //toLowercase() --> converts into lowercase
        System.out.println(s.toLowerCase());

        //charAt(index) --> gives character at specific mentioned index
        System.out.println(s.charAt(7));

        //substring(start,end) --> this function extracts that specific part from the string
        // according to the given start and the end index number --> extracts range

        System.out.println(s.substring(5, 8));

        //contains("Java") - checks validates whether the given string is present in the substring or not
        System.out.println(s.contains("java"));

        //concat() - concatenates the string with another 
        System.out.println(s.concat("basics"));






















        }
}