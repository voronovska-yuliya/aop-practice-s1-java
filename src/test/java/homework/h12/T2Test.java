package homework.h12;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {

  private final T2 solution = new T2();

  @Test
  void shouldSortArrayAccordingToRelativeOrder() {

    assertThat(
            solution.relativeSortArray(
                new int[] {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19}, new int[] {2, 1, 4, 3, 9, 6}))
        .containsExactly(2, 2, 2, 1, 4, 3, 3, 9, 6, 7, 19);
  }

  @Test
  void shouldSortRemainingElementsInAscendingOrder() {

    assertThat(
            solution.relativeSortArray(new int[] {28, 6, 22, 8, 44, 17}, new int[] {22, 28, 8, 6}))
        .containsExactly(22, 28, 8, 6, 17, 44);
  }

  @Test
  void shouldHandleDuplicateElements() {

    assertThat(solution.relativeSortArray(new int[] {3, 3, 1, 2, 2}, new int[] {2, 3}))
        .containsExactly(2, 2, 3, 3, 1);
  }

  @Test
  void shouldHandleSingleElement() {

    assertThat(solution.relativeSortArray(new int[] {5}, new int[] {5})).containsExactly(5);
  }
}
