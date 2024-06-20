package hello;

import java.util.ArrayList;
import java.util.Scanner;

public class Collections12 {
    public static void main(String[] args) {
        // create a clone array of existing array
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);
        al.add(500);
        ArrayList<Integer> al1 = (ArrayList<Integer>) al.clone();
        System.out.println(al1);
    }
}
