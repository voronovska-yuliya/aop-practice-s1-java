package homework.h01;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {

  @Test
  void addsDigitsForLeetCodeExample() {
    assertThat(T1.addDigits(38)).isEqualTo(2);
  }

  @Test
  void returnsZeroForZero() {
    assertThat(T1.addDigits(0)).isEqualTo(0);
  }

  @Test
  void returnsSingleDigitUnchanged() {
    assertThat(T1.addDigits(5)).isEqualTo(5);
  }

  @Test
  void reducesNumberWithTwoDigits() {
    assertThat(T1.addDigits(10)).isEqualTo(1);
  }

  @Test
  void reducesLargeNumber() {
    assertThat(T1.addDigits(999999999)).isEqualTo(9);
  }

  @Test
  void repeatedlyReducesDigitSum() {
    assertThat(T1.addDigits(99)).isEqualTo(9);
  }
}
