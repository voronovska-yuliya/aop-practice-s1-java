package homework.h11;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {
  private final T1 solution = new T1();

  @Test
  void shouldReturnTwoForMissingNumberTwo() {
    assertThat(solution.missingNumber(new int[] {3, 0, 1})).isEqualTo(2);
  }

  @Test
  void shouldReturnTwoForMissingNumberTwoInUnorderedArray() {
    assertThat(solution.missingNumber(new int[] {0, 1})).isEqualTo(2);
  }

  @Test
  void shouldReturnEightForMissingNumberEight() {
    assertThat(solution.missingNumber(new int[] {9, 6, 4, 2, 3, 5, 7, 0, 1})).isEqualTo(8);
  }

  @Test
  void shouldReturnZeroWhenFirstNumberIsMissing() {
    assertThat(solution.missingNumber(new int[] {1})).isEqualTo(0);
  }

  @Test
  void shouldReturnOneForTwoElementArray() {
    assertThat(solution.missingNumber(new int[] {0, 2})).isEqualTo(1);
  }
}
