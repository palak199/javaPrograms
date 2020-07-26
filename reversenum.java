
//Program to print the reverse of the number entered by the user.
import java.util.Scanner;
public class reversenum{
    static int reverse(int num){
        int sum=0,rem=0,temp=num;
        while(temp!=0){
            rem=temp%10;
            sum=sum*10+rem;
            temp/=10;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("enter the number: ");
        int num=input.nextInt();
        System.out.println("THE REVERSE OF "+num+" is " + reverse(num));
        input.close();
    }
}
