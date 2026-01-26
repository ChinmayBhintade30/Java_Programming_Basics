/*
Access modifiers -->
1.Public
2.Private
3. protected
4. default
*/

//public access modifier

class Main{
    public static void main(String args[]){

    
    public int x = 10;

    public void show(){
        System.out.println(x);
    }
}
}

//Protected access modifiers -> used inheritance

class Parent{
    protected int x = 10;

}
class child extends Parent{
    void display(){
        System.out.println(x);  
    }
}


