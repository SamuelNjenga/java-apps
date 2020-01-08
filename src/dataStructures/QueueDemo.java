package dataStructures;
public class QueueDemo {
    int queue[] = new int[5];
    int front;
    int rear = 0;
    int size;

    public void enQueue(int data){
        queue[rear] = data;
        rear = (rear + 1)%5;
        size++;

    }

    public int deQueue(){
        int data = queue[front];
        front = (front +1)%5;
        size--;
        return data;

    }

    public void show(){
        System.out.println("Elements are :");
        for(int i = 0;i<size;i++){
            System.out.print(queue[(front + i)%5] +" ");

        }
    }
}
