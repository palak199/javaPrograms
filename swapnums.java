//Program to swap two numbers input by the user without using third variable.
import java.util.Scanner;
public class swapnums{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1=input.nextInt();
        System.out.print("Enter second number: ");
        int num2=input.nextInt();
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("the first number afer swapping is "+num1);
        System.out.println("the second number afer swapping is "+num2);
        input.close();


    }
}