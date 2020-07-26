
//Program to illustrate the concept of default and parameterized constructors.
public class constructor_types {

    int var;
    constructor_types(){
        System.out.println("DEFAULT CONSTRUCTOR CALLED");
        var=0;

    }  

    constructor_types(int var){
        System.out.println("PARAMETERIZED CONSTRUCTOR CALLED");
        this.var=var;
        System.out.println("VALUE OF object variable SET TO: " +var);
        
    }
    public static void main(String[] args){

        constructor_types obj1=new constructor_types();
        constructor_types obj2=new constructor_types(19);
    }
}