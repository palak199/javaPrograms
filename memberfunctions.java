	
//Program to create a class and call member functions.

public class memberfunctions{

    void greet(String name){
        System.out.println("Hello "+name);
    }

    public static void main(String[] args){
        memberfunctions obj1=new memberfunctions();
        obj1.greet("PALAK");
    }
}