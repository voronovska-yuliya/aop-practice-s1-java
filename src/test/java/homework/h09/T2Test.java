package homework.h09;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class T2Test {

  @Test
  void shouldReturnExpectedResultForFirstExample() {
    assertThat(new T2().kidsWithCandies(new int[] {2, 3, 5, 1, 3}, 3))
        .isEqualTo(List.of(true, true, true, false, true));
  }

  @Test
  void shouldReturnExpectedResultForSecondExample() {
    assertThat(new T2().kidsWithCandies(new int[] {4, 2, 1, 1, 2}, 1))
        .isEqualTo(List.of(true, false, false, false, false));
  }

  @Test
  void shouldReturnTrueForAllKidsWhenExtraCandiesAreEnough() {
    assertThat(new T2().kidsWithCandies(new int[] {1, 2, 3}, 3))
        .isEqualTo(List.of(true, true, true));
  }

  @Test
  void shouldReturnTrueForKidWithMaximumCandies() {
    assertThat(new T2().kidsWithCandies(new int[] {5, 1, 2}, 0))
        .isEqualTo(List.of(true, false, false));
  }

  @Test
  void shouldHandleEqualNumberOfCandies() {
    assertThat(new T2().kidsWithCandies(new int[] {3, 3, 3}, 0))
        .isEqualTo(List.of(true, true, true));
  }

  @Test
  void shouldReturnEmptyListForEmptyArray() {
    assertThat(new T2().kidsWithCandies(new int[] {}, 5)).isEmpty();
  }
}
