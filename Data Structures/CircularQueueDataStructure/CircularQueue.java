/*
Circular Queue - a data structure, like the regular queue, that follows the First In, First Out Principle.
This queue differs from regular queue in one major aspect: unlike regular queue in which when you dequeue(), the indexes
dequeued are not usuable, circular queue makes the dequeued indexes able to enqueue again! Circular queue
achieves this by using modulo (symbol: %).
*/

public class CircularQueue {
  private int[] array;
  private int front;
  private int rear;

  private int maxSize;

  public CircularQueue(int size) {
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
    else if (!isFull()) {
      rear = rear + 1;
      array[rear%array.length] = num;
    }
  }

  public void dequeue() {
    if (front == -1 && rear == -1) {
      System.out.println("You cannot dequeue an item in a queue that has no items.");
    } else {
      front = front + 1;
    }
  }

  public boolean isFull() {
    if ((rear) - (front) == (array.length - 1)) {
      return true;
    } else {
      return false;
    }
  }

  public void print() {
    if (front != -1 && rear != -1) {
      for(int i = front; i < rear+1; i++) {
        System.out.println(array[i%array.length]);
      } 
    }

  }

  public static void main(String[] argv) {
    CircularQueue queue = new CircularQueue(3);
    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);

    queue.dequeue();
    queue.dequeue();

    queue.enqueue(4);
    queue.enqueue(5);

    queue.dequeue();



    queue.print();
  }
}

/*
Source: https://www.programiz.com/dsa/circular-queue
*/
