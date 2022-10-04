public class BubbleSort {

  static void bubbleSort(int[] arr) {
    for (int iteration = 1; iteration < arr.length; iteration++) {
      for (int j = 0; j < arr.length - iteration; j++) {
        if (arr[j] > arr[j+1]) {
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }

    for (int num : arr) {
      System.out.print(num + " ");
    }
  }
 
  public static void main(String[] argvs) {2
    int[] arr = {-2, 45, 0, 11, -9};
    bubbleSort(arr);
  }
}

/*
Bubble Sort Algorithm - In each iteration, numbers are compared, and the larger number swaps to the right.

Iteration 1: The numbers are compared, and the largest number will eventually land at index = arr.length - 1
Iteration 2: The numbers are compared (excluding the largest number at index = arr.length - 1), and the largest number will eventually land at index = arr.length - 2
And so on...

*/