//Program to illustrate the concept of ‘this’ pointer.
public class this_ptr {

    int x;
    this_ptr(int k){
        this.x=k;
    }
    public static void main(String[] args){
        System.out.println("ILLUSTRATING THE USE OF THIS KEWORD");
        this_ptr obj1=new this_ptr(10);
        System.out.println("value assigned using this keyword "+obj1.x);
    }
    
}
