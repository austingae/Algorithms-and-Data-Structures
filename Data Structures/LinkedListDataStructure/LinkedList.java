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

  void print(Node head) {
    Node currentNode = head;

    while (currentNode != null) {
      System.out.println(currentNode.data);
      currentNode = currentNode.next;
    }
  }

  public static void main(String[] argvs) {
    //Creating LinkedList object.
    LinkedList linkedList = new LinkedList();

    //Creating the nodes: head, node2, and node3
    linkedList.head = new Node(1); //int data = 1; Node next = null;
    Node node2 = new Node(2); //int data = 2; Node next = null;
    Node node3 = new Node(3); //int data = 3; Node next = null;

    //Connecting the nodes to each other
    linkedList.head.next = node2;
    node2.next = node3;


    //Adding a randomNode between node2 and node3
    Node randomNode = new Node(69);
    node2.next = randomNode;
    randomNode.next = node3;

    //Deleting the randomNode between node2 and node3
    node2.next = node3;


    //Printing each node's value
    linkedList.print(linkedList.head);
  }
}

/*
Sources:
Introduction to Linked Lists: https://www.youtube.com/watch?v=WwfhLC16bis&t=1s
How to Implement a Linked List: https://www.programiz.com/dsa/linked-list

Advantages of a Linked List:
- the size of the list can change.
- insertion and deletion of a node only requires breaking the linked list and rejoining it -- and it's quite simple.
*/