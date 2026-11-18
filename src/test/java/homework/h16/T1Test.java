package homework.h16;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class T1Test {

  @Test
  void testFloodFillExample1() {

    T1 solution = new T1();

    int[][] image = {
      {1, 1, 1},
      {1, 1, 0},
      {1, 0, 1}
    };

    int[][] expected = {
      {2, 2, 2},
      {2, 2, 0},
      {2, 0, 1}
    };

    assertArrayEquals(expected, solution.floodFill(image, 1, 1, 2));
  }

  @Test
  void testFloodFillSameColor() {

    T1 solution = new T1();

    int[][] image = {
      {0, 0},
      {0, 1}
    };

    int[][] expected = {
      {0, 0},
      {0, 1}
    };

    assertArrayEquals(expected, solution.floodFill(image, 0, 0, 0));
  }

  @Test
  void testFloodFillSingleCell() {

    T1 solution = new T1();

    int[][] image = {{1}};

    int[][] expected = {{3}};

    assertArrayEquals(expected, solution.floodFill(image, 0, 0, 3));
  }
}
