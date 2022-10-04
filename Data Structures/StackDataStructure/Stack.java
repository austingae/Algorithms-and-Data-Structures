/*
Stack - a data structure that follows the Last In, First Out Principle. This means that
the last element to be pushed into the stack will be the first element to be popped from the stack.
*/

public class Stack {
  private int arr[];
  private int top;
  private int maxSize;

  public Stack(int size) {
    arr = new int[size];
    top = -1;
    maxSize = size;
  }

  //push(int number) pushes the number to the end of the stack.
  public void push(int number) {
    if (top < maxSize - 1) {
      top = top + 1;
      arr[top] = number;
    }
    else {
      System.out.println("You have surpassed the number of array items available.");
    }
  }

  //pop() pops the item at the end of the stack.
  public void pop() {
    if (top != -1) {
      top = top - 1;
    }
  }

  public int size() {
    int size = top + 1;
    return size;
  }

  public void printStack() {
    for (int i = 0; i <= top; i++) {
      System.out.println(arr[i]);
    }
  }

  public void isEmpty() {
    if (top == -1) {
      System.out.println("STACK EMPTY");
    } else if (top > -1) {
      System.out.println("STACK NOT EMPTY");
    }
  }

  public void peek() {
    System.out.println(arr[top]);
  }

  public void isFull() {
    if (top == maxSize - 1) {
      System.out.println("STACK IS FULL.");
    } else {
      System.out.println("STACK IS NOT FULL.");
    }
  }

  public static void main(String[] argv) {
    Stack dataStructure = new Stack(5);
    dataStructure.push(3);
    dataStructure.push(4);
    dataStructure.push(5);
    dataStructure.push(6);
    dataStructure.push(7);
    System.out.println(dataStructure.size());
    dataStructure.pop();
    System.out.println(dataStructure.size());
    dataStructure.printStack();
    dataStructure.peek();
    dataStructure.isFull();
  }

}
/*
Source: https://www.programiz.com/dsa/stack
*/


