/*
Types of inheritance 

*/
//single inheritance

class Parent{
    public void show (){
        System.out.println("Parent class");
    }
}

class Child extends Parent{
    public void print(){
        System.out.println("Child class");
        }
}


// multi level inheritance --> 

/*
Multi level inheritance 

multi level

*/
class GrandParent{
    public void gp(){
        System.out.println("Grand parent");
    }
}
class Parent extends GrandParent{
    
}

class child extends Parent{

}

//heirarchical inheritance --> 

/*
Heirachical - multiple child classes inherit once  parent class

one parent , many child
*/

class vehicle{
    public void start(){
        System.out.println("Vehicle start");
    }
}
class Car extends vehicle{
        //1st child class inherits from the parent class vehicle
}
class Bike extends vehicle{
        //2nd child class inherits from the parent vehicle    
}



//Multiple inheritance --> 

class A {
    void show() {
        System.out.println("A");
    }
}

class B {
    void show() {
        System.out.println("B");
    }
}

// class C extends A, B { }  // ❌ not allowed
