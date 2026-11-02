package homework.h04;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {

  @Test
  void shouldReturnLVIIIForFiftyEight() {
    assertThat(new T2().intToRoman(58)).isEqualTo("LVIII");
  }

  @Test
  void shouldReturnIVForFour() {
    assertThat(new T2().intToRoman(4)).isEqualTo("IV");
  }

  @Test
  void shouldReturnMCMXCIVForNineteenNinetyFour() {
    assertThat(new T2().intToRoman(1994)).isEqualTo("MCMXCIV");
  }

  @Test
  void shouldReturnMMMCMXCIXForMaximumValue() {
    assertThat(new T2().intToRoman(3999)).isEqualTo("MMMCMXCIX");
  }

  @Test
  void shouldReturnIForOne() {
    assertThat(new T2().intToRoman(1)).isEqualTo("I");
  }

  @Test
  void shouldReturnIIIForThree() {
    assertThat(new T2().intToRoman(3)).isEqualTo("III");
  }
}
