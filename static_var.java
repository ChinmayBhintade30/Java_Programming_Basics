/*
JVM - heap memory 
JDK , JRE -->

heap memory 
stack memory

*/
/*
Method overriding - polymorphism 


*/
class Keyboard{
    int keys;
    String color;
    static String brand = "google";

    public void pressed(){
        System.out.println("Signal sent" + color);
    }

    public void throwIt(){
        System.out.println("Got hit");
        keys = 85;
    }
}

class AdvKeyboard extends Keyboard{
    //sub class - advkeyboard inherits from Keyboard

    //throwIt() is same function /method name which overrides the function in Keyboard
    public void throwIt(){
        System.out.println("Got hit hard");
        
    }
}

class Demo{
    public static void main(String args[]){
        int num = 9;
        Keyboard obj = new AdvKeyboard(); // what obj you pass
// overriding depends on the object creation - of which class the object is created

        obj.pressed();
        obj.throwIt();
        // here throwIt() method --> from AdvKeyboard is executed or called 

        //function throwIt() from Advkeyword - overrides the method in Keyboard class
        System.out.println(Keyboard.brand);
        //static variable can be directly accessed via class name Keyboard.brand
    }
}