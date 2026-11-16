package homework.h13;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {

  private final T2 solution = new T2();

  @Test
  void shouldReturnThreeForExampleOne() {

    assertThat(solution.maximumCount(new int[] {-2, -1, -1, 1, 2, 3})).isEqualTo(3);
  }

  @Test
  void shouldReturnThreeForExampleTwo() {

    assertThat(solution.maximumCount(new int[] {-3, -2, -1, 0, 0, 1, 2})).isEqualTo(3);
  }

  @Test
  void shouldReturnFourForExampleThree() {

    assertThat(solution.maximumCount(new int[] {5, 20, 66, 1314})).isEqualTo(4);
  }

  @Test
  void shouldIgnoreZeros() {

    assertThat(solution.maximumCount(new int[] {-1, 0, 0, 1})).isEqualTo(1);
  }
}
