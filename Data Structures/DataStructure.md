Data Structure - a way to store and organize data.

For technical interviews, knowing which data structure to pick to solve a problem will be asked instead of knowing how to build data structures from scratch (might be asked but rarely).

Which data structure should I pick to solve the problem? For example, I picked the Hash Table to solve the First Unique Character in a String LeetCode exercise. 

Stack - a data structure that follows the Last In, First Out Principle.
[1,2,3,4,5] --> stack.pop() --> [1,2,3,4] --> stack.push(5) --> [1,2,3,4,5]

Regular Queue - a data structure that follows the First In, First Out Principle
Let's say queue's max length = 5
[1,2,3,4] --> queue.dequeue() --> [_,2,3,4] --> queue.enqueue(5) --> [_,2,3,4,5]

Circular Queue - a data structure that follows the First In, First Out Principle. Unlike the regular queue in which queue.dequeue() will not make that index available, circular queue uses modulo (%) to allow those indexes to be available. 
Let's say circular queue's max length = 5
[1,2,3,4,5] --> queue.dequeue() --> [_,2,3,4,5] -> queue.enqueue(6) --> [6,2,3,4,5]

Linked List - a data structure that has nodes. Each node has two variables: the variable that stores the data, and the variable that points to the next node.
              head                                  nodeA                                 nodeB                                 nodeC
[int data = 1, Node next = nodeA] --> [int data = 2, Node next = nodeB] --> [int data = 3, Node next = nodeC] --> [int data = 4, Node next = null]

To access nodeA's data using head, this is what you do: head.next.data

Hash Table - a data structure in which each element has a key-value pair. To access the value, you have to know the key.
["Austin", 20] ["Anna", 18] ["Claudia", 37] ["Kim Tae Ri", 32]
To access the value of "Anna", you have to do this: hashtable.get("Anna")

Binary Tree - a data structure that has nodes. Each node has three variables: the variable that stores the data, the variable that points to the left node, and the variable that points to the right node. Unlike Linked List in which each node can only point to only one node, in Binary Tree, each node can point to at most two nodes. 