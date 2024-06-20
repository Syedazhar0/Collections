package productCoparable;

public class Product implements Comparable<Product> {

    int serialon;
    String name;
    public Product(int serialon, String name) {
        this.serialon = serialon;
        this.name = name;
    }
//    public int compareTo(Product a1){
//        return this.name.compareTo(a1.name);
//    }
    public int compareTo(Product a1){
        return this.serialon-a1.serialon;
    }
}
