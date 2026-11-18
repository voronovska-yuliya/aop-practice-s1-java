package homework.h16;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class T2Test {

  @Test
  void testFindJudgeExample1() {

    T2 solution = new T2();

    int[][] trust = {{1, 2}};

    assertEquals(2, solution.findJudge(2, trust));
  }

  @Test
  void testFindJudgeExample2() {

    T2 solution = new T2();

    int[][] trust = {
      {1, 3},
      {2, 3}
    };

    assertEquals(3, solution.findJudge(3, trust));
  }

  @Test
  void testFindJudgeNoJudge() {

    T2 solution = new T2();

    int[][] trust = {
      {1, 3},
      {2, 3},
      {3, 1}
    };

    assertEquals(-1, solution.findJudge(3, trust));
  }

  @Test
  void testFindJudgeSinglePerson() {

    T2 solution = new T2();

    int[][] trust = {};

    assertEquals(1, solution.findJudge(1, trust));
  }
}
