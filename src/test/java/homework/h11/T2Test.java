package homework.h11;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {

  private final T2 solution = new T2();

  @Test
  void shouldReturnThreeForMajorityElementThree() {

    assertThat(solution.majorityElement(new int[] {3, 2, 3})).isEqualTo(3);
  }

  @Test
  void shouldReturnTwoForMajorityElementTwo() {

    assertThat(solution.majorityElement(new int[] {2, 2, 1, 1, 1, 2, 2})).isEqualTo(2);
  }

  @Test
  void shouldReturnOneForSingleElementArray() {

    assertThat(solution.majorityElement(new int[] {1})).isEqualTo(1);
  }

  @Test
  void shouldReturnNegativeNumber() {

    assertThat(solution.majorityElement(new int[] {-1, -1, -1, 2, 3})).isEqualTo(-1);
  }

  @Test
  void shouldReturnMajorityElementAtTheEnd() {

    assertThat(solution.majorityElement(new int[] {1, 2, 3, 3, 3})).isEqualTo(3);
  }
}
