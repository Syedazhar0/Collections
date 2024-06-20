package hello;
import java.util.ArrayList;
import java.util.Scanner;
public class Employee6pojo_1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee6pojo> a1=new ArrayList<Employee6pojo>();
        for (int i=0;i<6;i++){
            System.out.println("enter the employee details");
            int id=sc.nextInt();
            String name=sc.next();
            float salary =sc.nextFloat();
            int deptno=sc.nextInt();
            String location=sc.next();
             Employee6pojo e= new Employee6pojo();
             e.setId(id);
             e.setName(name);
             e.setSalary(salary);
             e.setDeptno(deptno);
             e.setLocation(location);
             a1.add(e);
        }
        for (int i=0;i<a1.size();i++){
            Employee6pojo e=a1.get(i);
            System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary()+" "+e.getDeptno()+" "+e.getLocation()+" ");
        }
        //employee details with id :103
       /* for (Employee6pojo x:a1){
            if (x.getId()==103){
                System.out.println(x.getId()+" "+x.getName()+" "+x.getSalary()+" "+ x.getDeptno()+" "+x.getLocation());
            }
        }

        */
        //display the employee details who belonging to hyderabad
       /* for (Employee6pojo x:a1){
            if (x.getLocation().equals("hyd")){
                System.out.println(x.getId()+" "+x.getName()+" "+x.getSalary()+" "+ x.getDeptno()+" "+x.getLocation());
            }
        }*/
        //employee belongs to department 20 and 30
       /* for (Employee6pojo x:a1){
            if (x.getDeptno()==20||x.getDeptno()==30){
                System.out.println(x.getId()+" "+x.getName()+" "+x.getSalary()+" "+ x.getDeptno()+" "+x.getLocation());
            }
        }*/
        //employee details who does not belong to hyd
        /*for (Employee6pojo x:a1){
            if (!(x.getLocation().equals("hyd"))){
                System.out.println(x.getId()+" "+x.getName()+" "+x.getSalary()+" "+ x.getDeptno()+" "+x.getLocation());
            }
        }*/
        //employe details who belong to department 20 but does not belong hyderabad
        /*for (Employee6pojo x:a1){
            if (!(x.getLocation().equals("hyd")&&x.getDeptno()==20)){
                System.out.println(x.getId()+" "+x.getName()+" "+x.getSalary()+" "+ x.getDeptno()+" "+x.getLocation());
            }
        }*/
        //count of employee working in hyderabad and bangalore
        /*int count=0;
        for (Employee6pojo x:a1){
            if (x.getLocation().equals("hyd")||x.getLocation().equals("bangalore")){
                count++;
                System.out.println(x.getId()+" "+x.getName()+" "+x.getSalary()+" "+ x.getDeptno()+" "+x.getLocation());
            }
        }
        if (count==0){
            System.out.println("no such record exists");
        }else
            System.out.println("number of employee exists "+count);*/
        // check weather the name dravid present or not
        /*boolean found=false;
        for (Employee6pojo x:a1){
            if (x.getName().equals("dravid")){
                found=true;
                break;
            }
        }
        if (found)
            System.out.println("record exist with the name");
        else
            System.out.println("no such record found ");*/
        // display the employee details who's salary is greater than 30000
        /*for (Employee6pojo x:a1){
            if (x.getSalary()>30000){
                System.out.println(x.getId()+" "+x.getName()+" "+x.getSalary()+" "+ x.getDeptno()+" "+x.getLocation());
            }
        }*/
        //employee details whose salary between 30000 to 40000
       /* for (Employee6pojo x:a1){
            if (x.getSalary()>=30000&&x.getSalary()<40000){
                System.out.println(x.getId()+" "+x.getName()+" "+x.getSalary()+" "+ x.getDeptno()+" "+x.getLocation());
            }
        }*/
//        for (Employee6pojo x:a1){
//            if (x.getSalary()<30000&&!(x.getLocation().equals("hyd"))){
//                System.out.println(x.getId()+" "+x.getName()+" "+x.getSalary()+" "+ x.getDeptno()+" "+x.getLocation());
//            }
//        }
        //write a java program to perform the following operations such as adding the employee
        // details into a arraylist displaying of specific
        // id removing particular employee details  updating the details of particular employee
    }
}
