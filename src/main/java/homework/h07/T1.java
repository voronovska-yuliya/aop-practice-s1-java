package homework.h07;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/fizz-buzz/
public class T1 {
  public List<String> fizzBuzz(int number) {
    List<String> fizzBuzzResults = new ArrayList<>();
    for (int i = 1; i <= number; i++) {
      if (i % 15 == 0) {
        fizzBuzzResults.add("FizzBuzz");
      } else if (i % 3 == 0) {
        fizzBuzzResults.add("Fizz");
      } else if (i % 5 == 0) {
        fizzBuzzResults.add("Buzz");
      } else {
        fizzBuzzResults.add(String.valueOf(i));
      }
    }
    return fizzBuzzResults;
  }
}
