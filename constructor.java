/*
Constructor - function which has same name as class name
gets called automatic as object gets created
- no return type
used to initialize the object
*/
class Student{
    int id;
    String name;


    public Student(int i, String n){
        //constructor
        id = i;
        name = n;
    }
}
class Main{
    public static void main(String args[]){
        Student s1 = new Student(1, "chinmay");
        System.out.println(s1.id + " " + s1.name);
    }
}