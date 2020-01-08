package dataStructures;

public class Main {
    public static void main(String[] args) {

        IntStack obj = new IntStack();
        if(!obj.isFull()){
            obj.push(34);
            obj.push(21);
            obj.push(45);
            obj.push(67);
            obj.push(89);
            obj.push(68);
            obj.push(54);

        }
        System.out.println(obj.pop());
        System.out.println(obj.pop());
    }
}
