package sortingComparableandComparator;
import java.util.*;
import java.util.ArrayList;
import java.util.Collection;

public class StudentMain {

    public static void main(String [] args){
        ArrayList<SortingStudentsDetails>a1=new ArrayList<SortingStudentsDetails>();
        a1.add(new SortingStudentsDetails(117,"sachin","cse",2,456.00f));
        a1.add(new SortingStudentsDetails(121,"srujan","it",3,455.00f));
        a1.add(new SortingStudentsDetails(118,"anil","ece",4,450.00f));
        a1.add(new SortingStudentsDetails(119,"dheeraj","eee",6,440.00f));
        a1.add(new SortingStudentsDetails(120,"karthik","ai",1,430.00f));
        // check one after another
        //Collections.sort(a1,new NameComparator());
        //Collections.sort(a1,new MarksComparator());
         Collections.sort(a1,new IdComparator());
        for(SortingStudentsDetails x:a1)
            System.out.println(x.id+" "+x.name+" "+x.branch+" "+x.depno+" "+x.marks);}}
