package java8Features;
interface phone{
    void call();
    default void message(){
        System.out.println("Messaging");
    }
}
 class Android implements phone{
    public void call(){
        System.out.println("Calling");
    }
 }

public class DemoInterface {
    public static void main(String[] args) {
phone obj = new Android();
obj.call();
obj.message();
    }
}
