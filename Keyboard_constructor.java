/*
constructor - 

keyboard class having a constructor named keyboard

encapsulation --> 
the outside member of class should not able to access the members or variables directly 

So assign private variables to keys and color



*/
class keyboard{
    private int keys;
    private String color;
    //variables / attributes
    
    // create a method which will fetch the value and set the value - 
   
        //also we can make the int k in setkeys as keys - because it will be local variables and 
        //int keys in class keyboard - will be instance variable
    

    public keyboard(){
        //constructor
        keys = 100;
        color = "White";
    }


    public int getkeys(){
        return keys;
    }

    public void setkeys(int keys){
        this.keys = keys;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }



    public void pressed(){
        System.out.println("Signal sent " + color);
    }
    public void throwIt(){
        System.out.println("got hit");
        keys =85;
}


}
class Demo{
    public static void main(String args[]){
        Keyboard obj;
        obj =  new Keyboard();

        obj.pressed();
        obj.throwIt();

        obj.setColor(color:"Black");
        // set color --> obj pass color attribute as black

        System.out.println(obj.getkeys());
        //we are getting the keys as using getkeys() - obj.getkeys()

    }
}