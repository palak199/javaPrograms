//Program to find the largest of three numbers using conditional statement.
import java.util.Scanner;
public class largest{
    public static void main(String[] args){
        int max=0;
        Scanner input=new Scanner(System.in);
        System.out.print("enter first number: ");
        int num1=input.nextInt();
        System.out.print("enter second number: ");
        int num2=input.nextInt();
        System.out.print("enter third number: ");
        int num3=input.nextInt();
        if(num1>num2){
            if(num3>num1)
            max=num3;
            else max=num1;
        }
        else{
            if(num3>num2)
            max=num3;
            else max=num2;
        }
        System.out.print("LARGEST NUMBER IS "+ max);
        input.close();

    }


}