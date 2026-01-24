/*
Inheritance - 
child class inherits properties and methods from its parent class
*/
class Vehicle{
    public void start(){
        System.out.println("Vehicle starts");
    }
}
class Bike extends Vehicle{
    public void ride(){
        System.out.println("Bike is riding");
    }
}
class Demo{
    public static void main(String args[]){
        Bike b1 = new Bike();
        b1.start();
        b1.ride();
    }
}