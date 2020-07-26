	
//Program to illustrate the use ‘super’ keyword in inheritance.
  class Animal { 
  public void animal() {
    System.out.println("The animal makes a sound");
  }
}

class Dog extends Animal { 
  public void animal() {
    super.animal(); // Call the superclass method
    System.out.println("The dog barks");
  }
}

public class super_keyword {
  public static void main(String args[]) {
    Animal myDog = new Dog(); 
    myDog.animal(); 
  }
}
    
