package hello;

import java.util.ArrayList;
import java.util.Iterator;
// create pojo class to add emp details and perform certain curd ex: delete remove replace update add in the emp main class
public class EmployeeDetails {
    public static void main(String [] args){
        //ARRAYLIST  TO  STORE  THE EMPLOYEES  DETAILS
        ArrayList<Emppojo> A1 = new ArrayList<Emppojo>();

        // ADD EMPLOYEE DETAILS
        Emppojo E1 = new Emppojo();
        E1.setId(101);
        E1.setName("SYED AZHAR");
        E1.setDesg("DEVELOPER");
        E1.setSalary(5000.00f);
        E1.setLocation("HYDERABAD");
        A1.add(E1);

        Emppojo E2 = new Emppojo();
        E2.setId(201);
        E2.setName("HELLO WORLD");
        E2.setDesg("FRONTEND DEVELOPER");
        E2.setSalary(4000.00f);
        E2.setLocation("BANGALORE");
        A1.add(E2);

        // EMPLOYEE DETAILS ADDED
        int searchId = 1;
        for (Emppojo emp : A1) {
            if (emp.getId() == searchId) {
                System.out.println("Employee Details for ID " + searchId + ":");
                System.out.println("Name: " + emp.getName());
                System.out.println("Designation: " + emp.getDesg());
                System.out.println("Salary: " + emp.getSalary());
                System.out.println("Location: " + emp.getLocation());
                System.out.println();
                break;
            }
        }

        // REMOVE THE SPECIFIED EMPLOYEE DETAILS
        int removeId = 201;
        Iterator<Emppojo> iterator = A1.iterator();
        while (iterator.hasNext()) {
            Emppojo emp = iterator.next();
            if (emp.getId() == removeId) {
                iterator.remove();
                System.out.println("Employee with ID " + removeId + " removed successfully.");
                break;
            }
        }
        System.out.println("   ");

        // Updating details of a particular employee
        int updateId = 101;
        for (Emppojo emp4 : A1) {
            if (emp4.getId() == updateId) {
                emp4.setDesg("SENIOR DEVELOPER");
                emp4.setSalary(6000.00f);
                emp4.setLocation("MUMBAI");
                System.out.println("EMPLOYEE DETAILS AFTER UPDATED FOR ID " + updateId);
                break;
            }
        }
        System.out.println("   ");

        // RESULT AFTER UPDATING A PARTICULAR EMPLOYEE DETAILS
        System.out.println("UPDATED EMPLOYEE DETAILS:");
        for (Emppojo emp3 : A1) {
            System.out.println("ID: " + emp3.getId());
            System.out.println("NAME: " + emp3.getName());
            System.out.println("DESIGNATION: " + emp3.getDesg());
            System.out.println("SALARY: " + emp3.getSalary());
            System.out.println("LOCATION: " + emp3.getLocation());
            System.out.println( " ");
        }

    }

}

