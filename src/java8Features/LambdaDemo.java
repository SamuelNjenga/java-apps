package java8Features;
interface A{
    void show(int i);
}
//class Xyz implements A{
//
//     public void show() {
//         System.out.println("Hi there");
//     }
// }
public class LambdaDemo {
    public static void main(String[] args) {

   A obj;

//   obj = new A(){ //Anonymous Inner Class
//       public void show(){
//           System.out.println("Hi there");
//       }
//   };

        obj = (i) ->
        {
                System.out.println("Hi there" +i);

        };
   obj.show(7);
    }
}
