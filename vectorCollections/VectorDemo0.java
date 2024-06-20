package vectorCollections;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo0 {
    public static void main(String [] args){
        Vector<Integer>v =new Vector<Integer>();
        v.addElement(10);
        v.addElement(20);
        v.addElement(40);
        v.addElement(30);
        v.addElement(50);
        v.addElement(60);
        System.out.println(v);
        Enumeration<Integer> e=v.elements();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
        System.out.println(v.elementAt(2));

        System.out.println(v.firstElement());

        System.out.println(v.lastElement());

        System.out.println(v.size());

        System.out.println(v.capacity());

        v.removeElement(20);
        System.out.println(v);

        v.removeElement(0);
        System.out.println(v);

        v.removeAllElements();
        System.out.println(v);
    }
}
