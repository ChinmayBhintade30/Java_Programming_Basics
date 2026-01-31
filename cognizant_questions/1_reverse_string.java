// reverse a string  using util scanner for input

class reverse{
    public static void main(String args[]){
        String s = "chinmay";
        String rev = "";

        for(int i = 0; i < s.length(); i++){
            rev = s.charAt(i) + rev;

        }
        System.out.println(rev);
    }
}