	
//Program to demonstrate the concept of inheritance.
class animals{
    void sound(){
        System.out.println("animals make noise");
    }
}
class dogs extends animals{
    void sound(){
        System.out.println("dogs bark");
    }
}


public class inheritance {
    public static void main(String[] args){
        dogs mydog=new dogs();
        mydog.sound();
    }
    
}