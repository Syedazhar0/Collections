package hello;
import java.util.ArrayList;
import java.util.Scanner;
// input the data until your choice is yes if you choose no  the loop will exit
public class Employee4 {
    public static void main(String[] args) {
        ArrayList<Employee> al = new ArrayList<Employee>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the details of employee");
        while (true) {
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
            System.out.println("do you want to continue ?");
            String choice = sc.next();
            if (choice.equals("no"));
            break;}
        for (Employee x : al) {
            System.out.println(x.empid + " " + x.name + " " + x.desg + " " + x.salary);}}}
