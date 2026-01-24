//OOP - object oriented programming 
/*
classes
objects
inheritance
polymorphism
data encapsulatioon
data abstraction

*/

//classes 
class Keyboard{
    //these are properties of keyboard - using variables
    int keys = 100;
    String color = "White";

    //methods --> behaviour of keyboards using function /methods

    public void pressed(){
        System.out.println("Signal sent" + color);
    }

    public void throwit(){
        System.out.println("got hit");
        keys = 85;
    }
}
class AdvKeyboard extends Keyboard
{
    public void hitnum(){
        System.out.println("sent number");
    }
}

// main class of java - to include the main void main  function 
class Demo{

    //main function - of java where there will be method call and property call
    public static void main(String args[]){

        //this is simple variable declared and defined with a value
        int num;
        num = 8;

        //same way object - reference variable should be created - with its own classname datatype
        AdvKeyboard obj; // object not created yet - just created a reference variable

        //JVM will create the object
        obj = new AdvKeyboard();

        //call the methods
        obj.pressed();
        obj.throwit();
        obj.hitnum();

        System.out.println(obj.keys);        

    }
}