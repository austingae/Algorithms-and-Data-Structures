public class Recursion {

  public static int factorial(int n) {
    if (n == 0) {
      return 1;
    }
    return n * factorial(n-1);
  }

  public static void main(String[] argvs) {
    int result = factorial(5);
    System.out.println(result);
  }
}

/*
factorial(4) = 4 * factorial(3)
factorial(3) = 3 * factorial(2)
factorial(2) = 2 * factorial(1)
factorial(1) = 1 * factorial(0)
factorial(0) = 1

factorial(4) = 4 * 3 * 2 * 1 * 1 = 24



Recursive Function - a function that calls itself. 
Iterative Function - a function that loops to repeat part of the code.
*/