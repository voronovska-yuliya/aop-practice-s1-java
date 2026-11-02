package homework.h02;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {

  @Test
  void calculatesAverageWithoutMinimumAndMaximum() {
    assertThat(T1.average(new int[] {4000, 3000, 1000, 2000})).isEqualTo(2500.0);
  }

  @Test
  void calculatesAverageForMinimumAllowedArray() {
    assertThat(T1.average(new int[] {1000, 2000, 3000})).isEqualTo(2000.0);
  }

  @Test
  void calculatesAverageForMaximumSalaryValues() {
    assertThat(T1.average(new int[] {1000000, 1000000, 1000000})).isEqualTo(1000000.0);
  }
}
