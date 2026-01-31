/*
collection API - 
ArrayList - import from the package java.util.ArrayList
*/
import java.util.ArrayList;
import java.util.*;

class Demo{
    public static void main(String args[]){
        // ArrayList<Integer> nums = new ArrayList<Integer>();

        //we can add the values like append in the ArrayList - using nums.add
        //add method --> 
        // nums.add(4);
        // nums.add(5);
        // nums.add(6);
        // nums.add(7);
        // nums.add("Navin");
        // System.out.println(nums);
        // System.out.println(nums.get(2));
        // System.out.println(nums.get(3));

        HashSet<Integer> nums =  new HashSet<>();
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(4);

        // get method 
        for(int n: nums){
            //enhanced for loop
            System.out.println(n);
        }
    }
}