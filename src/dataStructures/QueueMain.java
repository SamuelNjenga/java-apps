package dataStructures;
public class QueueMain {
    public static void main(String[] args) {
QueueDemo obj = new QueueDemo();
        obj.enQueue(12);
        obj.enQueue(5);
        obj.enQueue(7);
        obj.enQueue(90);
        obj.enQueue(78);


        obj.deQueue();
        obj.enQueue(43);
obj.show();
    }
}
