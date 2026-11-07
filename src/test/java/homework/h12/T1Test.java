package homework.h12;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {

  private final T1 solution = new T1();

  @Test
  void shouldReturnThreeForExampleOne() {

    assertThat(solution.heightChecker(new int[] {1, 1, 4, 2, 1, 3})).isEqualTo(3);
  }

  @Test
  void shouldReturnFiveForExampleTwo() {

    assertThat(solution.heightChecker(new int[] {5, 1, 2, 3, 4})).isEqualTo(5);
  }

  @Test
  void shouldReturnZeroForSortedArray() {

    assertThat(solution.heightChecker(new int[] {1, 2, 3, 4, 5})).isEqualTo(0);
  }

  @Test
  void shouldReturnZeroForEqualHeights() {

    assertThat(solution.heightChecker(new int[] {2, 2, 2})).isEqualTo(0);
  }
}
