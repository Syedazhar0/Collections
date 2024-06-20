package hello;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;
public class Collections10 {
    //access the elements using the for loop
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);
        al.add(500);
        for (int i=al.size()-1;i>=0;i--){
            System.out.print(al.get(i));
        }
        System.out.println(" ");
        //access the elements using the for each loop
        for (Integer x:al){
            System.out.print(x);//forward direction
        }
        System.out.println(" ");
        //access the elements using iterator interface
        Iterator<Integer>lit= al.iterator();
        while(lit.hasNext()){
            System.out.print(lit.next());}
        System.out.println(" ");
// access the elements using ListIterator interface
        ListIterator<Integer> litrr=al.listIterator();
        while (litrr.hasNext()){
            //forward direction
            System.out.print(litrr.next());}
        System.out.println(" ");
        //backward direction
        ListIterator<Integer> litr1=al.listIterator(al.size());
        while (litr1.hasPrevious()){
            //backward direction
            System.out.print(litr1.previous());}
        System.out.println(" ");
        //access the element at particular index
       // forward direction
        ListIterator<Integer> lit2= al.listIterator(2);
        while (lit2.hasNext()){
            //forward direction
            System.out.print(lit2.next());
        }
        System.out.println(" ");
        //backward direction
        ListIterator<Integer> lit3= al.listIterator(3);
        while(lit3.hasPrevious()){
            System.out.print(lit3.previous());
        }}}