/*
Heirarchical inheritance - java example
*/
class Animal{
    public void sound(){
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal{
    public void Bark(){
        System.out.println("Dog barks");
    }
}

class Cat extends Animal{
    public void Meow(){
        System.out.println("Cat does meow");
    }
}

class AnimalMain{
    public static void main(String args[]){
        Dog d = new Dog();
        d.sound(); //parent method
        d.Bark(); //child class method dog method


        Cat c = new Cat();
        c.sound();
        c.Meow();
    }
}