package treesetdemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetWithClass {
    public static void main(String[] args) {
        HashSet<Employee20> hs = new HashSet<Employee20>();
        hs.add(new Employee20(212, "ranjeet"));
        hs.add(new Employee20(211, "kapil"));
        hs.add(new Employee20(209, "anil"));
        hs.add(new Employee20(210, "rohit"));
        hs.add(new Employee20(213, "dheraj"));

        for (Employee20 x : hs)
            System.out.println(x.id + " " + x.name);

        System.out.println(" ");

        ArrayList<Employee20> a1 = new ArrayList<Employee20>(hs);
        for (Employee20 x : a1)
            System.out.println(x.id + " " + x.name);

        System.out.println(" ");

        TreeSet<Employee20> ts = new TreeSet<Employee20>(hs);
        for (Employee20 x1 : ts)
            System.out.println(x1.id + " " + x1.name);

        System.out.println(" ");

        System.out.println(hs.hashCode());

        System.out.println(" ");

        for (Employee20 x2 : ts)
            System.out.println(x2.hashCode());

    }
}
