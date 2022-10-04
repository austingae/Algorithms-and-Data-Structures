public class SelectionSort {
  static void selectionSort(int[] arr) {
    for (int swapIndex = 0; swapIndex < arr.length - 1; swapIndex++) {
      int minimumIndex = swapIndex;

      for (int i = swapIndex + 1; i < arr.length; i++) {
        if (arr[minimumIndex] > arr[i]) {
          minimumIndex = i;
        }
      }

      int temp = arr[swapIndex];
      arr[swapIndex] = arr[minimumIndex];
      arr[minimumIndex] = temp;
    }

    for (int num : arr) {
      System.out.print(num + " ");
    }
  }

  public static void main(String[] argv) {
    int[] arr = {20, 12, 10, 15, 2};
    selectionSort(arr);
  }
}

/*
Selection Sort - In each iteration, compare the numbers from the unsorted part of the list to find the smallest number, and then place it at beginning index. 
Iteration 1: Compare the numbers from index = 0 to index = arr.length - 1 to find the smallest number, and then replace that number at index = 0.
Iteration 2: Compare the numbers from index = 1 to index = arr.length - 1 to find the smallest number, and then place that number at index = 1.
And so on...

*/