/*
Method overriding - polymorphism 


*/
class Keyboard{
    int keys;
    String color;

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
        Keyboard obj;
        obj = new AdvKeyboard(); // what obj you pass
// overriding depends on the object creation - of which class the object is created

        obj.pressed();
        obj.throwIt();
        // here throwIt() method --> from AdvKeyboard is executed or called 

        //function throwIt() from Advkeyword - overrides the method in Keyboard class
    }
}