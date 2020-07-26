//Program to show the use of ‘final’ keyword.

public class final_keyword {
    public static void main(String[] args){
        final int finalvar= 14;
        finalvar=13;
        System.out.println("HERE WE FIND THAT PROGRAM THROWS COMPILATION ERROR: "+finalvar);
    }
    
}