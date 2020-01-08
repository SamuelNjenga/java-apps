package dataStructures;
import java.util.*;

public class CollectionDemo {

    public static void main(String[] args) {
        //Collection c = new ArrayList();

        List<Integer> c = new ArrayList<>();

//        c.add(12);
//        c.add(34);
//        c.add(1);
//        c.add(76);
//        c.add(54);
//        c.remove(34);
//        c.add(9.78);
//        c.add("Samuel");

        Random r = new Random();

        for(int i = 1;i<=100;i++){
            c.add(r.nextInt(10000000));
        }

        Collections.sort(c);
        for(Integer  i:c){
            System.out.println(i);
        }
    }
}
