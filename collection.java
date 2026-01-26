/*
collection API - 
ArrayList - import from the package java.util.ArrayList
*/
import java.util.ArrayList;

class Demo{
    public static void main(String args[]){
        ArrayList nums = new ArrayList();

        //we can add the values like append in the ArrayList - using nums.add
        //add method --> 
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        System.out.println(nums);
        System.out.println(nums.get(2));
        System.out.println(nums.get(3));

        // get method 
    }
}