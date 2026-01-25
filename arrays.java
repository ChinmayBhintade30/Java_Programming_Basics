/*
Arrays --> 
 store similar datatype values in one container

 array is list of elements of similar datatype

*/

class Student extends object{
    int rollno;
    String name;

    public Student(int rollno, String name){
        this.rollno = rollno;
        this.name = name;
    }
    public String tostring(){
        return "Student [rollno" + rollno + "name=" + name];
        }
}
import javax.swing.SpringLayout;
class ArrayDemo{
    public static void main(String args[]){
        int nums[] = {3,5,2,6,7};
        // one way of defining arrays

        //we can manually also assign the elements into array of fixed size
        // int nums1[] = new int[5];
        // nums1[0] = 6;
        // nums1[1] = 8;

        //we can print the value of nums defined - using for loop

        for(int i = 0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}