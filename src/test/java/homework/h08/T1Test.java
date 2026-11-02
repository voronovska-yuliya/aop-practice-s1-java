package homework.h08;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {

  @Test
  void shouldReturnThreeForThreeConsecutiveOnes() {
    assertThat(new T1().findMaxConsecutiveOnes(new int[] {1, 1, 0, 1, 1, 1})).isEqualTo(3);
  }

  @Test
  void shouldReturnTwoForTwoConsecutiveOnes() {
    assertThat(new T1().findMaxConsecutiveOnes(new int[] {1, 0, 1, 1, 0, 1})).isEqualTo(2);
  }

  @Test
  void shouldReturnZeroForAllZeros() {
    assertThat(new T1().findMaxConsecutiveOnes(new int[] {0, 0, 0})).isEqualTo(0);
  }

  @Test
  void shouldReturnArrayLengthForAllOnes() {
    assertThat(new T1().findMaxConsecutiveOnes(new int[] {1, 1, 1})).isEqualTo(3);
  }

  @Test
  void shouldReturnOneForSingleElement() {
    assertThat(new T1().findMaxConsecutiveOnes(new int[] {1})).isEqualTo(1);
  }

  @Test
  void shouldReturnZeroForEmptyArray() {
    assertThat(new T1().findMaxConsecutiveOnes(new int[] {})).isEqualTo(0);
  }
}
