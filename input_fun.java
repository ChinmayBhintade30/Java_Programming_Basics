/*
input function in java 
using 
import java.util.Scanner;
using scanner class 
*/
import java.util.Scanner;
class Demo{
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        //sc is the obj and new Scanner is obj created using system.in
        int x = sc.nextInt();
        String s = sc.next();
        String line = sc.nextLine();

        System.out.println(x);
        System.out.println(s);
        System.out.println(line);
    }
}
