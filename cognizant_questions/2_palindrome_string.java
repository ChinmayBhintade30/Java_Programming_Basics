// palindrome check of string

class Demo{
    public static void main(String args[]){
        String s = "madam";
        String rev = "";

        for(int i =0 ; i<s.length(); i++){
            rev = s.charAt(i) + rev;


        }
        System.out.println(s.equals(rev) ? "Yes it is palindrome" : "Not a palindrome");
    }
}