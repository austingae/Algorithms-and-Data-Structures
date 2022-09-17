/*
Queue - a data structure that follows the First In, First Out Principle. This means that the first
item into the queue will also be the first item to exit the queue. 

Queue has a big limitation: once you enqueue, and then dequeue, the index 0 space
cannot be used. Once you enqueue and then dequeue three more times, the indexes -- 0, 1, 2, and 3 -- 
cannot be used, until the queue has been reset. There's a solution to this limitation, and that's 
the circular queue. 

*/
public class Queue {
  private int[] array;
  private int front;
  private int rear;

  private int maxSize;

  public Queue(int size) {
    array = new int[size];
    front = -1;
    rear = -1;

    maxSize = size;
  }

  public void enqueue(int num) {
    if (front == -1 && rear == -1) {
      front = 0;
      rear = 0;
      array[rear] = num;
    }
    else if (rear < maxSize - 1) { //rear < maxSize - 1
      rear++;
      array[rear] = num;
    } 
    else {
      System.out.println("Queue Full.");
    }
  }

  public void dequeue() {
    front = front + 1;
  }

  public void print() {
    for(int i = front; i <= rear; i++) {
      System.out.println(array[i]);
    }
  }

  public static void main(String[] argv) {
    Queue queue = new Queue(5);
    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);
    queue.enqueue(4);
    queue.enqueue(5);

    queue.dequeue();
    queue.dequeue();

    queue.print();

    

  }
}