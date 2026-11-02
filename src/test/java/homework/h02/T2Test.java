package homework.h02;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {

  @Test
  void shouldReturnNineteenForTenAndThree() {
    assertThat(new T2().differenceOfSums(10, 3)).isEqualTo(19);
  }

  @Test
  void shouldReturnThreeForFiveAndTwo() {
    assertThat(new T2().differenceOfSums(5, 2)).isEqualTo(3);
  }

  @Test
  void shouldReturnFifteenForFiveAndTen() {
    assertThat(new T2().differenceOfSums(5, 10)).isEqualTo(15);
  }

  @Test
  void shouldReturnCorrectDifferenceForMaximumValues() {
    assertThat(new T2().differenceOfSums(1000, 1000)).isEqualTo(498500);
  }

  @Test
  void shouldReturnMinusOneForOneAndOne() {
    assertThat(new T2().differenceOfSums(1, 1)).isEqualTo(-1);
  }

  @Test
  void shouldReturnFifteenForFiveAndSix() {
    assertThat(new T2().differenceOfSums(5, 6)).isEqualTo(15);
  }

  @Test
  void shouldReturnMinusFifteenForFiveAndOne() {
    assertThat(new T2().differenceOfSums(5, 1)).isEqualTo(-15);
  }
}
