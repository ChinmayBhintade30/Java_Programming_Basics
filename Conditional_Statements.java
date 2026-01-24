//conditional statements --> if ,else else if
/*
Syntax -->

If(condition)
    {

}
else if(condition2){

    }
else{
    
}  
when condition gets true - that block gets executed - otherwise - false - then else block is executed
*/
class condition{
    public static void main(String args[]){
        int num1 = 9;
        int num2 = 5;
        int result = 0;

        //If condition -> print "hello" if num1 > num2
        // if(num1 > num2){
        //     System.out.println("hi");
        // }    

        // else if(num1 < num2){
        //     System.out.println("Hello");

        // }
        // else{
        //     System.out.println("Bye");
        // }
        if(num1>0){
            result = 5;
            //assign result variable as - 5 as per the num condition --> 
            //means if num > 0 then only result = 5

        }
        else{
            result = 10;
        }
        System.out.println(result);


        int result1 = num1 > 0 ? 5:10;
        //ternary operator - ? - question mark used --> 

        //5

        System.out.println(result1);

    }
}