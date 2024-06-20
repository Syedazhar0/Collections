package hello;
import java.util.ArrayList;
import java.util.Scanner;
//program to display the index  value of particular  element
public class Collections8{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            ArrayList<Integer> al = new ArrayList<Integer>();
            al.add(10);
            al.add(20);
            al.add(30);
            al.add(40);
            al.add(50);
            int ele;
            System.out.println("enter the element");
            ele = sc.nextInt();
                int x= al.indexOf(ele);
                System.out.println("index number of the particular element "+ele + " is "+x);
        }
}


