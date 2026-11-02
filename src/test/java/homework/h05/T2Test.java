package homework.h05;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {

  @Test
  void shouldReturnSortedSquaresForMixedNumbers() {
    assertThat(new T2().sortedSquares(new int[] {-4, -1, 0, 3, 10}))
        .containsExactly(0, 1, 9, 16, 100);
  }

  @Test
  void shouldReturnSortedSquaresForNegativeAndPositiveNumbers() {
    assertThat(new T2().sortedSquares(new int[] {-7, -3, 2})).containsExactly(4, 9, 49);
  }

  @Test
  void shouldReturnZeroForSingleZero() {
    assertThat(new T2().sortedSquares(new int[] {0})).containsExactly(0);
  }

  @Test
  void shouldReturnSortedSquaresForTwoNumbers() {
    assertThat(new T2().sortedSquares(new int[] {-2, 1})).containsExactly(1, 4);
  }

  @Test
  void shouldReturnEmptyArrayForEmptyInput() {
    assertThat(new T2().sortedSquares(new int[] {})).isEmpty();
  }

  @Test
  void shouldReturnSortedSquaresForSecondExample() {
    assertThat(new T2().sortedSquares(new int[] {-7, -3, 2, 3, 11}))
        .containsExactly(4, 9, 9, 49, 121);
  }
}
