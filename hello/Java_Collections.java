package hello;
import java.util.ArrayList;
public class Java_Collections{
    public static void main(String[]args){
//collections without generic
        ArrayList a =new ArrayList();
        a.add(1234);
        a.add("azhar");
        a.add(45000.00);
        System.out.println(a);
// collections with generics
        ArrayList <Integer> a1 =new ArrayList<Integer>();
        a1.add(12);
        a1.add(20);
        //a1.add("AZ");//ERROE NEVER TRY TI ADD ANOTHER DATA TYPE ONCE YOU DEFINE GENERIC HERE YOU CAN ADD
        // ONLY INT DATA TYPE OBJ
        System.out.println(a1);

        //COLLECTION WITH GENERIC OBJECT
        ArrayList <Object> a2 =new ArrayList<Object>();
        a2.add(123);
        a2.add("azhar");
        a2.add(345.5F);
        System.out.println(a);
        //DOWN CASTING
        Integer i =(Integer) a2.get(0);
        System.out.println(i);
        String s =(String) a2.get(1);
        System.out.println(s);
        Float f =(Float) a2.get(2);
        System.out.println(f);}
}