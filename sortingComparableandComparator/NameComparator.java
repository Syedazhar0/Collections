package sortingComparableandComparator;

import java.util.Comparator;

public class NameComparator implements Comparator {
    public int compare(Object O1, Object O2) {
        SortingStudentsDetails s1 = (SortingStudentsDetails) O1;
        SortingStudentsDetails s2 = (SortingStudentsDetails) O2;
            return s1.name.compareTo(s2.name);
        }
    }



