package treesetdemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;
// this class relate to treeset main class or tree set is main class of Employee20

public class Employee20 implements Comparable<Employee20> {
    int id;
    String name;

    public Employee20(int id, String name) {//// to auto generate the constructor right click generate constructor or getter
        // and setter
        this.id = id;
        this.name = name;
    }

    //    public int compareTo(Employee20 hs) {
//
//        return this.name.compareTo(hs.name);
//    }
//    public int compareTo(Employee20 hs) {
//
//        return this.id-hs.id;
//    }
//    public int compareTo(Employee20 ts) {
//
//        return this.name.compareTo(ts.name);
//    }
    public int compareTo(Employee20 ts) {

        return this.id - ts.id;
    }
}

