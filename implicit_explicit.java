//Program to show implicit and explicit type casting.
public class implicit_explicit {

    public static void main(String args[]){
        int num1=9;
        double cost=1.5;
        System.out.println("COST OF 1 UNIT IS "+cost);
        System.out.println("NUMBER OF UNITS "+num1);
        //illustrating how implicit type conversion converts num1 into float
        System.out.println("TOTAL COST "+cost*num1);
        //illustrating how explicit type conversion converts result of cost*num1 into int 
        System.out.println("TOTAL COST "+(int)(cost*num1));

    }
    
}