package homework.h07;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {

  @Test
  void shouldReturnSixStepsForFourteen() {
    assertThat(new T2().numberOfSteps(14)).isEqualTo(6);
  }

  @Test
  void shouldReturnFourStepsForEight() {
    assertThat(new T2().numberOfSteps(8)).isEqualTo(4);
  }

  @Test
  void shouldReturnFiveStepsForSeven() {
    assertThat(new T2().numberOfSteps(7)).isEqualTo(5);
  }

  @Test
  void shouldReturnZeroStepsForZero() {
    assertThat(new T2().numberOfSteps(0)).isEqualTo(0);
  }

  @Test
  void shouldReturnOneStepForOne() {
    assertThat(new T2().numberOfSteps(1)).isEqualTo(1);
  }

  @Test
  void shouldReturnTwelveStepsForOneHundredTwentyThree() {
    assertThat(new T2().numberOfSteps(123)).isEqualTo(12);
  }
}
