package hello;
import java.util.ArrayList;
import java.util.Scanner;
public class Collections6 {
    //write a java program to remove the index element
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);
        al.add(500);
        int loc;
        System.out.println("enter the location");
        loc = sc.nextInt();
        if (loc >= 0 && loc < al.size()) {
            al.remove(loc);
            System.out.println(al);
        }else
            System.out.println("invalid index");}}
