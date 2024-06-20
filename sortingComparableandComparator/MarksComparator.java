package sortingComparableandComparator;

import java.util.Comparator;

public class MarksComparator implements Comparator {
    public int compare(Object o1,Object o2){
        SortingStudentsDetails s1=(SortingStudentsDetails) o1;
        SortingStudentsDetails s2=(SortingStudentsDetails) o2;
        if (s1.marks>s2.marks){
            return 1;
        }else
            return -1;
    }
}
