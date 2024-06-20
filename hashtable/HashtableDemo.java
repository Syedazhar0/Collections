package hashtable;

import java.util.Hashtable;

public class HashtableDemo {
    public static void main(String [] args){
        Hashtable<String,Float>ht=new Hashtable<String,Float>();
        ht.put("rahul",456.00f);
        ht.put("sachin",456.00f);
        ht.put("dhoni",456.00f);
        ht.put(null,456.00f);//it will gives null pointer exception because it will not allow null values

        System.out.println(ht.get("rahul"));
        System.out.println(ht.get("rahim"));
    }
}
