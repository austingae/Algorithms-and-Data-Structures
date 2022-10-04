/*
Linked List - a data structure that has nodes. 
Each node has two variables: the variable that stores the data, and the variable that refers to the next node.
*/
class LinkedList {

  Node head;
  
  static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
    }
  }

  static void print(Node head) {
    Node currentNode = head;

    while (currentNode != null) {
      System.out.println(currentNode.data);
      currentNode = currentNode.next;
    }
  }

  void insertItemAtFront(Node newItem, Node head) {
    newItem.next = head;
    this.head = newItem;
  }

  void insertItemAtEnd(Node newItem, Node head) {
    Node currentNode = head;

    while (currentNode.next != null) {
      currentNode = currentNode.next;
    }

    if (currentNode.next == null) {
      currentNode.next = newItem;
    }
  }

  void insertItemAtMiddle(Node newItem, Node head) {
    Node tempNode = head;
    int linkedListLength = 0;
    while (tempNode != null) {
      linkedListLength = linkedListLength + 1;
      tempNode = tempNode.next;
    }

    int middle = linkedListLength/2;
    int count = 0;
    Node currentNode = head;

    while (currentNode != null) {
      count = count + 1;
      
      if (count == middle) {
        newItem.next = currentNode.next;
        currentNode.next = newItem;
      } else {
        currentNode = currentNode.next;
      }
    }
  }

  public static void main(String[] argvs) {
    LinkedList linkedList = new LinkedList();
    linkedList.head = new Node(1);
    Node nodeA = new Node(2);
    Node nodeB = new Node(3);
    
    linkedList.head.next = nodeA;
    nodeA.next = nodeB;

    Node nodeC = new Node(0);
    linkedList.insertItemAtFront(nodeC, linkedList.head);
    print(linkedList.head);
    System.out.println();

    Node nodeD = new Node(4);
    linkedList.insertItemAtEnd(nodeD, linkedList.head);
    print(linkedList.head);

    System.out.println();

    Node nodeE = new Node(5);
    linkedList.insertItemAtMiddle(nodeE, linkedList.head);
    print(linkedList.head);
  }
}

/*
Sources:
Introduction to Linked Lists: https://www.youtube.com/watch?v=WwfhLC16bis&t=1s
How to Implement a Linked List: https://www.programiz.com/dsa/linked-list

Advantages of a Linked List:
- the size of the list can change.
- insertion and deletion of a node only requires breaking the linked list and rejoining it -- and it's quite simple.



So far, I learned about one type of linked list: singly linked list.
There are also doubly linked list and circular linked list.
Singly Linked List - a data structure that have nodes. 
Each node has two variables: the variable that stores the data, and the variable that points to the next node.

Doubly Linked List - a data structure that have nodes.
Each node has three variables: the variable that stores the data, the variable that points to the previous node, and the variable that points to the next node.

Circular Linked List - a data structure that have nodes. 
Each node has two variables: the variable that stores the data, and the variable that points to the next node. 
Unlike the singly linked list, in the the circular linked list, the last node points to the first node, or the head. 
*/


