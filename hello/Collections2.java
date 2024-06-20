package hello;

import java.util.ArrayList;

public class Collections2 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        if (al.isEmpty())
            System.out.println("List is empty");
        else
            System.out.println("List is not empty");

    }
}
