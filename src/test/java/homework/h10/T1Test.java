package homework.h10;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {
  private final T1 solution = new T1();

  @Test
  void shouldReturnAForFirstCharacter() {
    assertThat(solution.kthCharacter(1)).isEqualTo('a');
  }

  @Test
  void shouldReturnBForSecondCharacter() {
    assertThat(solution.kthCharacter(2)).isEqualTo('b');
  }

  @Test
  void shouldReturnBForThirdCharacter() {
    assertThat(solution.kthCharacter(3)).isEqualTo('b');
  }

  @Test
  void shouldReturnCForFourthCharacter() {
    assertThat(solution.kthCharacter(4)).isEqualTo('c');
  }

  @Test
  void shouldReturnBForFifthCharacter() {
    assertThat(solution.kthCharacter(5)).isEqualTo('b');
  }

  @Test
  void shouldReturnCorrectCharacterForLargeK() {
    assertThat(solution.kthCharacter(10)).isEqualTo('c');
  }
}
