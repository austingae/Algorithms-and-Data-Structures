public class BinarySearch {
    static int binarySearch(int[] arr, int target) {
        int lowIndex = 0;
        int highIndex = arr.length - 1;
        int middleIndex = (lowIndex + highIndex)/2;
        
        while (lowIndex != highIndex) {
            if (arr[middleIndex] == target) {
                return middleIndex;
            } 
            else if (arr[middleIndex] < target) {
                lowIndex = lowIndex + 1;
            }
            else if (arr[middleIndex] > target) {
                highIndex = highIndex - 1;
            }
            
            middleIndex = (lowIndex + highIndex)/2;
        }
        
        if (lowIndex == highIndex && arr[middleIndex] == target) {
            return middleIndex;
        }
        
        return -1;
    }

    public static void main(String[] argv) {
      int[] arr = {2,4,5,8,10,11,15,17};
      int target = 15;
      System.out.println(binarySearch(arr, target));
    }
}


/*
arr = {1,4,6,7,9}
target = 1;
1. Create three variables: lowIndex, highIndex, and middleIndex. 
Set lowIndex = 0; highIndex = arr.length - 1; middleIndex = (lowIndex + highIndex)/2

lowIndex = 0 //0
highIndex = arr.length - 1 //4
middleIndex = (lowIndex + highIndex)/2 //2

       lowIndex           middleIndex       highIndex
arr = {1,       4,        6,       7,       9}

2. Check if arr[middleIndex] ==, <, or > than target.
If arr[middleIndex] == target, return the middleIndex.
If arr[middleIndex] < target, then set lowIndex = middleIndex + 1
If arr[middleIndex] > target, then set highIndex = middleIndex - 1

3. Then set middleIndex = (lowIndex + highIndex)/2

lowIndex = 0
highIndex = 1
middleIndex = (lowIndex + highIndex)/2 //1

       lowIndex      middleIndex       
                     highIndex
arr = {1,            4,             6,            7,            9}

4. Repeat Step 2 and 3.

lowIndex = 0
highIndex = 0
middleIndex = (lowIndex + highIndex)/2 //0

       lowIndex
       middleIndex
       highIndex
arr = {1,            4,             6,            7,            9}

5. Repeat Step 2 and 3.
Since arr[middleIndex == target], return the middleIndex. 
*/


//Source: https://www.programiz.com/dsa/binary-search


/*
LeetCode Binary Search Exercise:
class Solution {
    public int search(int[] arr, int target) {
        int lowIndex = 0;
        int highIndex = arr.length - 1;
        int middleIndex = (lowIndex + highIndex)/2;
        
        while (lowIndex != highIndex) {
            if (arr[middleIndex] == target) {
                return middleIndex;
            } 
            else if (arr[middleIndex] < target) {
                lowIndex = lowIndex + 1;
            }
            else if (arr[middleIndex] > target) {
                highIndex = highIndex - 1;
            }
            
            middleIndex = (lowIndex + highIndex)/2;
        }
        
        if (lowIndex == highIndex && arr[middleIndex] == target) {
            return middleIndex;
        }
        
        return -1;
    }

}

arr = {1,4,6,7,9}
target = 1;
1. Create three variables: lowIndex, highIndex, and middleIndex. 
Set lowIndex = 0; highIndex = arr.length - 1; middleIndex = (lowIndex + highIndex)/2

lowIndex = 0 //0
highIndex = arr.length - 1 //4
middleIndex = (lowIndex + highIndex)/2 //2

       lowIndex           middleIndex       highIndex
arr = {1,       4,        6,       7,       9}

2. Check if arr[middleIndex] ==, <, or > than target.
If arr[middleIndex] == target, return the middleIndex.
If arr[middleIndex] < target, then set lowIndex = middleIndex + 1
If arr[middleIndex] > target, then set highIndex = middleIndex - 1

3. Then set middleIndex = (lowIndex + highIndex)/2

lowIndex = 0
highIndex = 1
middleIndex = (lowIndex + highIndex)/2 //1

       lowIndex      middleIndex       
                     highIndex
arr = {1,            4,             6,            7,            9}

4. Repeat Step 2 and 3.

lowIndex = 0
highIndex = 0
middleIndex = (lowIndex + highIndex)/2 //0

       lowIndex
       middleIndex
       highIndex
arr = {1,            4,             6,            7,            9}

5. Repeat Step 2 and 3.
Since arr[middleIndex == target], return the middleIndex. 


       lowIndex
       middleIndex
       highIndex
arr = {0,            4,             6,            7,            9}

*/
