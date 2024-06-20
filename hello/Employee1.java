package hello;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class Employee1 {
    public static void main(String[] args){
//        ArrayList<Employee>ell=new ArrayList<Employee>();
//        Employee el1=new Employee(123,"RAHUL","ANALIST",45000.0f);
//        Employee el2=new Employee(123,"sachin","developer",44000.0f);
//        Employee el3=new Employee(123,"mango","admin",43000.0f);
//        ell.add(el1);
//        ell.add(el2);
//        ell.add(el3);
        //another way
        ArrayList<Employee>ell=new ArrayList<Employee>();
        ell.add(new Employee(123,"RAHUL","ANALIST",45000.0f));
        ell.add(new Employee(123,"sachin","developer",44000.0f));
        ell.add(new Employee(123,"mango","admin",43000.0f));
        //with for loop
        for (int i=0;i<ell.size();i++){
            Employee e=ell.get(i);
            System.out.println(e.empid+" "+e.desg+" "+e.name+" "+e.salary);
        }
        //with for loop reverse
        for (int i=ell.size()-1;i>=0;i--){
            Employee e= ell.get(i);
            System.out.println(e.empid+" "+e.desg+" "+e.name+" "+e.salary);
        }
        // for each loop
        for (Employee x:ell){
            System.out.println(x.empid+" "+x.desg+" "+x.name+" "+x.salary);
        }
        // with iterator
        Iterator itr=ell.iterator();
        while(itr.hasNext()){
            Employee e=(Employee) itr.next();
            System.out.println(e.empid+" "+e.desg+" "+e.name+" "+e.salary);
        }
        //ListIterator
        ListIterator itr1=ell.listIterator();
        while(itr1.hasNext()){
            Employee e=(Employee) itr1.next();
            System.out.println(e.empid+" "+e.desg+" "+e.name+" "+e.salary);
        }
        // listiterator reverse
        ListIterator itr2=ell.listIterator(ell.size());
        while(itr2.hasPrevious()){
            Employee e=(Employee) itr2.previous();
            System.out.println(e.empid+" "+e.desg+" "+e.name+" "+e.salary);}}}
