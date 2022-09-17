public class BinarySearch {
  public static void main(String[] argv) {
    
    double[] array = {1,4,6,8,12,16,18,19,20,21,25};

    double x = 25;

    double low = 0;
    double high = array.length - 1;
    double middleIndex = Math.ceil((low+high)/2);
    double middleValue = array[(int)middleIndex];


    boolean status = true;
    while (status) {
      //If x == middleValue, then print out the middleIndex.
      if (x == middleValue) {
        System.out.println(middleIndex);
        status = false;
        break;
      } 
      //If x != middleValue, then continue...
      else if (x != middleValue) {
        if (x > middleValue) {
          low = middleIndex + 1;
        }
        else if (x < middleValue) {
          high = middleIndex - 1;
        }
        middleIndex = Math.ceil((low+high)/2);
        middleValue = array[(int)middleIndex];
      }
    }
    
  }
}

/*
    int x = 2;
    int y = 4;
    int answer = x + y; //if x value changes, answer value will remain the same. 
    System.out.println(x + "+" + y + "=" + answer);
    x = 5;
    System.out.println(x + "+" + y + "=" + answer);
*/


/*
Source: https://www.programiz.com/dsa/binary-search
*/