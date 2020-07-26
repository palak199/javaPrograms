//illustrating use of java package java.util
//Program to illustrate the concept of packages.
import java.util.Scanner;
public class PackageUse {

public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.println("ILLUSTRATING USE OF PACKAGES! enter your name: ");
    String str=input.nextLine();
    System.out.println("HI, "+str );
    input.close();


}
}