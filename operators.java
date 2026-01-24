//Operators - to perform operations on values stored inside the variable


//Arithemetic --> addition + , subtraction - ,Multi - * and  division - /
class operators{
    public static void main(String args[]){

        int num1 = 9;
        int num2 = 5;

        int add = num1 + num2;
        int subtract = num1 - num2;
        int mul = num1 * num2;
        int div = num1 / num2; // it only gives 1 - but actual answer should be 1.8 --> only gives qoutient

        int mod = num1 % num2;

        System.out.println(add);
        System.out.println(subtract);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(mod);

//if you want remainder of the divsion


//relational operators --> < , <=, > , >= , ==, !=

//for comparing 2 values - relational operators are used - and output is always a boolean value
//true or false

        boolean result1 = num1 < num2;
        boolean result2 = num1 <= num2;
        boolean result3 = num1 > num2;
        boolean result4 = num1 >= num2;
        boolean result5 = num1 == num2;
        boolean result6 = num1 != num2;

        System.out.println("result1 : " + result1);
        System.out.println("result2 : " + result2);
        System.out.println("result3 : " + result3);
        System.out.println("result4 : " + result4);
        System.out.println("result5 : " + result5);
        System.out.println("result6 : " + result6);
    
    
    //Logical operators -->
/* 
And operator - &&
Or operator - ||
Not - ! 
*/

        boolean result7 = num1 > num2 && num1 > 0; // num1 
        System.out.println(result7);

        boolean result8 = !(num1>0);// Not !(num1>0) --> !(true) --> false
        System.out.println(result8);

        boolean result9 = num1 < num2 || num1 > 0; // OR operator || --> true or false --> true
        System.out.println(result9);

        
    }

}