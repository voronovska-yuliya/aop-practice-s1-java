package homework.h07;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {

  @Test
  void shouldReturnFizzBuzzSequence() {
    assertThat(new T1().fizzBuzz(15))
        .containsExactly(
            "1",
            "2",
            "Fizz",
            "4",
            "Buzz",
            "Fizz",
            "7",
            "8",
            "Fizz",
            "Buzz",
            "11",
            "Fizz",
            "13",
            "14",
            "FizzBuzz");
  }

  @Test
  void shouldReturnFizzForThree() {
    assertThat(new T1().fizzBuzz(3)).containsExactly("1", "2", "Fizz");
  }

  @Test
  void shouldReturnBuzzForFive() {
    assertThat(new T1().fizzBuzz(5)).containsExactly("1", "2", "Fizz", "4", "Buzz");
  }

  @Test
  void shouldReturnOneForOne() {
    assertThat(new T1().fizzBuzz(1)).containsExactly("1");
  }

  @Test
  void shouldHandleMaximumConstraint() {
    assertThat(new T1().fizzBuzz(10000)).hasSize(10000).endsWith("Buzz");
  }
}
