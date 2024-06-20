package hello;

import java.util.ArrayList;
import java.util.Scanner;
//write a java program to perform array list operations such as append insert update
// remove reverse and display on a given class called student
public class Student {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Studentpojo> a1=new ArrayList<Studentpojo>();
        System.out.println("enter the student details");
        for (int i=0;i<2;i++){
            int rollno=sc.nextInt();
            String name= sc.next();
            float marks= sc.nextFloat();
            char grade=sc.next().charAt(0);
            Studentpojo e= new Studentpojo();
            e.setRollno(rollno);
            e.setName(name);
            e.setMarks(marks);
            e.setGrade(grade);
            a1.add(e);// add the elements into arraylist
        }
        ArrayList<Studentpojo> a2=new ArrayList<Studentpojo>();
        System.out.println("enter the student details");
        for (int i=0;i<2;i++) {
            int rollno = sc.nextInt();
            String name = sc.next();
            float marks = sc.nextFloat();
            char grade = sc.next().charAt(0);
            Studentpojo e = new Studentpojo();
            e.setRollno(rollno);
            e.setName(name);
            e.setMarks(marks);
            e.setGrade(grade);
            a2.add(e);//add the elements into a2 arraylist
        }
        a2.addAll(a1);//step 1 append completed means now add the a1 arraylist elements into a2 arraylist and display
        System.out.println("before insertion");
        for (int j = 0; j<a2.size(); j++) {
            Studentpojo e2 = a2.get(j);
            System.out.println("[" + e2.getRollno() + " " + e2.getName() + " " + e2.getMarks() + " " + e2.getGrade() + "]");
        }
        // insert new element into existing arraylist
        System.out.println("enter location");
        int loc=sc.nextInt();
        if(loc>=0&&loc< a1.size()) {
            System.out.println("enter the elements which you want to insert");
            int rollno = sc.nextInt();
            String name = sc.next();
            float marks = sc.nextFloat();
            char grade = sc.next().charAt(0);
            Studentpojo e = new Studentpojo();
            e.setRollno(rollno);
            e.setName(name);
            e.setMarks(marks);
            e.setGrade(grade);
            a2.add(loc,e);
            System.out.println("after insertion");
            for (int j = 0; j < a2.size(); j++) {
                Studentpojo e2 = a2.get(j);
                System.out.println("[" + e2.getRollno() + " " + e2.getName() + " " + e2.getMarks() + " " + e2.getGrade() + "]");
            }
        }
        System.out.println("  ");
        //step 3 reverse print the arraylist elements into reverse order
        System.out.println(" in reverse order");
        for (int j = a2.size()-1; j>=0;j--) {
            Studentpojo e2 = a2.get(j);
            System.out.println("[" + e2.getRollno() + " " + e2.getName() + " " + e2.getMarks() + " " + e2.getGrade() + "]");
        }

        //step 4: update: update the name or roll_no or name or ... ex:name hello updated name hello_world
        System.out.println(" ");
        System.out.println("after updating the name of a student");
        for(int j=0;j< a2.size();j++){
            Studentpojo e2 = a2.get(j);
            if (e2.getName().equals("athar"))
                e2.setName("syed_athar");
            System.out.println("[" + e2.getRollno() + " " + e2.getName() + " " + e2.getMarks() + " " + e2.getGrade() + "]");
        }
        // this loop to remove the specified student details
        for (int j = 0; j < a2.size(); j++) {
            Studentpojo e2 = a2.get(j);
            if (e2.getRollno()==101) {
                a2.remove(j);
            }
        }
        System.out.println(" ");
        System.out.println("after removing the name of a student");
        for (int j = 0; j < a2.size(); j++) {
            Studentpojo e2 = a2.get(j);
            System.out.println("[" + e2.getRollno() + " " + e2.getName() + " " + e2.getMarks() + " " + e2.getGrade() + "]");
        }
    }
}