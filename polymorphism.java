/*
Polymorphism --> it has compile time(over loading ) and run - time (function overriding)

compile time polymorphism - function over loading


Run time polymorphism - function overriding

*/

class Mathop{
    int add(int a , int b ){
        return a+b;
    }
    

    int add(int a , int b , int c){
        return a + b + c;
    }
}

//function overriding 

class Animal{
    void sound(){
        System.out.println("Animal sound");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("Barks");
    }
}