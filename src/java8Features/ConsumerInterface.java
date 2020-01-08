package java8Features;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class B implements Consumer<Integer> {
    public void accept(Integer i){
        System.out.println(i);
    }
}
public class ConsumerInterface {
    public static void main(String[] args) {

        List<Integer> values = Arrays.asList(3,5,7,9,8,67,890);
       // values.forEach(i -> System.out.println(i));

//        Consumer<Integer> c = new B();
//       values.forEach(c);


//        Consumer<Integer> c = (Integer integer) ->
//        {
//                System.out.println(integer );
//            }
//        ;

//        Consumer<Integer> c = (integer) ->
//
//            System.out.println(integer );
//
//                ;


        values.forEach((integer) -> System.out.println(integer ));
    }
}
