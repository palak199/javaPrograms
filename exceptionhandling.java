import java.util.Scanner;

public class exceptionhandling {
	
    //Program to demonstrate the concept of exception handling.
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int x,y,div;
        System.out.println("ILLUSTRATING THE EXCEPTION HANDLING");
        System.out.println("ENTER TWO NUMBERS TO DIVIDE: ");
        x=input.nextInt();
        try{
            y=input.nextInt();
            div=x/y;
        }catch(ArithmeticException e){System.out.println(e);}  
   //rest code of the program   
   System.out.println("yes the program didn't crash"); 
   input.close();
    }
    
}