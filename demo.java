 //when it comes to full code - we have to write multiple lines of code
class Demo{
    public static void main (String args[]){
        int num = 5;
        double d = 9.6;
        float f = 8.5f;
        long l  = 54635;
        char c = 'A';
        // all these are called primitive type of data
        // and container associated with are variables

        //System.out.println("Hello world"); 
        System.out.println(num + d); // but this will print actual 5 + 9.6 as both are 
        //one kind of numbers - nuemeric/ float --> which adds them 

        //but we dont want to add this - It works on different way what data are you provided 

        //Polmorphic thing --> behaves like - what data did you provided
        System.out.println(num + " " + d);




        show();
        //function_name - function call - using name it calls the function in the main code 

    }

// another method created inside the same class Demo 

// one method can be called by using another -->

//using main or void main We can call the void show method 
// function defn - access modifier datatype func_name() { }

    public static void show()
    {
        System.out.println("in show");
    }
}





























//for running the code - you mention

//javac Demo.java(filename.java)
// java class_name




