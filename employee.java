//Program to implement employee class with data members i.e. name and salary and member functions i.e. getdata and showdata.
public class employee{

    int salary;
    String name;
    void setdata(int salary,String name){
        this.salary=salary;
        this.name=name;
    }
    void showdata(){
        System.out.println("NAME OF THE EMPLOYEE: "+name+" \nSALARY IS: "+salary);
    }

    public static void main(String[] args){

        employee emp1=new employee();
        emp1.setdata(100000, "palak");
        emp1.showdata();


    }
}