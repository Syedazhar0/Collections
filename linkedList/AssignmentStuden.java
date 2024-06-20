package linkedList;

import java.util.LinkedList;

public class AssignmentStuden {
    public static void main(String[] args) {
        LinkedList<Assignmentpojostudent> ll = new LinkedList<Assignmentpojostudent>();
        Assignmentpojostudent e = new Assignmentpojostudent();
        e.setId(101);
        e.setName("azhar");
        e.setMarks(100);
        Assignmentpojostudent e2 = new Assignmentpojostudent();
        e2.setId(102);
        e2.setName("syed");
        e2.setMarks(110);
        Assignmentpojostudent e3 = new Assignmentpojostudent();
        e3.setId(103);
        e3.setName("hello");
        e3.setMarks(120);
        ll.add(e);
        ll.add(e2);
        ll.add(e3);
        Assignmentpojostudent e1;
        System.out.println("student details");
        for (int i = 0; i < ll.size(); i++) {
            e1 = ll.get(i);
            System.out.println(e1.getId() + " " + e1.getName() + " " + e1.getMarks());
        }
        System.out.println(" ");
        if (ll.contains(e2)) {
            System.out.println("exist");
        } else {
            System.out.println("does not exist");
        }
        System.out.println(" ");
        System.out.println("finding the student with specific id number");
        for (int i = 0; i < ll.size(); i++) {
            e1 = ll.get(i);
            if (e1.getId() == 103) {
                System.out.println("found");
                System.out.println(e1.getId() + " " + e1.getName() + " " + e1.getMarks());
                break;
            } else
                System.out.println(" not found");
        }
        System.out.println(" adding the student at the end of the linked list");
        for (int i = 0; i < ll.size(); i++) {
            e1 = ll.get(i);
            if (e1.getId() == 103) {
                ll.addLast(e2);
                break;
            }
        }
        System.out.println("  ");
        System.out.println("student list after adding a student at last");
        for (int i = 0; i < ll.size(); i++) {
            e1 = ll.get(i);
            System.out.println(e1.getId() + " " + e1.getName() + " " + e1.getMarks());
        }

        System.out.println(" student removed ");
        for (int i = 0; i < ll.size(); i++) {
            e1 = ll.get(i);
            if (e1.getName().equals("azhar")) {
                ll.remove(i);
            }

        }
        System.out.println(" ");
        for (int i = 0; i < ll.size(); i++) {
            e1 = ll.get(i);
            System.out.println(e1.getId() + " " + e1.getName() + " " + e1.getMarks());
        }
        System.out.println(" ");
        System.out.println("number of students present in linked list are :"+ll.size());
    }

}
