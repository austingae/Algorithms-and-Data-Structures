public class Recursion {

  public static int factorial(int n) {
    if (n == 0) {
      return 1;
    }
    return n * factorial(n-1);
  }

  public static void main(String[] argvs) {
    int result = factorial(4);
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
- has a base case - when to end the recursion. base case must always be first.
- has a recursion case - the function calls itself. recursion case comes second to base case.
- caution with recursion: uncontrolled recursion leads to memory issue because memory is finite

Iterative Function - a function that loops to repeat part of the code.
*/


power(2,3) = 2 * power(2,2)
power(2,2) = 2 * power(2,1)
power(2,1) = 2 * power(2,0)
power(2,0) = 1
