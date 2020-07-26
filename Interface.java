	
//Program to create an interface and implement it using class.
interface Animals {
    public void sound(); 
    
  }
  
  class Dogg implements Animals {
    public void sound() {
      System.out.println("The dog barks");
    }
   
  }
  
 public class Interface {
    public static void main(String[] args) {
      Dogg myDog = new Dogg();  
      myDog.sound();

    }
  }