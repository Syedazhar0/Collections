package HashSetDemo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet0 {
    public static void main(String [] args){
        HashSet<Integer>hs=new HashSet<Integer>();
        hs.add(10);//it does not maintain sorting order
        hs.add(20);
        hs.add(30);
        hs.add(40);
        hs.add(50);
        //System.out.println(hs);
//        hs.clear();
//        System.out.println(hs);
        HashSet<Integer>hs1=(HashSet<Integer>) hs.clone();
        System.out.println(hs1);
        if(hs.contains(500))
            System.out.println("exists");
        else
            System.out.println("does not exist");
        if(hs.isEmpty())
            System.out.println("Empty");
        else
            System.out.println("no empty");
        Iterator<Integer>itr= hs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
       hs.remove(40);
        System.out.println(hs);
        System.out.println(hs.size());

    }
}
