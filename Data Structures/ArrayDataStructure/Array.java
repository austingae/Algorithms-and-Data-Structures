public class Array {
  public static void main(String[] argv) {
    int[][][] arr = new int[2][3][3];
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        arr[i][j] = i + j;
      }
    }
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j]);
      }
      System.out.println();
    }
  }


}
/*
int[][] arr = new int[2][3] = arr has two elements, and each element is an array of 3 elements.


int[][][] arr = new int[2][3][4] = arr has two elements, and each element is an array of 3 elements, and each of the 3 elements is an array of 4 elements.
  */