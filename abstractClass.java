	
//Program to demonstrate the concept of method overloading.
abstract class animal{
    abstract void sound();
}
class dog{
    void sound(){
        System.out.println("DOGS BARK");
    }
}
public class abstractClass {

    public static void main(String[] args){
        dog mydog=new dog();
        mydog.sound();
    }
    
}