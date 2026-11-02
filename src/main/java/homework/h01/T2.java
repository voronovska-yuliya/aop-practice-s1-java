package homework.h01;

// https://leetcode.com/problems/same-after-reversals/
public class T2 {
  public static boolean isSameAfterReversals(int num) {
    if (num == 0) {
      return true;
    }
    return num % 10 != 0;
  }
}
