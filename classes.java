/*
class - 
car - blue print of it - including all properties and methods

*/
class Car{

    //class_name should always start with Uppercase

    String color;
    public void drive(){
        System.out.println("Car is driving");
    }
}

class Demo{
    public static void main(String args[]){
        //obj creation syntax class name obj = new class ()
        Car c1 = new Car();
        c1.color = "red";
        System.out.println(c1.color);
        //defining and accesing the color property  - to "red"
        c1.drive();
        //accessing the drive() method through (.) operator
    
    }
}