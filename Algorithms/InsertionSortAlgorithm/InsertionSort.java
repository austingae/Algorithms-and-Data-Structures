public class InsertionSort {
  static void insertionSort(int[] arr) {
    for (int i = 1; i < arr.length; i++) { //i = 1, 2, 3, 4
      for (int j = i; j > 0; j--) {
        if (arr[j] < arr[j-1]) {
          int temp = arr[j];
          arr[j] = arr[j-1];
          arr[j-1] = temp;
        } 
        else if (arr[j] > arr[j-1]) {
          break;
        }
      }
    }

    for (int num : arr) {
      System.out.print(num);
    }
  }

  public static void main(String[] argv) {
    int[] arr = {5,3,6,4,7};
    insertionSort(arr);
  }
}

/*
Insertion Sort Algorithm - In each iteration, the number swaps with the numbers
to its left that are greater than the number.

1st Iteration: The number at index = 1 swaps with the number to its left that's
greater than the number. 

2nd Iteration: The number at index = 2 swaps with the numbers to its left that are
greater than the number. 

And so on...
*/