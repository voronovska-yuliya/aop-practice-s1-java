package homework.h08;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class T2Test {

  @Test
  void shouldCountThreePairs() {
    assertThat(new T2().countPairs(List.of(-1, 1, 2, 3, 1), 2)).isEqualTo(3);
  }

  @Test
  void shouldCountOnePair() {
    assertThat(new T2().countPairs(List.of(1, 2, 3), 4)).isEqualTo(1);
  }

  @Test
  void shouldReturnZeroWhenNoPairsMatch() {
    assertThat(new T2().countPairs(List.of(3, 4, 5), 2)).isEqualTo(0);
  }

  @Test
  void shouldReturnZeroForSingleElement() {
    assertThat(new T2().countPairs(List.of(5), 5)).isEqualTo(0);
  }

  @Test
  void shouldCountPairWithEqualElements() {
    assertThat(new T2().countPairs(List.of(1, 1), 3)).isEqualTo(1);
  }

  @Test
  void shouldReturnZeroForEmptyList() {
    assertThat(new T2().countPairs(List.of(), 0)).isEqualTo(0);
  }

  @Test
  void shouldCountAllPairsWithEqualElements() {
    assertThat(new T2().countPairs(List.of(1, 1, 1), 3)).isEqualTo(3);
  }

  @Test
  void shouldCountTenPairsForSecondExample() {
    assertThat(new T2().countPairs(List.of(-6, 2, 5, -2, -7, -1, 3), -2)).isEqualTo(10);
  }
}
