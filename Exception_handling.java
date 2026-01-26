/*uException handling ->
handles run time error - exceptions - foe e.g run time error like 
division by zero 
if the deno is zero 
*/
class Demo{
    public static void main(String args[])
    {
        int i = 4;
        int j = 5;
        int nums[] = {2,3,5};

        int result = 0;
        try{
            result = i/j;
            if(result == 0){
                throw new ArithmeticException();
            }
            //create object for throw and specify the exception as method with help of new

        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero ");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in your limit ");
        }
        catch(Exception e){
            System.out.println("Something went wrong");
        }

        System.out.println(result);
        System.out.println("bye");
    }
}