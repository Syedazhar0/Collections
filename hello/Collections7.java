package hello;
import java.util.ArrayList;
import java.util.Scanner;
//pro to check weather the list contains element or no
public class Collections7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        int ele;
        System.out.println("enter the element to check");
        ele = sc.nextInt();
        if (al.contains(ele)) {
            System.out.println(ele + "exist int the arraylist");
        }else
            System.out.println(ele+"does not exist");
    }
}
