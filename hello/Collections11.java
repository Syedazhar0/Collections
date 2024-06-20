package hello;
import java.util.ArrayList;
import java.util.Scanner;
public class Collections11 {
    public static void main(String[] args) {
        // merge the two arrays
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);
        al.add(500);
        System.out.println(al);
        ArrayList<Integer> al1 = new ArrayList<Integer>();
        al1.add(10);
        al1.add(20);
        al1.add(10);
        al1.add(40);
        al1.add(50);
        System.out.println(al1);
        al.addAll(al1);
        System.out.println(al);
    }
}
