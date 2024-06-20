package hello;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;
// input the data until your choice is yes if you choose no  the loop will exit
// using bufferedreader
public class Employee5 {
    public static void main(String [] args) throws IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = null;
        ArrayList<Employee> a1 = new ArrayList<Employee>();
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter the details of employee");
            while (true) {
                System.out.println("enter the employee id");
                int empid = Integer.parseInt(br.readLine());
                System.out.println("enter the employee name");
                String name = br.readLine();
                System.out.println("enter the designation of employee");
                String desg = br.readLine();
                System.out.println("enter the salary of employee");
                float salary = Float.parseFloat(br.readLine());
                Employee e = new Employee(empid, name, desg, salary);
                a1.add(e);
                System.out.println("do you want to continue ?");
                char ch = (char) br.read();
                if (ch == 'n')
                    break;}
            for (Employee x : a1)
                System.out.println(x.empid + " " + x.name + " " + x.desg + "" + x.salary);
        }finally{
                if (br != null) {
                    br.close();}}}}
