public class InsertionSort {
  public static void main(String[] argv) {
    int[] array = {9,5,1,4,3};

    for (int key = 1; key < array.length; key++) {
      int keyValue = array[key];
      int itemIndex = key - 1;

      while (itemIndex >= 0 && keyValue < array[itemIndex]) {
        array[itemIndex + 1] = array[itemIndex];
        itemIndex = itemIndex - 1;
      }
      array[itemIndex + 1] = keyValue;
    }

    for(int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
  }
}

/*
Source: https://www.programiz.com/dsa/insertion-sort
*/