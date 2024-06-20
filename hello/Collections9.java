package hello;
import java.util.ArrayList;
import java.util.Scanner;
//program to replace the existing with new  element
public class Collections9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        int loc;
        System.out.println("enter the location of existing element");
        loc = sc.nextInt();
        if (loc >= 0 && loc < al.size()) {
            System.out.println("enter the new element");
            int x = sc.nextInt();
            al.set(loc, x);
            System.out.println(al);
        } else {
            System.out.println("invalid index");}}}
