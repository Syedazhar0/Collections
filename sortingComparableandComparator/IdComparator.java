package sortingComparableandComparator;

import java.util.Comparator;

public class IdComparator implements Comparator {
    public int compare(Object o1,Object o2){
        SortingStudentsDetails s1=(SortingStudentsDetails) o1;
        SortingStudentsDetails s2=(SortingStudentsDetails) o2;
        if (s1.id>s2.id){
            return 1;
        }else
            return -1;
    }
}


