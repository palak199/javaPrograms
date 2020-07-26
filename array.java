	


//Program to enter elements in array and display the array.
import java.util.Scanner;
public class array{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("ENTER THE SIZE OF ARRAY: ");
        int size=input.nextInt();
        int arr[];
        arr=new int[size];
        System.out.println("ENTER "+size+" ELEMENTS");
        for(int i=0;i<size;i++)
        arr[i]=input.nextInt();
        System.out.println("THE ARRAY ELEMENTS ARE: ");
        System.out.println("index value");
        for(int i=0;i<size;i++)
        System.out.println("  "+i+" =  "+arr[i]);
        input.close();
    }

}