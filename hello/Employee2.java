package hello;

import java.util.ArrayList;

public class Employee2 {
    //create employee object by collecting the details from arrays
    public static void main(String [] args){
        ArrayList<Employee> ell=new ArrayList<Employee>();
        int empid[]={10,11,12,13};
        String name []={"karthik","anil","sujeeth","srujan"};
        String desg []={"analyst","developer","tester","developer"};
        float salary []={25000,75000,35000,100000};
        for (int i=0; i<empid.length;i++){
            Employee e=new Employee(empid[i],name[i],desg[i],salary[i] );
            ell.add(e);
        }
        for (Employee x:ell){
            System.out.println(x.empid+" "+x.name+" "+x.desg+" "+x.salary);
        }}}
