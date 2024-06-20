package hello;
import java.util.ArrayList;
import java.util.Scanner;
// input the emp details at run time using scanner class
public class Employee3 {
    public static void main(String [] args){
        ArrayList<Employee>al=new ArrayList<Employee>();
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the details of employee");
        for (int i=0; i<3;i++) {
            System.out.println("enter the employee id");
            int empid = sc.nextInt();
            System.out.println("enter the employee name");
            String name = sc.next();
            System.out.println("enter the designation of employee");
            String desg = sc.next();
            System.out.println("enter the salary of employee");
            float salary = sc.nextFloat();
            Employee e = new Employee(empid, name, desg, salary);
            al.add(e);
        }
        for (Employee x:al){
            System.out.println(x.empid+" "+x.name+" "+x.desg+" "+x.salary);}}}
