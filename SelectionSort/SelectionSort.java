//Selection Sort (Solved all on my own)

public class SelectionSort {
  public static void main(String[] argv) {
    //int[] array = {20, 12, 10, 15, 2};
    int[] array = {20, 5, 6, 12, 10, 9, 10, 15, 2, 200, 100, };

    for (int i = 0; i < array.length - 1; i++) {
      int minimum = array[i];
      int minimumIndex = i;

      for (int j = i + 1; j < array.length; j++) {
        if (minimum > array[j]) {
          minimum = array[j];
          minimumIndex = j;
        }
      }
      array[minimumIndex] = array[i];
      array[i] = minimum;
    }

    for (int num : array) {
      System.out.println(num);
    }
  }
}

/*
Pseudocode:

for (int i = 0; i < array.length-1; i++) {
  minimum = array[i] 
  minimumIndex = i

  for (int j = i+1; j < array.length; j++) {
    if (minimum > array[j]) {
      minimum = array[j]
      minimumIndex = j;
    } 
  }
  array[minimumIndex] = array[index]
  array[index] = minimum
}



Natural Language:

1. Set index = 0.
2. Designate minimum = array[index] aka 20
3. Designate the minimumIndex = index aka 0

4. Compare the minimum with 12. Because minimum > 12, then minimum = 12. set minimumIndex.
5. Compare the minimum with 10. Because minimum > 10, then minimum = 10. set minimumIndex.
6. Compare the minimum with 15. Because minimum < 15, then minimum = 10.
7. Compare the minimum with 2. Because minimum > 10, then minimum = 2. set minimumIndex.

7. Then, array[index] = minimum. 
8. Then, array[minimum's index] = array[index]
9. index++

Result: array = {2, 12, 10, 15, 20}

1. index = 1.
2. minimum = array[index] aka 12
3. minimumIndex = index aka 1

4. Compare the minimum with 10. Because minimum > 10, minimum = 10. set minimumIndex.
5. Compare the minimum with 15. Because minimum < 15, minimum = 10. 
6. Compare the minimum with 20. Because minimum < 20, minimum = 10.

7. Then, array[index] = minimum.
8. Then, array[minimum's index] = array[index]
9. index++

Result: array = {2, 10, 12, 15, 20};

1. index = 2
2. minimum = array[index] aka 12
3. minimumIndex = index aka 2

4. Compare the minimum with 15. Because minimum < 15, minimum = 12. 
5. Compare the minimum with 20. Because minimum < 20, minimum = 12.

6. Then, array[index] = minimum.
7. Then, array[minimum's index] = array[index]
9. index++

Result: array = {2, 10, 12, 15, 20};

1. index = 3
2. minimum = array[index] aka 15
3. minimumIndex = index aka 3

4. Compare minimum with 20. Because minimum < 20, minimum = 15.

5. Then, array[index] = minimum.
6. Then, array[minimum's index] = array[index]
7. index++

Result: array = {2, 10, 12, 15, 20};

index 4 should not even run.

*/