package homework.h03;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {

  @Test
  void findsComplementForLeetCodeExample() {
    assertThat(T2.findComplement(5)).isEqualTo(2);
  }

  @Test
  void returnsZeroForOne() {
    assertThat(T2.findComplement(1)).isEqualTo(0);
  }

  @Test
  void returnsZeroForAllOnes() {
    assertThat(T2.findComplement(7)).isEqualTo(0);
  }

  @Test
  void findsComplementForTen() {
    assertThat(T2.findComplement(10)).isEqualTo(5);
  }

  @Test
  void findsComplementForMaximumAllowedNumber() {
    assertThat(T2.findComplement(1_000_000_000)).isEqualTo(73_741_823);
  }
}
