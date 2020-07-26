	




//Program to print the sum of digits of a number entered by the user.
import java.util.Scanner;
public class sumofdigits{

   static int sum(int num){
        int sum=0;
        if (num==0)
        return 0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }

    public static void main(String[] args){
        System.out.print("enter a number: ");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        System.out.println("The sum of digits of "+num+"is: "+sum(num));
        input.close();
    }
}