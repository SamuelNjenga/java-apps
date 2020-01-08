package java8Features;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class DemoForEach {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(3,5,7,9);
//     for(int i=0;i<values.size();i++){
//         System.out.println(values.get(i));
//     }

     //Enhanced for loop is an External loop as well as the above one


//        for(int i :values){
//            System.out.println(i);
//        }
        values.forEach(integer -> System.out.println(integer));


    }
}
