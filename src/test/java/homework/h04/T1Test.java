package homework.h04;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {

  @Test
  void shouldIncrementLastDigit() {
    assertThat(new T1().plusOne(new int[] {1, 2, 3})).containsExactly(1, 2, 4);
  }

  @Test
  void shouldCarryOneToPreviousDigit() {
    assertThat(new T1().plusOne(new int[] {1, 2, 9})).containsExactly(1, 3, 0);
  }

  @Test
  void shouldIncreaseArrayLengthForAllNines() {
    assertThat(new T1().plusOne(new int[] {9, 9})).containsExactly(1, 0, 0);
  }

  @Test
  void shouldReturnOneForZero() {
    assertThat(new T1().plusOne(new int[] {0})).containsExactly(1);
  }

  @Test
  void shouldReturnSameDigitsForDescendingNumber() {
    assertThat(new T1().plusOne(new int[] {4, 3, 2, 1})).containsExactly(4, 3, 2, 2);
  }

  @Test
  void shouldAddDigitForNine() {
    assertThat(new T1().plusOne(new int[] {9})).containsExactly(1, 0);
  }
}
