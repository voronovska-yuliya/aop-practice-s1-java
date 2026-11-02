package homework.h03;

// https://leetcode.com/problems/hamming-distance/
public class T1 {
  public static int hammingDistance(int firstNumber, int secondNumber) {
    int differentBitsCount = 0;
    while (firstNumber != 0 || secondNumber != 0) {
      if ((firstNumber & 1) != (secondNumber & 1)) {
        differentBitsCount++;
      }
      firstNumber = firstNumber >> 1;
      secondNumber = secondNumber >> 1;
    }
    return differentBitsCount;
  }
}
