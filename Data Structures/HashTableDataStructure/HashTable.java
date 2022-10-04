/*
Hash Table - a data structure in which each item has a key-value pair. Use the key to access the value. 

A hashing function turns the key into an index, so the value can be accessed. 
*/

import java.util.*; 

class HashTable { 
  public static void main(String args[]) 
  {
  Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>(); 
  
  ht.put(123, 432); 
  ht.put(12, 2345);
  ht.put(15, 5643); 
  ht.put(3, 321);

  ht.remove(12);

  System.out.println(ht); 
  System.out.println(ht.get(123));
  } 
} 