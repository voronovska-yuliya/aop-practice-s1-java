package homework.h02;

// https://leetcode.com/problems/divisible-and-non-divisible-sums-difference/
public class T2 {
  public static int differenceOfSums(int number, int divisor) {
    int notDivisibleSum = 0;
    int divisibleSum = 0;
    for (int i = 1; i <= number; i++) {
      if (i % divisor == 0) {
        divisibleSum += i;
      } else {
        notDivisibleSum += i;
      }
    }
    return notDivisibleSum - divisibleSum;
  }
}
