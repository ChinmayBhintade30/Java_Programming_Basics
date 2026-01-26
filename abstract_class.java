/*
abstract class - solves by creating a upper layer


*/
class Computer{
    public void compiler()
    {
        
}
}

class Desktop extends Computer{
    public void compiler(){
        System.out.println("compiling faster");
    }
}

class Laptop extends Computer{
    public void compiler(){
        System.out.println("compiling");
      
    }
}

class Dev{
    public void code(Computer lap){
        System.out.println("Coding");
        lap.compiler();
    }
}
class Demo{
    public static void main(String args[]){
        Computer lap = new Laptop();

        Computer desk1 = new Desktop();
        Dev dev1 = new Dev();
        dev1.code(desk1);
        dev1.code(lap);
    }
}