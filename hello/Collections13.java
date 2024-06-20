package hello;

import java.util.ArrayList;

public class Collections13 {
    // convert arraylist into a array
    public static void main(String [] args){
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);
        al.add(500);
        Object a[]=al.toArray();
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
