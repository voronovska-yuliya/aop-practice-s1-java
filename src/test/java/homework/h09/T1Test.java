package homework.h09;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {

  @Test
  void shouldCountFourGoodPairs() {
    assertThat(new T1().numIdenticalPairs(new int[] {1, 2, 3, 1, 1, 3})).isEqualTo(4);
  }

  @Test
  void shouldCountSixPairsForFourEqualNumbers() {
    assertThat(new T1().numIdenticalPairs(new int[] {1, 1, 1, 1})).isEqualTo(6);
  }

  @Test
  void shouldReturnZeroForDifferentNumbers() {
    assertThat(new T1().numIdenticalPairs(new int[] {1, 2, 3, 4})).isEqualTo(0);
  }

  @Test
  void shouldReturnZeroForSingleElement() {
    assertThat(new T1().numIdenticalPairs(new int[] {5})).isEqualTo(0);
  }

  @Test
  void shouldReturnZeroForEmptyArray() {
    assertThat(new T1().numIdenticalPairs(new int[] {})).isEqualTo(0);
  }

  @Test
  void shouldCountPairsWithNegativeNumbers() {
    assertThat(new T1().numIdenticalPairs(new int[] {-1, -1, 0, 0, -1})).isEqualTo(4);
  }
}
