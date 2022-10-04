class Node {
  int data;
  Node left;
  Node right;

  Node(int data) {
    this.data = data;
    left = null;
    right = null;
  }
}

public class BinaryTree {
  /*
  1. visit all the nodes in the left subtree
  2. then the root node
  3. then visits all the node in the right subtree
  */
  public static void traverseInOrder(Node node) {
    if (node != null) {
      traverseInOrder(node.left);
      System.out.print(" " + node.data);
      traverseInOrder(node.right);
    }
  }

  /*
                  A = 1
                
          B = 2          C = 3

      D = 4    E = 5

  traverseInOrder(A) --> traverseInOrder(B) --> traverseInOrder(D) = 4 
  traverseInOrder(B) --> (traverseInOrder(D) = 4) = 2 --> traverseInOrder(E) --> 5
  traverseInOrder(A) --> 4 -> 2 -> 5 -> 1 -> 3

  

  */

  /*
  1. visit all the node in the left subtree
  2. visit all the node in the right subtree
  3. visit the root node
  */
  public static void traversePostOrder(Node node) {
    if (node != null) {
      traversePostOrder(node.left);
      traversePostOrder(node.right);
      System.out.print(" " + node.data);
    }
  }

  /*
  1. visit the root node
  2. visit all the nodes in the left subtree
  3. visit all the nodes in the right subtree
  */
  public static void traversePreOrder(Node node) {
    if (node != null) {
      System.out.print(" " + node.data);
      traversePreOrder(node.left);
      traversePreOrder(node.right);
    }
  }

  public static void main(String[] argv) {
    /*
                1
                
          2          3

      4       5

  6      7
    */
    Node root = new Node(1);
    
    Node nodeA = new Node(2);
    root.left = nodeA;


    BinaryTree.traverseInOrder(root);
    System.out.println();
    BinaryTree.traversePostOrder(root);
    System.out.println();
    BinaryTree.traversePreOrder(root);
  }
}