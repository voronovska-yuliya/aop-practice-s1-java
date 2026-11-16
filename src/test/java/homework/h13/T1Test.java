package homework.h13;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {

  @Test
  void shouldReturnFourthVersion() {

    T1 solution = new T1(4);

    assertThat(solution.firstBadVersion(5)).isEqualTo(4);
  }

  @Test
  void shouldReturnFirstVersion() {

    T1 solution = new T1(1);

    assertThat(solution.firstBadVersion(5)).isEqualTo(1);
  }

  @Test
  void shouldReturnLastVersion() {

    T1 solution = new T1(5);

    assertThat(solution.firstBadVersion(5)).isEqualTo(5);
  }

  @Test
  void shouldWorkWithLargeNumbers() {

    T1 solution = new T1(1702766719);

    assertThat(solution.firstBadVersion(2126753390)).isEqualTo(1702766719);
  }
}
