	
//Program to demonstrate the concept of method overloading.

public class methodoverloadig {

    void addnums(int a,int b){
        System.out.println("sum of two numbers is "+(a+b));
    }
    void addnums(int a,int b,int c){
        System.out.println("sum of two numbers is "+(a+b+c));
    }
    public static void main(String[] args){
        methodoverloadig obj=new methodoverloadig();
        obj.addnums(2,4,7);
    }

    
}