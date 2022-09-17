public class BubbleSort {
  public static void main(String[] argvs) {

    int[] array = {-2, 45, 0, 11, -9};

    int sortedIndex = array.length-1;

    for (int i = 0; i < array.length-1; i++) { //This will run 4 times.
      for (int j = 0; j < sortedIndex; j++) {
        if (array[j] > array[j+1]) {
          int tempValue = array[j];
          array[j] = array[j+1];
          array[j+1] = tempValue;
        }
      }

      sortedIndex = sortedIndex - 1;
    }

    for (int num : array) {
      System.out.println(num);
    }
  }
}

/*
My Thought Process:
i = 0
sortedIndex = array.length - 1 AKA 4
j = 0: {-2, 45, 0, 11, -9}
j = 1: {-2, 0, 45, 11, -9}
j = 2: {-2, 0, 11, 45, -9}
j = 3: {-2, 0, 11, -9, 45}

i = 1
sortedIndex = array.length - 1 - 1 AKA 3
j = 0: {-2, 0, 11, -9, 45}
j = 1: {-2, 0, 11, -9, 45}
j = 2: {-2, 0, -9, 11, 45}

i = 2
sortedIndex = array.length - 1 - 1 - 1 AKA 2
j = 0: {-2, 0, -9, 11, 45}
j = 1: {-2, -9, 0, 11, 45}

i = 3
sortedIndex = array.length - 1 - 1 - 1 - 1 AKA 1
j = 0: {-9, -2, 0, 11, 45}



Natural Language:
1. Compare two items in the array. If the first item > second item, then swap positions. Continue doing this but stop when you come to the index with the sorted item. 
2. Repeat Step 1 until the array has been completely sorted. 

Pseudocode:
for (i = 0; i < array.length-1; i++) {
  largestItemIndex = i
  largestItem = array[largestItemIndex]

  nextItemIndex = i+1
  nextItem = array[nextItemIndex]

  for (j = nextItemIndex; j < array.length-1-i; j++) {
    if (array[j] > array[j+1]) {
      tempValue = array[j]
      array[j] = array[j+1]
      array[j+1] = tempValue

    }else if (array[j] < array[j+1]) {
      //do nothing
    }
  j++
  }

  sortedIndex = array.length

  //After this entire loop, sortedIndex = sortedIndex - 1
}

*/

//Source: https://www.programiz.com/dsa/bubble-sort