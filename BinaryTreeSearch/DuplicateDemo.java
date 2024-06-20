package BinaryTreeSearch;

import java.util.HashSet;
import java.util.Objects;

class Product{
    int id;
    String name;
    //hashset program
    @Override
    public boolean equals(Object o) {// generate the code right click generate click generate hashcode and equals
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;//this all code to remove duplicates
        Product product = (Product) o;
        return id == product.id && Objects.equals(name, product.name);
    }
    @Override
    public int hashCode() {// generate the code right click generate click generate hashcode and equals
        return Objects.hash(id, name);
    }

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

}
public class DuplicateDemo {
    public static void main(String [ ] args){
        HashSet<Product>hs=new HashSet<Product>();
        hs.add(new Product(141,"memeory"));
        hs.add(new Product(141,"ram"));
        hs.add(new Product(141,"motherBoard"));
        hs.add(new Product(141,"processor"));
        hs.add(new Product(141,"motherBoard"));
        for (Product x:hs){
            System.out.println(x.hashCode());
        }
        System.out.println(" ");
        for (Product x:hs){
            System.out.println(x.id+" "+x.name);
        }
    }
}
