package homework.h03;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {

  @Test
  void calculatesHammingDistanceForLeetCodeExample() {
    assertThat(T1.hammingDistance(1, 4)).isEqualTo(2);
  }

  @Test
  void returnsZeroForEqualNumbers() {
    assertThat(T1.hammingDistance(0, 0)).isEqualTo(0);
  }

  @Test
  void calculatesDistanceForNumbersWithOneDifferentBit() {
    assertThat(T1.hammingDistance(3, 1)).isEqualTo(1);
  }

  @Test
  void calculatesMaximumHammingDistance() {
    assertThat(T1.hammingDistance(0, 2147483647)).isEqualTo(31);
  }
}
