// Quick sort in Java

import java.util.Arrays;

class QuickSort {
  static int partition(int[] array, int low, int high) {
    //I have decided to set my pivot to the array's last element
    int pivot = array[high];

    //swapIndex always begins with -1.
    int swapIndex = (low - 1);

    for (int j = low; j < high; j++) {
      //if array[j] < pivot, then swap array[j] with array[swapIndex]
      if (array[j] < pivot) {
        swapIndex++;

        int temp = array[swapIndex];
        array[swapIndex] = array[j];
        array[j] = temp;
      }

      //else if array[j] > pivot, then do nothing and move on to the next array item
    }

    //at the end, swap the pivot with the swapIndex
    swapIndex++;
    int temp = array[swapIndex];
    array[swapIndex] = array[high];
    array[high] = temp;

    return swapIndex;
  }

  static void quickSort(int[] array, int low, int high) {
    if (low < high) {
      int indexOfPivot = partition(array, low, high);

      quickSort(array, low, indexOfPivot - 1);

      quickSort(array, indexOfPivot + 1, high);
    }
  }
}


// Main class
public class Main extends QuickSort{
  public static void main(String args[]) {
    int[] data = {8,7,6,1,0,2};
    quickSort(data, 0, data.length-1);

    for (int num : data) {
      System.out.print(num + " ");
    }
  }
}