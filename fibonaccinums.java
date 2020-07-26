//Program to print Fibonacci series up to first ten terms.
public class fibonaccinums{
    public static void main(String[] args){
    int arr[];
    arr=new int[10];
    arr[0]=0;
    arr[1]=1;
    for(int i=2;i<10;i++)
    arr[i]=arr[i-1]+arr[i-2];
    System.out.println("THE FIBONACCI SERIES UPTO 10 TERMS IS: ");
    for(int i=0;i<10;i++)
    System.out.print(arr[i]+" ");
    }

}