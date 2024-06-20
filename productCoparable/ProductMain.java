package productCoparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ProductMain {
    public static void main(String [] args){
        ArrayList<Product>a1=new ArrayList<Product>();
        a1.add(new Product(135,"pen"));
        a1.add(new Product(133,"pencil"));
        a1.add(new Product(134,"Sharpner"));
        a1.add(new Product(131,"scale"));
        a1.add(new Product(132,"eraser"));

        Collections.sort(a1);
        for (Product x:a1){
            System.out.println(x.serialon+" "+x.name);
        }

    }
}
